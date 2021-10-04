package com.app.notekeeper.di

import android.app.Application
import androidx.room.Room
import com.app.notekeeper.feature.data.repository.NoteRepositoryImpl
import com.app.notekeeper.feature.data.source.NoteDatabase
import com.app.notekeeper.feature.domain.repository.NoteRepository
import com.app.notekeeper.feature.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(app, NoteDatabase::class.java, NoteDatabase.DATABASE_NAME)
            .build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository = repository),
            deleteNote = DeleteNote(repository),
            getNote = GetNote(repository),
            addNote = AddNote(repository)
        )
    }


}