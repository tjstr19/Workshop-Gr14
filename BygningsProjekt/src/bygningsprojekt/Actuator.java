/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bygningsprojekt;

/**
 *
 * @author Tjelle Lenovo V110
 */
public class Actuator extends Unit {
    private double Value;

    public double getValue() {
        return Value;
    }

    public void setValue(double Value) {
        this.Value = Value;
    }
}
