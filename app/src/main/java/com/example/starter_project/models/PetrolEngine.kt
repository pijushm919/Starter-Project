package com.example.starter_project.models

import android.util.Log

class PetrolEngine:Engine {
    companion object{
        private const val TAG = "PetrolEngine"
    }

    override fun start() {
        Log.d(TAG, "start: Petrol")
    }

}