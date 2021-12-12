package com.example.starter_project.models

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(
    var engine:Engine,
    var wheels:Wheels
){
    fun drive(){
        Log.d("Drive", "drive: $wheels $engine")
    }
}