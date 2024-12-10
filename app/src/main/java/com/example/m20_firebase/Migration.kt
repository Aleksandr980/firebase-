package com.example.m20_firebase

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_0_1: Migration = object : Migration(0,1) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE gallery ADD COLUMN id")
    }
}
