package com.example.m20_firebase.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.m20_firebase.entity.Gallery

@Database(entities = [Gallery::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun galleryDao(): GalleryDao
}