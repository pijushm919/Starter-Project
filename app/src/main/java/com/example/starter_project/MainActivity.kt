package com.example.starter_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starter_project.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}