package com.denis.diplom.factory;

import com.denis.diplom.aircraft.CargoAircraft;
import com.denis.diplom.aircraft.PassengerAircraft;

abstract class AbstractFactory {

    abstract public CargoAircraft createRandomCargoAircraft();

    abstract public PassengerAircraft createRandomPassengerAircraft();
}
