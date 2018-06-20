package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

public class CruiseSpeedComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getCruiseSpeed().compareTo(o2.getCruiseSpeed());
    }
}

