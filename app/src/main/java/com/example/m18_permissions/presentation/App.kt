package com.example.m18_permissions.presentation

import android.app.Application
import androidx.room.Room
import com.example.m18_permissions.MIGRATION_0_1
import com.example.m18_permissions.data.AppDatabase
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            name = "db"
        )
            .addMigrations(MIGRATION_0_1)
            .build()


    }

    companion object {
        lateinit var db: AppDatabase
    }
}
