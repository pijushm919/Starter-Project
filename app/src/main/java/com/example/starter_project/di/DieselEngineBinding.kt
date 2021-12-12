package com.example.starter_project.di

import com.example.starter_project.models.DieselEngine
import com.example.starter_project.models.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineBinding {
    @Binds
    abstract fun bindDieselEngine(engine:DieselEngine):Engine
}