package team1699.utils.sensors.simsensors;

import edu.wpi.first.wpilibj.Encoder;

public class SimEncoder extends Encoder {

    private int rotations;
    private int rate;


    public SimEncoder(int channelA, int channelB, boolean reverseDirection) {
        super(channelA, channelB, reverseDirection);
    }

@Override
public int get() {
    return rotations;
}

@Override
public void reset() {

}

@Override 
public double getRate() {
    return rate;

}

public void update(double time) {
    time = rotations * rate;
}

public void setRate() {
    
}

}