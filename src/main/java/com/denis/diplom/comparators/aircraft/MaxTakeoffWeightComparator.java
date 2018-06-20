package com.denis.diplom.comparators.aircraft;

import com.denis.diplom.aircraft.Aircraft;

public class MaxTakeoffWeightComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getMaxTakeoffWeight().compareTo(o2.getMaxTakeoffWeight());
    }
}
