package com.example.android.pi2;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import java.sql.BatchUpdateException;

public class NotificationApplication extends Application{
    public static final String CHANNEL_1_ID = "channel1";


    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannels();


    }

    private void createNotificationChannels(){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                NotificationChannel channel = new NotificationChannel(CHANNEL_1_ID, "Channel", NotificationManager.IMPORTANCE_HIGH);
                channel.setDescription("Channel de notificações de ingestão");
                NotificationManager manager = getSystemService(NotificationManager.class);
                manager.createNotificationChannel(channel);
            }



    }
}
