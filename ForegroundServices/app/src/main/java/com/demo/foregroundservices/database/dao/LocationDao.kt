package com.demo.foregroundservices.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.demo.foregroundservices.database.entity.LocationEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class LocationDao {

    @Insert
    abstract fun addLocation(location: LocationEntity)

    @Query("Delete from Location")
    abstract fun clearLocation()

    @Query("Select * from Location order by id desc")
    abstract fun getAllLocations(): Flow<List<LocationEntity>>

}