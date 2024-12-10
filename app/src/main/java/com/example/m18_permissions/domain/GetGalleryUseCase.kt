package com.example.m18_permissions.domain

import com.example.m18_permissions.data.GalleryRepository
import com.example.m18_permissions.entity.Gallery
import javax.inject.Inject

class GetGalleryUseCase @Inject constructor(val galleryRepository: GalleryRepository) {

    suspend fun onAdd(gallery: Gallery) {
        galleryRepository.onAdd(gallery)
    }

    suspend fun onUpdate(gallery: Gallery) {
        galleryRepository.onUpdate(gallery)
    }

    suspend fun onDelete() {
        galleryRepository.onDelete()
    }

    suspend fun onContainsPhoto(photo: String): List<Gallery> {
        return galleryRepository.onContainsPhoto(photo)
    }

    suspend fun onContainsDate(date: String): List<Gallery> {
        return galleryRepository.onContainsDate(date)
    }
}
