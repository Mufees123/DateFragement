package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class Player  extends Service {
   private MediaPlayer m;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        m=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        m.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


       m.start();
       return  1;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        m.stop();
    }
}
