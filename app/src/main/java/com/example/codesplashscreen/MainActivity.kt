package com.example.codesplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(2000)
        setTheme(R.style.Theme_CodeSplashScreen)

        setContentView(R.layout.activity_main)
    }
}