package com.example.newbroadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Vibrator;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        if (intent.getAction().equals("MY_BROADCAST")) {
            // Log.i("msg: ", intent.getAction());
            //Toast.makeText(context, "MY_BROADCAST is received", Toast.LENGTH_LONG).show();
            Toast.makeText(context, "Don't panik but your time is up!!!!.",
                    Toast.LENGTH_LONG).show();
            // Vibrate the mobile phone
            Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(2000);
        } else {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

            boolean isConnected = activeNetwork != null && activeNetwork.isConnected();

            if (isConnected == true) {
                try {
                    Toast.makeText(context, "Network is connected", Toast.LENGTH_LONG).show();

                } catch (Exception e) {
                    Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(context, "Network not available", Toast.LENGTH_LONG).show();
            }
        }
    }
}