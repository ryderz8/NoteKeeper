package com.app.notekeeper.feature.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.notekeeper.feature.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "noteKeeper_db"
    }
}