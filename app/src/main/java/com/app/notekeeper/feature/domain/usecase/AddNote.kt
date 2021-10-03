package com.app.notekeeper.feature.domain.usecase

import com.app.notekeeper.feature.domain.model.InvalidNoteException
import com.app.notekeeper.feature.domain.model.Note
import com.app.notekeeper.feature.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note = note)
    }

}