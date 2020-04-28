package team1699.utils.simmotors;

import edu.wpi.first.wpilibj.SpeedController;

public class SimSpeedController implements SpeedController {
    private int port;
    private double speed;
    private boolean isInverted;
    
    /**
     * 
     * @param Port the port of the motor
     */
    public SimSpeedController(int Port){
        this.port = Port;
    }


    /**
     * sets speed to the speed variable
     */
    @Override
    public void set(double speed) {
        this.speed = speed; 

    }
    /**
     * gets the speed of the motor and then returns it as speed
     */
    @Override
    public double get() {
        return speed;
    }
    /**
     * sets whether it is inverted or not to a variable
     */
    @Override
    public void setInverted(boolean isInverted) {
        this.isInverted = isInverted;


    }
    /**
     * gets whether it is inverted and sets it to the boolean
     */
    @Override
    public boolean getInverted() {
        return isInverted;
    }

    @Override
    public void disable() {

    }

    @Override
    public void stopMotor() {

    }

    @Override
    public void pidWrite(double output) {

    }
}
