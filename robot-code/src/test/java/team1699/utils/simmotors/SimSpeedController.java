package team1699.utils.simmotors;

import edu.wpi.first.wpilibj.SpeedController;

public class SimSpeedController implements SpeedController {
    int port;
    double speed;
    boolean isInverted;
    
    public SimSpeedController(int Port){
        this.port = Port;
    }


    
    @Override
    public void set(double speed) {
        this.speed = speed; 

    }

    @Override
    public double get() {
        return 0;
    }

    @Override
    public void setInverted(boolean isInverted) {
        this.isInverted = isInverted;


    }

    @Override
    public boolean getInverted() {
        return false;
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
