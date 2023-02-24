package com.example.vc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.vc.databinding.ActivitySplashScreenBinding;

public class splashScreen extends AppCompatActivity {

    private static final String SHARED_PREFS = null;
    private static final String USERNAME_KEY = null ;
    private static final String PASSWORD_KEY = null ;
    private AppBarConfiguration appBarConfiguration;
    private ActivitySplashScreenBinding binding;

    // variable for shared preferences.
    SharedPreferences sharedpreferences;
    String username, password;
    private int timeLoad = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        username = sharedpreferences.getString(USERNAME_KEY, null);
        password = sharedpreferences.getString(PASSWORD_KEY, null);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                    Intent splash=new Intent(SplashScreen.this, MainActivity.class);
//                    startActivity(splash);
//                    finish();
                if (username != null && password != null) {
                    Intent i = new Intent(splashScreen.this, card.class);
                    startActivity(i);

                } else {
                    Intent i = new Intent(splashScreen.this, MainActivity.class);
                    startActivity(i);
                }
                finish();
            }
        }, 1000);
    }
}