package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

public class EngineComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getEngine().compareTo(o2.getEngine());
    }
}
