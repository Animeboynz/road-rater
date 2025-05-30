package com.roadrater.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CarEntity(
    @PrimaryKey
    val numberPlate: String,
    val make: String,
    val model: String,
    val year: String,
    val lastUpdates: Long,
)
