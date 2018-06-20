package com.denis.diplom.aircraft;

import com.denis.diplom.interfaces.AircraftInt;
import com.denis.diplom.utils.Utils;

import java.io.Serializable;

public abstract class Aircraft implements AircraftInt, Serializable {

    private static final long serialVersionUID = -8282884139572089197L;
    private Engine engine;
    private com.denis.diplom.aircraft.Carcas dimensions;
    private Integer passengersCount;
    private Integer cargoCapacity; // грузоподъемность
    private Integer maxFuelCapacity;
    private Integer maxTakeoffWeight; // максимальный взлетный вес
    private Integer cruiseSpeed;
    private String modelName;
    private Integer maxFlightRange;

    public Aircraft(){
        engine = new Engine();
        dimensions = new com.denis.diplom.aircraft.Carcas();
        passengersCount = 0;
        cargoCapacity = 0;
        maxFuelCapacity = 0;
        maxTakeoffWeight = 0;
        cruiseSpeed = 0;
        modelName = "Aircraft - " + Utils.getRand().nextInt(1000);
        maxFlightRange = 0;
    }

    public Aircraft(Engine engine, com.denis.diplom.aircraft.Carcas dimensions, String modelName, Integer passengersCount, Integer cargoCapacity, Integer maxFuelCapacity,
                    Integer maxTakeoffWeight, Integer cruiseSpeed, Integer maxFlightRange) {
        this.engine = engine;
        this.dimensions = dimensions;
        this.modelName = modelName;
        this.passengersCount = passengersCount;
        this.cargoCapacity = cargoCapacity;
        this.maxFuelCapacity = maxFuelCapacity;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.cruiseSpeed = cruiseSpeed;
        this.maxFlightRange = maxFlightRange;
    }

    public Aircraft(String modelName) {
        this(new Engine(), new com.denis.diplom.aircraft.Carcas(), modelName, 0, 0, 0, 0, 0, 0);
    }

    //<editor-fold desc="get & set">
    public Engine getEngine() {
        return engine;
    }

    public com.denis.diplom.aircraft.Carcas getDimensions() {
        return dimensions;
    }

    public Integer getPassengersCount() {
        return passengersCount;
    }

    public Integer getCargoCapacity() {
        return cargoCapacity;
    }

    public Integer getMaxFuelCapacity() {
        return maxFuelCapacity;
    }

    public Integer getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public Integer getCruiseSpeed() {
        return cruiseSpeed;
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDimensions(com.denis.diplom.aircraft.Carcas dimensions) {
        this.dimensions = dimensions;
    }

    public void setPassengersCount(Integer passengersCount) {
        this.passengersCount = passengersCount;
    }

    public void setCargoCapacity(Integer cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setMaxFuelCapacity(Integer maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public void setMaxTakeoffWeight(Integer maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public void setCruiseSpeed(Integer cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }
    //</editor-fold>


    @Override
    public String toString() {
        return "Aircraft{" +
                "engine=" + engine +
                ", dimensions=" + dimensions +
                ", passengersCount=" + passengersCount +
                ", cargoCapacity=" + cargoCapacity +
                ", maxFuelCapacity=" + maxFuelCapacity +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", cruiseSpeed=" + cruiseSpeed +
                ", modelName='" + modelName + '\'' +
                ", maxFlightRange=" + maxFlightRange +
                '}';
    }
}
