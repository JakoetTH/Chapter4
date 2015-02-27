package Chapter4.Impl;

import Chapter4.Aircraft;
import Chapter4.AirlineEquipment;
//Inheritance
public class Helicopter implements Aircraft, AirlineEquipment {
    @Override
    public String fly() {  return "Helicopter is now flying.";}
    @Override
    public String land() {  return "Helicopter is now landing.";}
    @Override
    public String generateSerialNumber() { return "AOE-123";}
}
