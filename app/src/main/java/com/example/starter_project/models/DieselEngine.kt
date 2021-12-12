package com.example.starter_project.models

import android.util.Log
import javax.inject.Inject

class DieselEngine :Engine {
    companion object{
        private const val TAG = "DieselEngine"
    }

    override fun start() {
        Log.d(TAG, "start: Diesel")
    }
}