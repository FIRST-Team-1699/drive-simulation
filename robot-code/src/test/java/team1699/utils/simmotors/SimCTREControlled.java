package team1699.utils.simmotors;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.BaseTalon;

/**
 * Used to simulate motors controlled by a CTRE product (Talon SRX, Falcon)
 */
public class SimCTREControlled extends BaseTalon {

    //TODO Add something to allow for use of simEncoder
    private double percentOut, current;
    private int sensorValue, sensorVelocity;

    /**
     * Constructor for BaseTalon object
     *
     * @param deviceNumber CAN Device ID of Device
     * @param model
     */
    public SimCTREControlled(int deviceNumber, String model) {
        super(deviceNumber, model);
    }

    @Override
    public void set(ControlMode mode, double outputValue) {
        if(mode == ControlMode.Current){
            current = outputValue;
        }else if(mode == ControlMode.PercentOutput){
            //TODO Check that this is correct
            percentOut = outputValue / 12.0;
        }
    }

    public void setSensorValue(int sensorValue){
        this.sensorValue = sensorValue;
    }

    public void setSensorVelocity(int sensorVelocity){
        this.sensorVelocity = sensorVelocity;
    }

    @Override
    public int getSelectedSensorPosition() {
        return sensorValue;
    }

    @Override
    public int getSelectedSensorVelocity() {
        return sensorVelocity;
    }

    public double getPercentOut() {
        return percentOut;
    }

    public double getVoltage(){
        return percentOut * 12.0;
    }

    public double getCurrent(){
        return current;
    }
}
