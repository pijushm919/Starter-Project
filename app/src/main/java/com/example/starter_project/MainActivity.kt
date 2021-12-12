package com.example.starter_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starter_project.di.DaggerCarComponent
import com.example.starter_project.models.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.create().inject(this)
        car.drive()
    }
}