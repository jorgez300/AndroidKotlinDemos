package com.demo.multiapp.comun.domain.service

import com.demo.multiapp.comun.ComunGraph
import com.demo.multiapp.comun.database.repository.LocationRepository
import com.demo.multiapp.comun.domain.model.Location

class LocationService {

    private lateinit var _locationRepository: LocationRepository


    constructor(locationRepository: LocationRepository = ComunGraph.locationRepository) {
        _locationRepository = locationRepository

    }

    suspend fun addLocationToDatabase(location: Location) {
        _locationRepository.addLocation(location.ToLocationEntity())

    }

}