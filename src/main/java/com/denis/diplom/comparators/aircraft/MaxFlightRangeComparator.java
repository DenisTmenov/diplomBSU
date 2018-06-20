package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

public class MaxFlightRangeComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getMaxFlightRange().compareTo(o2.getMaxFlightRange());
    }
}
