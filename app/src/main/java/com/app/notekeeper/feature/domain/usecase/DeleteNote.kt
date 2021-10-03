package com.app.notekeeper.feature.domain.usecase

import com.app.notekeeper.feature.domain.model.Note
import com.app.notekeeper.feature.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}