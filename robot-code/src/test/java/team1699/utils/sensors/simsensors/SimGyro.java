package team1699.utils.sensors.simsensors;

import edu.wpi.first.wpilibj.GyroBase;

public class SimGyro extends GyroBase {

    private int port, lastCalibration;
    private double rate, angle;

    public SimGyro(int port){
        this.port = port;
    }

    public void update(double dt){

    }

    @Override
    public void calibrate() {

    }

    @Override
    public void reset() {
        //TODO Should reset set rate to 0.0?
    }

    @Override
    public double getAngle() {
        return 0;
    }

    @Override
    public double getRate() {
        return 0;
    }

    @Override
    public void close() throws Exception {

    }
}
