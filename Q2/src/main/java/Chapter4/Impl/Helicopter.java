package Chapter4.Impl;

import Chapter4.Aircraft;
import Chapter4.AircraftImpl;
import Chapter4.AirlineEquipment;
import Chapter4.AirlineEquipmentImpl;

public class Helicopter {
    //Composition
    public AirlineEquipment airlineequipment = new AirlineEquipmentImpl();
    public Aircraft aircraft = new AircraftImpl();
}
