/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bygningsprojekt;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author Tjelle Lenovo V110
 */
public class Buliding extends Unit{

    private List<Sensor> sensors;

    private List<Actuator> actuators;

    public List<Actuator> getActuators() {
        return actuators;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public UUID addTemperatureSensor(String name) {
        return name;
    }

    public UUID addCo2Sensor(String name) {
        return name;
    }

    public void removeSensor(UUID id) {
        return id;
    }

    public UUID addVentActuator(String name) {
        return name;
    }

    public void removeActuator(UUID id) {

    }

}
