package com.denis.diplom.aircraft;

import com.denis.diplom.exceptions.CargoException;
import com.denis.diplom.exceptions.CargoTooHeavyException;

import java.util.Objects;

public class CargoAircraft extends Aircraft {
    private static final long serialVersionUID = -3146099536945024359L;

    private Integer cargo;

    public CargoAircraft() {
        super();
        cargo = 0;
    }

    public CargoAircraft(Engine engine, Carcas dimensions, String modelName, Integer passengersCount, Integer bearingCapacity, Integer maxFuelCapacity,
                         Integer maxTakeoffWeight, Integer cruiseSpeed, Integer maxFlightRange) {
        super(engine, dimensions, modelName, passengersCount, bearingCapacity, maxFuelCapacity, maxTakeoffWeight, cruiseSpeed, maxFlightRange);
        cargo = 0;
    }

    public CargoAircraft(Engine engine, Carcas dimensions, String modelName, Integer passengersCount, Integer bearingCapacity, Integer maxFuelCapacity,
                         Integer maxTakeoffWeight, Integer cruiseSpeed, Integer maxFlightRange, Integer cargo) {
        super(engine, dimensions, modelName, passengersCount, bearingCapacity, maxFuelCapacity, maxTakeoffWeight, cruiseSpeed, maxFlightRange);
        this.cargo = cargo;
    }

    public CargoAircraft(String modelName) {
        this(new Engine(), new Carcas(), modelName, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public void flightTo(String destination) {
        System.out.println("Flying to: " + destination);
    }

    @Override
    public void loadCargo(Integer kg) throws CargoException {
        if (kg != null && kg > 0) {
            if ((this.getCargoCapacity() - cargo) <= kg) {
                throw new CargoTooHeavyException("Cargo is too heavy.");
            } else {
                cargo += kg;
                System.out.println("Cargo (" + kg + " kg) loaded successfully.");
            }
        } else {
            throw new CargoException("Cargo can\'t be less than zero.");
        }
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) throws CargoException {
        if (cargo == null) {
            this.cargo = 0;
        } else if (cargo < 0) {
            throw new CargoException("Cargo can\'t be less than zero.");
        } else {
            this.cargo = cargo;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CargoAircraft that = (CargoAircraft) o;
        return Objects.equals(cargo, that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo);
    }

    @Override
    public String toString() {
        return "CargoAircraft{" +
                "cargo=" + cargo +
                ", parent=" + super.toString() +
                '}';
    }
}
