package com.denis.diplom.interfaces;


import com.denis.diplom.aircraft.Aircraft;

public interface BuilderInt {

    <E extends Aircraft> E buildAircraft(E airCraft);

}
