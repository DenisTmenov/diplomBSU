package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

class DimensionsComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getDimensions().compareTo(o2.getDimensions());
    }
}

