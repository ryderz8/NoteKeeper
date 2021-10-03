package com.app.notekeeper.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.notekeeper.theme.*

@Entity
data class Note(
    val title : String,
    val content : String,
    val timestamp : Long,
    val color : Int,
    @PrimaryKey val id : Int
){
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)