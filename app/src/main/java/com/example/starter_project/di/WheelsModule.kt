package com.example.starter_project.di

import android.util.Log
import com.example.starter_project.models.Rims
import com.example.starter_project.models.Tires
import com.example.starter_project.models.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    private val TAG = "drive"

    @Provides
    fun getRims(): Rims {
        Log.d(TAG, "getRims: Rims Are injected")
        return Rims()
    }

    @Provides
    fun getTires():Tires{
        Log.d(TAG, "getTires: Tires Are injected")
        return Tires()
    }

    @Provides
    fun getWheels(rims: Rims,tires: Tires):Wheels{
        return Wheels(rims, tires)
    }

}