package com.example.m20_firebase;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.room.Room;
import com.example.m20_firebase.data.AppDatabase;
import com.example.m20_firebase.utils.Constants;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.yandex.mapkit.MapKitFactory;
import dagger.hilt.android.HiltAndroidApp;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/m20_firebase/App;", "Landroid/app/Application;", "()V", "createNotificationChannel", "", "onCreate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    public static com.example.m20_firebase.data.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "test_channel_id";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.m20_firebase.App.Companion Companion = null;
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createNotificationChannel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/m20_firebase/App$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "db", "Lcom/example/m20_firebase/data/AppDatabase;", "getDb", "()Lcom/example/m20_firebase/data/AppDatabase;", "setDb", "(Lcom/example/m20_firebase/data/AppDatabase;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.m20_firebase.data.AppDatabase getDb() {
            return null;
        }
        
        public final void setDb(@org.jetbrains.annotations.NotNull()
        com.example.m20_firebase.data.AppDatabase p0) {
        }
    }
}