package com.denis.diplom.utils;

import com.denis.diplom.aircraft.Aircraft;
import com.denis.diplom.company.Airline;
import com.denis.diplom.queries.AircraftQuery;

import java.util.List;
import java.util.stream.Collectors;

public class Searcher {

    public static AircraftList searchAircrafts(AircraftQuery query, Airline airline) {
        List<Aircraft> temp = null;
        if (query != null && airline != null && airline.getAircrafts() != null && !airline.getAircrafts().isEmpty()) {
            temp = airline.getAircrafts();
            if (query.getCargoCapacity() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getCargoCapacity() >= query.getCargoCapacity()).collect(Collectors.toList());
            }
            if (query.getCruiseSpeed() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getCruiseSpeed() >= query.getCruiseSpeed()).collect(Collectors.toList());
            }
            if (query.getMaxFlightRange() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getMaxFlightRange() >= query.getMaxFlightRange()).collect(Collectors.toList());
            }
            if (query.getMaxFuelCapacity() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getMaxFuelCapacity() >= query.getMaxFuelCapacity()).collect(Collectors.toList());
            }
            if (query.getMaxTakeoffWeight() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getMaxTakeoffWeight() >= query.getMaxTakeoffWeight()).collect(Collectors.toList());
            }
            if (query.getPassengersCount() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getPassengersCount() >= query.getPassengersCount()).collect(Collectors.toList());
            }
            if (query.getModelName() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getModelName().equals(query.getModelName())).collect(Collectors.toList());
            }
            if (query.getDimensions() != null) {
                temp =  temp.stream().filter(aircraft ->
                        aircraft.getDimensions().equals(query.getDimensions())).collect(Collectors.toList());
            }
            if (query.getEngine() != null) {
                temp = temp.stream().filter(aircraft ->
                        aircraft.getEngine().equals(query.getEngine())).collect(Collectors.toList());
            }
        }
        return temp==null ? null : new AircraftList(temp);
    }
}
