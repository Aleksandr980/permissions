package com.example.m18_permissions.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.m18_permissions.entity.Gallery


@Database(entities = [Gallery::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
   abstract fun galleryDao(): GalleryDao
}
