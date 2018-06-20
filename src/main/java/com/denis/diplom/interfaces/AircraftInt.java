package com.denis.diplom.interfaces;


import com.denis.diplom.exceptions.CargoTooHeavyException;

public interface AircraftInt {
    void flightTo(String destination);

    void loadCargo(Integer weight) throws CargoTooHeavyException;
}
