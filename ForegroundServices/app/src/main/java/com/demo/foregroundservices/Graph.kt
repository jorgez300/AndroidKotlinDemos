package com.demo.foregroundservices

import android.content.Context
import com.demo.foregroundservices.core.LocationHelper

object Graph {

    lateinit var locationHelper: LocationHelper;


    fun provide(Context: Context) {
        locationHelper = LocationHelper(Context)
    }


}