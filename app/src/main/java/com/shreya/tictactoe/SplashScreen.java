package com.shreya.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//        getSupportActionBar().hide();


//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    final Intent i = new Intent(SplashScreen.this, MainActivity.class);
//                    startActivity(i);
//                    finish();
//                }
//            }, 1000);

        new Handler().postDelayed(new Runnable() { //This method will be executed once the timer is over
            // Start your app main activity
            @Override
            public void run(){
                final Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, 3000);
//        i.
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }
//
//        Thread thread = run() -> {
//        }
        }
    }
