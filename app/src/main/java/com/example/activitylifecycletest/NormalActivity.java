package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        Intent intent=getIntent();
        Bundle data = intent.getBundleExtra("bundle");
        Log.d("NormalActivity", data.getString("data"));
    }


    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String tempDate = "Something you just typed";
        bundle.putString("data_key", tempDate);
    }
}