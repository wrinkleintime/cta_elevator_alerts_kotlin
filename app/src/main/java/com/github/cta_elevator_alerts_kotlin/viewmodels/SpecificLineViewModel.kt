package com.github.cta_elevator_alerts_kotlin.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import com.github.cta_elevator_alerts_kotlin.model.Station
import com.github.cta_elevator_alerts_kotlin.model.Repository

/**
 * ViewModel between SpecificLineActivity and StationRepository
 *
 * @author Southport Developers (Sam Siner & Tyler Arndt)
 */

class SpecificLineViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: Repository? = Repository.getInstance(application)
    var line: String = ""
        set(value) {
            field = value
            lineStations = repository?.getStationsByLine(value) ?: MutableLiveData(mutableListOf())
        }
    lateinit var lineStations: MutableLiveData<MutableList<Station>>

    val favorites: LiveData<List<Station>>
        get() = repository!!.mGetAllFavorites()

    val allLineAlerts: LiveData<List<Station>>
        get() = repository!!.getAllLineAlerts(line)

    fun buildLines() {
        repository?.buildLines()
    }

//        fun getStationName(stationID: String): String? = repository!!.mGetStationName(stationID)
//    fun getHasElevator(stationID: String): Boolean = repository!!.mGetHasElevator(stationID)
//    fun getIsFavorite(stationID: String): Boolean = repository!!.isFavorite(stationID)
//    fun getHasElevatorAlert(stationID: String): Boolean = repository!!.mGetHasElevatorAlert(stationID)
}