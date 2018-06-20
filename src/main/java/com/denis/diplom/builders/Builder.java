package com.denis.diplom.builders;

import com.denis.diplom.aircraft.Aircraft;
import com.denis.diplom.interfaces.BuilderInt;
import com.denis.diplom.utils.Utils;

public class Builder implements BuilderInt {
    private static final long serialVersionUID = -4345854930073035926L;

    @Override
    public <E extends Aircraft> E buildAircraft(E airCraft) {
        airCraft.setMaxFlightRange(1000 + Utils.getRand().nextInt(15000));
        airCraft.setCargoCapacity(100 + Utils.getRand().nextInt(1000));
        airCraft.setCruiseSpeed(300 + Utils.getRand().nextInt(1000));
        airCraft.setMaxFuelCapacity(1000 + Utils.getRand().nextInt(8000));
        airCraft.setMaxFlightRange(1000 + Utils.getRand().nextInt(25000));
        airCraft.setMaxTakeoffWeight(1000 + Utils.getRand().nextInt(50000));
        airCraft.setPassengersCount(30 + Utils.getRand().nextInt(800));
        return airCraft;
    }


}
