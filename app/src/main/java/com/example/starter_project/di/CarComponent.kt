package com.example.starter_project.di

import com.example.starter_project.MainActivity
import com.example.starter_project.models.Car
import dagger.Component

@Component(modules = [WheelsModule::class, EngineModule::class, DieselEngineBinding::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}