package com.example.starter_project.models

import javax.inject.Inject

class Wheels @Inject constructor(
    val rims:Rims,
    val tires:Tires
)
