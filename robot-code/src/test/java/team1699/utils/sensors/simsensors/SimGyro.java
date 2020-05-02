package team1699.utils.sensors.simsensors;

import edu.wpi.first.wpilibj.GyroBase;

public class SimGyro extends GyroBase {

    private int port, lastCalibration;
    private double rate, angle;

    public SimGyro(int port){
        this.port = port;
    }
/**
 * Updates the variable rate
 * @param rate is radians per second that robot spins
 */
    public void setRate(double rate){
        this.rate = rate;
    }
/**
 * Updates angle of the gyro
 * @param dt is change in time
 */
    public void update(double dt){
        angle += rate * dt ;
    }

    @Override
    public void calibrate() {

    }

    @Override
    public void reset() {
        //TODO Should reset set rate to 0.0?
    }
/**
 * Returns angle in radians
 */
    @Override
    public double getAngle() {
        return angle;
    }
/**
 * Returns rate in radians per second
 */
    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void close() throws Exception {

    }
}
