package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

public class ModelNameComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getModelName().compareTo(o2.getModelName());
    }
}
