package com.azrel.roomdatabase.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)//tidak usah dibuat id akan dibuat sendiri.
    val id : Int = 0,
    val title: String,
    val note: String
)