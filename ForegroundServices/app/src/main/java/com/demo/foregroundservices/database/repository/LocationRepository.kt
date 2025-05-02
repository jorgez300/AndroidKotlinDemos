package com.demo.foregroundservices.database.repository

import com.demo.foregroundservices.database.dao.LocationDao
import com.demo.foregroundservices.database.entity.LocationEntity
import kotlinx.coroutines.flow.Flow

class LocationRepository(private val locationDao: LocationDao) {

    suspend fun addLocation(location: LocationEntity) {
        locationDao.addLocation(location)
    }

    suspend fun getAllLocations(): Flow<List<LocationEntity>> {
        return locationDao.getAllLocations()
    }


    suspend fun clearLocation() {
        locationDao.clearLocation()
    }


}