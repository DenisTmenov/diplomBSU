package com.denis.diplom.queries;

import com.denis.diplom.aircraft.Carcas;
import com.denis.diplom.aircraft.Engine;

public class AircraftQuery {
    private Engine engine;
    private Carcas dimensions;
    private Integer passengersCount;
    private Integer cargoCapacity; // грузоподъемность
    private Integer maxFuelCapacity;
    private Integer maxTakeoffWeight; // максимальный взлетный вес
    private Integer cruiseSpeed;
    private String modelName;
    private Integer maxFlightRange;

    public AircraftQuery() {
    }

    //<editor-fold desc="get & set">
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Carcas getDimensions() {
        return dimensions;
    }

    public void setDimensions(Carcas dimensions) {
        this.dimensions = dimensions;
    }

    public Integer getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(Integer passengersCount) {
        this.passengersCount = passengersCount;
    }

    public Integer getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(Integer cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Integer getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public void setMaxFuelCapacity(Integer maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public Integer getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(Integer maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public Integer getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(Integer cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getMaxFlightRange() {
        return maxFlightRange;
    }

    public void setMaxFlightRange(Integer maxFlightRange) {
        this.maxFlightRange = maxFlightRange;
    }
    //</editor-fold>
}
