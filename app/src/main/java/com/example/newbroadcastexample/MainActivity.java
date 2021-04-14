package com.example.newbroadcastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnSendBroadCast_Click(View view)
    {

    }

    public void Button_click(View view) {
        Intent intent = new Intent("MY_BROADCAST");
        this.sendBroadcast(intent);
        //this.sendStickyBroadcast(intent);

    }
}