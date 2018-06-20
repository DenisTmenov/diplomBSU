package com.denis.diplom.aircraft;

import com.denis.diplom.exceptions.CargoException;
import com.denis.diplom.exceptions.CargoTooHeavyException;

import java.util.Objects;

public class PassengerAircraft extends Aircraft {
    private static final long serialVersionUID = 5644978858478451399L;

    private Integer baggage;

    public PassengerAircraft() {
        super();
        baggage = 0;
    }

    public PassengerAircraft(Engine engine, Carcas dimensions, String modelName, Integer passengersCount, Integer bearingCapacity, Integer maxFuelCapacity,
                             Integer maxTakeoffWeight, Integer cruiseSpeed, Integer maxFlightRange) {
        super(engine, dimensions, modelName, passengersCount, bearingCapacity, maxFuelCapacity, maxTakeoffWeight, cruiseSpeed, maxFlightRange);
        baggage = 0;
    }

    public PassengerAircraft(Engine engine, Carcas dimensions, String modelName, Integer passengersCount, Integer bearingCapacity, Integer maxFuelCapacity,
                             Integer maxTakeoffWeight, Integer cruiseSpeed, Integer maxFlightRange, Integer baggage) {
        super(engine, dimensions, modelName, passengersCount, bearingCapacity, maxFuelCapacity, maxTakeoffWeight, cruiseSpeed, maxFlightRange);
        this.baggage = baggage;
    }


    public PassengerAircraft(String modelName) {
        this(new Engine(), new Carcas(), modelName, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public void flightTo(String destination) {
        System.out.println("Flying to: " + destination);
    }

    @Override
    public void loadCargo(Integer kg) throws CargoTooHeavyException, IllegalArgumentException {
        if (kg != null && kg > 0) {
            if ((this.getCargoCapacity() - baggage) <= kg) {
                throw new CargoTooHeavyException("Baggage is too heavy.");
            } else {
                baggage += kg;
                System.out.println("Baggage (" + kg + " kg) loaded successfully.");
            }
        } else {
            throw new IllegalArgumentException(
                    "Baggage can\'t be less than zero.");
        }
    }

    //<editor-fold desc="get & set">
    public Integer getBaggage() {
        return baggage;
    }

    public void setBaggage(Integer baggage) throws CargoException {
        if (baggage == null) {
            this.baggage = 0;
        } else if (baggage < 0) {
            throw new CargoException("Cargo can\'t be less than zero.");
        } else {
            this.baggage = baggage;
        }
    }
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PassengerAircraft that = (PassengerAircraft) o;
        return Objects.equals(baggage, that.baggage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baggage);
    }

    @Override
    public String toString() {
        return "PassengerAircraft{" +
                "baggage=" + baggage +
                ", parent=" + super.toString() +
                '}';
    }
}
