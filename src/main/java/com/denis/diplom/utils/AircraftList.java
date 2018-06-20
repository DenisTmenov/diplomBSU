package com.denis.diplom.utils;

import com.denis.diplom.aircraft.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class AircraftList extends ArrayList<Aircraft> {
    private static final long serialVersionUID = 3217102877728949601L;

    private final static Integer DEFAULT_CAPACITY = 8;

    public AircraftList() {
        super(DEFAULT_CAPACITY);
    }

    public AircraftList(List<Aircraft> list){
        this.addAll(list);
    }

}
