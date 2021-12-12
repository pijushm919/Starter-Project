package com.example.starter_project.di

import com.example.starter_project.models.DieselEngine
import com.example.starter_project.models.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class EngineModule {

    @Provides
    fun getDieselEngine() = DieselEngine()

    @Provides
    fun getPetrolEngine() = PetrolEngine()
}