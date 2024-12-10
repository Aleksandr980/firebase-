package com.example.m20_firebase.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.m20_firebase.domain.GetGalleryUseCase
import com.example.m20_firebase.entity.Gallery
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject
@HiltViewModel
open class RoomViewModel @Inject constructor(private val getGalleryUseCase: GetGalleryUseCase) : ViewModel() {

    val allGallery = this.getGalleryUseCase.galleryRepository.galleryDao.getAll()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000L),
            initialValue = emptyList()
        )

    suspend fun onAdd(gallery: Gallery) {
        getGalleryUseCase.onAdd(gallery)
    }

    suspend fun onUpdate(gallery: Gallery) {
        getGalleryUseCase.onUpdate(gallery)
    }

    suspend fun onDelete() {
        getGalleryUseCase.onDelete()
    }

    suspend fun onContainsPhoto(photo: String): List<Gallery> {
        return getGalleryUseCase.onContainsPhoto(photo)
    }
    suspend fun onContainsDate(date: String): List<Gallery> {
        return getGalleryUseCase.onContainsDate(date)
    }
}
