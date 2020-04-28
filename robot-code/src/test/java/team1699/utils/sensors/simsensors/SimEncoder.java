package team1699.utils.sensors.simsensors;

import edu.wpi.first.wpilibj.Encoder;

public class SimEncoder extends Encoder {

    private int rotations;
    private double rate;


    public SimEncoder(int channelA, int channelB, boolean reverseDirection) {
        super(channelA, channelB, reverseDirection);
    }
/**
 * Gets rotations in 
 */
@Override
public int get() {
    return rotations;
}
/** 
 * Resets to 0
*/

@Override
public void reset() {

}
/**
 * Gives the rate in Seconds
 */
@Override 
public double getRate() {
    return rate;

}
/**
 * Updates time
 * @param time
 */
public void update(double time) {
    time = rotations * rate;
}
/**
 * Sets rate
 * @param rate
 */
public void setRate(double rate) {
    this.rate = rate;
}

}