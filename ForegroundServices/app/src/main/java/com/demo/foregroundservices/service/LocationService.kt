package com.demo.foregroundservices.service

import com.demo.foregroundservices.Graph

import com.demo.foregroundservices.database.repository.LocationRepository
import com.demo.foregroundservices.model.Location


class LocationService {

    private lateinit var _locationRepository: LocationRepository

    private lateinit var _locationRepository2: LocationRepository

    constructor(locationRepository: LocationRepository = Graph.locationRepository,
                locationRepository2: LocationRepository = Graph.locationRepository2) {
        _locationRepository = locationRepository
        _locationRepository2 = locationRepository2
    }

    suspend fun addLocationToDatabase(location: Location) {
        _locationRepository.addLocation(location.ToLocationEntity())

        _locationRepository2.addLocation(location.ToLocationEntity())
    }

}