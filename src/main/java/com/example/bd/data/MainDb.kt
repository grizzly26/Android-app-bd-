package com.example.bd.data

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [NameEntity::class],
    version = 1

)
abstract class MainDb:RoomDatabase() {
abstract val dao:com.example.bd.data.Dao
    companion object {
        fun createDataBase(context: Context):MainDb{
            return Room.databaseBuilder(
                context,
                MainDb::class.java,
                "test_db"
            ).build()

        }
    }
}