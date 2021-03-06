package com.example.lifttracker.exerciseDatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.lifttracker.logDatabase.Logs
import java.util.*


@Entity(tableName = "exercise_table")
data class NewExercise (
    @PrimaryKey(autoGenerate = true)
    var exerciseID: Long = 0L,

    @ColumnInfo
    var exerciseTitle: String = "",

    @ColumnInfo(name = "equipment")
    var equipment : String = "",

    @ColumnInfo(name = "metric")
    var metric : String = ""
)