package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
        if (savedInstanceState != null) {
            Log.d("DialogActivity", savedInstanceState.getString("data_key")+"sada");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String tempDate = "Something you just typed";
        bundle.putString("data_key", tempDate);
    }
}