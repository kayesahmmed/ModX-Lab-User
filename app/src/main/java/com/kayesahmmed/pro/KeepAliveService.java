package com.kayesahmmed.pro;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;

public class KeepAliveService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("keep_alive", "Floating Menu Service", NotificationManager.IMPORTANCE_LOW);
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
            Notification notification = new Notification.Builder(this, "keep_alive")
                    .setContentTitle(AppConfig.MAIN_BRAND_NAME)
                    .setContentText("Floating menu is active")
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .build();
                    
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(1, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
            } else {
                startForeground(1, notification);
            }
        } else {
            Notification notification = new Notification.Builder(this)
                    .setContentTitle(AppConfig.MAIN_BRAND_NAME)
                    .setContentText("Floating menu is active")
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .build();
            startForeground(1, notification);
        }
        return START_STICKY;
    }
}
