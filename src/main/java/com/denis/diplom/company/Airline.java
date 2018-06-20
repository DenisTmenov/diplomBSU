package com.denis.diplom.company;

import com.denis.diplom.aircraft.Aircraft;
import com.denis.diplom.comparators.aircraft.AircraftEnum;
import com.denis.diplom.utils.AircraftList;

public class Airline extends Company {

    private AircraftList aircrafts;

    public Airline(String companyName) {
        super(companyName);
        aircrafts = new AircraftList();
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public AircraftList getAircrafts() {
        return aircrafts != null ? aircrafts : new AircraftList();
    }

    public void sortAircrafrs(AircraftEnum comparator) {
        aircrafts.sort(comparator.get());
    }
}
