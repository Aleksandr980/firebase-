package com.example.m20_firebase.data

import kotlinx.coroutines.flow.Flow
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.m20_firebase.entity.Gallery

@Dao
interface GalleryDao {
    @Query("SELECT * FROM gallery ")
    fun getAll(): Flow<List<Gallery>>

    @Insert(entity = Gallery::class)
    suspend fun insert(gallery: Gallery)

    @Query("DELETE FROM gallery")
    suspend fun delete()

    @Update
    suspend  fun update(gallery: Gallery)

    @Query("SELECT * FROM gallery WHERE photo LIKE :photo")
    suspend fun containsPhoto(photo: String): List<Gallery>

    @Query("SELECT * FROM gallery WHERE date LIKE :date")
    suspend fun containsDate(date: String): List<Gallery>
}