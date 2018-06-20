package com.denis.diplom.utils;

import com.denis.diplom.aircraft.Aircraft;
import com.denis.diplom.company.Airline;

public class Printer {

    public static void showAircraftsAirline(Airline airline) {
        if (airline != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
            sb.append("aircrafts:").append("\n\t\t");
            airline.getAircrafts().forEach(aircraft -> {
                sb.append(aircraft.toString()).append("\n\t\t");
            });
            System.out.println(sb.toString());
        } else {
            System.out.println("Airline is empty");
        }
    }

    public static void showAircrafts(AircraftList aircraftList) {
        if (aircraftList != null && aircraftList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Aircrafts:").append("\n\t\t");
            aircraftList.forEach(aircraft -> {
                sb.append(aircraft.toString()).append("\n\t\t");
            });
            System.out.println(sb.toString());
        } else {
            System.out.println("AircraftList is empty");
        }
    }

    public static void showFullPassengersCountAirline(Airline airline) {
        if (airline != null) {
            Integer passengersCount = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
            sb.append("aircrafts = ").append(airline.getAircrafts().size()).append("\n\t");
            for (Aircraft aircraft : airline.getAircrafts()) {
                passengersCount += aircraft.getPassengersCount();
            }
            sb.append("passengers = ").append(passengersCount);
            System.out.println(sb.toString());
        } else {
            System.out.println("Airline is empty");
        }
    }

    public static void showFullCargoAirline(Airline airline) {
        if (airline != null) {
            Integer cargoCapacity = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
            sb.append("aircrafts = ").append(airline.getAircrafts().size()).append("\n\t");
            for (Aircraft aircraft : airline.getAircrafts()) {
                cargoCapacity += aircraft.getCargoCapacity();
            }
            sb.append("cargo capacity = ").append(cargoCapacity);
            System.out.println(sb.toString());
        } else {
            System.out.println("Airline is empty");
        }
    }

    public static void showEachAircraftMaxFlightRange(Airline airline) {
        if (airline != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
            for (Aircraft aircraft : airline.getAircrafts()) {
                sb.append("Aircraft -> ").append(aircraft.getModelName()).append("\n\t\t");
                sb.append("flight range = ").append(aircraft.getMaxFlightRange()).append("\n\t");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("Airline is empty");
        }
    }


}
