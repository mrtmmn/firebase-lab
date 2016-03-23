package com.example.maratmamin.chat;

import com.firebase.client.Firebase;

/**
 * Created by maratmamin on 3/23/16.
 */
public class ChatApp extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
