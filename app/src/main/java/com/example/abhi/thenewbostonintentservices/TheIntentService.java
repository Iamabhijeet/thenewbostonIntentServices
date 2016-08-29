package com.example.abhi.thenewbostonintentservices;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by abhi on 29-08-2016.
 */
public class TheIntentService extends IntentService {
    public static final String TAG = "com.example.abhi.thenewbostonintentservices";


    public TheIntentService() {
        super("TheIntentService");
    }

    @SuppressLint("LongLogTag")

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.i(TAG,"Intent now started.");

    }

//    @SuppressLint("LongLogTag")





}

