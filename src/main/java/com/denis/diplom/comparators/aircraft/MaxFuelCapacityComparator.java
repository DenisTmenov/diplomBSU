package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

public class MaxFuelCapacityComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getMaxFuelCapacity().compareTo(o2.getMaxFuelCapacity());
    }
}
