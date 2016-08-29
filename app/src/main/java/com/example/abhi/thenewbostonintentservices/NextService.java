package com.example.abhi.thenewbostonintentservices;




import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by abhi on 29-08-2016.
 */

    public class NextService extends Service {
        public static final String TAG = "info.glwhiitney.nbv41services";

        public NextService() {
        }

        @Override
        public int onStartCommand(Intent intent, int flags, int startId) {

            Log.i(TAG,"next service called");
            Runnable r = new Runnable() {
                @Override
                public void run() {

                    for (int i = 0; i < 5; i++) {
                        long futureTime = (System.currentTimeMillis() + 5000);

                        while (System.currentTimeMillis() < futureTime) {

                            synchronized (this) {
                                try {
                                    wait(futureTime - System.currentTimeMillis());
                                    Log.i(TAG, "Next loop "+ i + " finished");
                                } catch (Exception e) {

                                }
                            }
                        }
                    }
                }
            };
            // start the thread
            Thread nextSThread = new Thread(r);
            nextSThread.start();
            return Service.START_STICKY; // restarts the service if it gets destroyed.
        }

        @SuppressLint("LongLogTag")
        @Override
        public void onDestroy() {
            //Removed default super
            Log.i(TAG,"L42 onDestroy called");
        }

        @Override
        public IBinder onBind(Intent intent) {

            return null;
        }
    }
