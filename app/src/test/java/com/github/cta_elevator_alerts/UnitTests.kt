package com.github.cta_elevator_alerts

import com.github.cta_elevator_alerts_kotlin.model.Station
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Unit tests for model - Station (entity) class.
 */

@RunWith(JUnit4::class)
class UnitTests {

    @Test
    fun testStationClass() {
        val station = Station("40900")
        assertEquals(station.name, "")
        assertEquals(station.shortDescription, "")
        assertEquals(station.nickname, "")
        assertFalse(station.hasElevator)
        assertFalse(station.hasElevatorAlert)
        assertFalse(station.isFavorite)

        station.hasElevator = true
        station.name = "Howard"
        station.hasElevatorAlert = true
        station.shortDescription = "short description"

        assertEquals(station.name, "Howard")
        assertEquals(station.shortDescription, "short description")
        assertEquals(station.nickname, "")
    }
}