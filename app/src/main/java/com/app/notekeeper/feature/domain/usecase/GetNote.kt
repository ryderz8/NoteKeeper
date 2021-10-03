package com.app.notekeeper.feature.domain.usecase

import com.app.notekeeper.feature.domain.model.Note
import com.app.notekeeper.feature.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}