package com.example.foregroundservice30032020;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null){
            Toast.makeText(this, intent.getStringExtra("chuoi"), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "onStart Command", Toast.LENGTH_SHORT).show();
        }
        return START_REDELIVER_INTENT;
    }
}
