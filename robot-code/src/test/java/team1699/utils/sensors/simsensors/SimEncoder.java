package team1699.utils.sensors.simsensors;

import edu.wpi.first.wpilibj.Encoder;

public class SimEncoder extends Encoder {

    public SimEncoder(int channelA, int channelB, boolean reverseDirection) {
        super(channelA, channelB, reverseDirection);
    }
}
