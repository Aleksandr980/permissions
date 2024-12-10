package com.example.m18_permissions.presentation


import com.example.m18_permissions.data.GalleryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DaoModule  {
    @Singleton
    @Provides
   fun bindsGalleryDao (): GalleryDao {
        return App.db.galleryDao()
    }
}