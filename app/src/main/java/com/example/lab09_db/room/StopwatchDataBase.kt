package com.example.lab09_db.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lab09_db.model.Stopwatch

@Database(entities = [Stopwatch::class], version = 1, exportSchema = false)
abstract class StopwatchDataBase : RoomDatabase() {
    abstract fun stopDao() : StopwachDataDao
}