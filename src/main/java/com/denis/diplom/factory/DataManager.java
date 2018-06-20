package com.denis.diplom.factory;

import com.denis.diplom.aircraft.CargoAircraft;
import com.denis.diplom.aircraft.PassengerAircraft;
import com.denis.diplom.builders.Builder;
import com.denis.diplom.utils.Utils;

public class DataManager extends AbstractFactory {
    @Override
    public CargoAircraft createRandomCargoAircraft() {
        return new Builder().buildAircraft(new CargoAircraft("Cargo aircraft - " + (1 + Utils.getRand().nextInt(1000))));
    }

    @Override
    public PassengerAircraft createRandomPassengerAircraft() {
        return new Builder().buildAircraft(new PassengerAircraft("Passenger aircraft - " + (1 + Utils.getRand().nextInt(1000))));
    }
}
