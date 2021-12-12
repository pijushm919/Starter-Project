package com.example.starter_project.di

import com.example.starter_project.models.Engine
import com.example.starter_project.models.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineBinding {
    @Binds
    abstract fun bindPetrolEngine(engine: PetrolEngine): Engine
}