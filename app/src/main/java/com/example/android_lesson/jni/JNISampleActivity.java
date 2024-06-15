package com.example.android_lesson.jni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.android_lesson.R;

public class JNISampleActivity extends AppCompatActivity {

    public static final String TAG = "JNISampleActivity";

    public static void start(Context context) {
        Intent intent = new Intent(context, JNISampleActivity.class);
        context.startActivity(intent);
    }

    static {
        System.loadLibrary("native-lib");
    }


    public native String stringFromJni();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni_sample);
        Log.d(TAG, "onCreate: " + stringFromJni());
    }
}