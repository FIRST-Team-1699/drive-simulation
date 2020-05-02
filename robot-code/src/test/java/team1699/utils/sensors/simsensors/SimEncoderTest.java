package team1699.utils.sensors.simsensors;

import org.junit.Test;

import com.ctre.phoenix.motorcontrol.ControlMode;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimEncoderTest {

    private SimEncoder simEncoder;
   
    @Before
    public void setup(){
        simEncoder = new SimEncoder(0, 1, false);
    }
 
 @Test
 public void testRotations(){
     simEncoder.setRate(60);
     assertEquals(60.0, simEncoder.getRate(), .05);
     simEncoder.update(60);
     assertEquals(60*60, simEncoder.get(), 5);

 }


 }
