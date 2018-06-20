package com.denis.diplom.comparators.aircraft;

public enum AircraftEnum {
    CARGO_CAPACITY(new CargoCapacityComparator()), CRUISER_SPEED(new CruiseSpeedComparator()), DIMENSIONS(new DimensionsComparator()),
    ENGINE(new EngineComparator()), MAX_FLIGHT_RANGE(new MaxFlightRangeComparator()), MAX_FUEL_CAPACITY(new MaxFuelCapacityComparator()),
    MAX_TAKEOFF_WEIGHT(new MaxTakeoffWeightComparator()), MODEL_NAME(new ModelNameComparator()), PASSENGER_COUNT(new PassengersCountComparator());

    private AircraftComparator comparator;

    AircraftEnum(AircraftComparator comparator) {
        this.comparator = comparator;
    }

    public AircraftComparator get() {
        return comparator;
    }

}
