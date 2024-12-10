package com.example.m20_firebase

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Room
import com.example.m20_firebase.data.AppDatabase
import com.example.m20_firebase.utils.Constants
import com.google.firebase.crashlytics.BuildConfig
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.yandex.mapkit.MapKitFactory
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(Constants.MY_API_KEY)
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            name = "db"
        )
            .addMigrations(MIGRATION_0_1)
            .build()

       // FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(!BuildConfig.DEBUG)
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)
    }

    companion object {
        lateinit var db: AppDatabase
        const val NOTIFICATION_CHANNEL_ID = "test_channel_id"
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun createNotificationChannel(){
        val name = "Text notification channel"
        val descriptionText = "This is a simple description"
        val importance = NotificationManager.IMPORTANCE_DEFAULT

        val channel = NotificationChannel(NOTIFICATION_CHANNEL_ID, name, importance).apply{
            description = descriptionText
        }

        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}
