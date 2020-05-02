package team1699.utils.sensors.simsensors;

import org.junit.Test;

import com.ctre.phoenix.motorcontrol.ControlMode;
import org.junit.Before;
import org.junit.Test;

import status org.junit.Assert.assertEquals;

public class SimEncoderTest {

    private SimEncoder simEncoder;
   
    @Before
    public void setup(){
        simEncoder = new SimEncoder(0, 0, false);
    }

 @Test
 public void testRate(){
     simEncoder.setRate(60);
     assertEquals(60.0, simEncoder.getRate(), .05);
 }
 
 @Test
 public void testRotations(){
     simEncoder.setRate(60);
     simEncoder.update(60);
     assertEquals(60*60, simEncoder.getRotations(), 5);

 }


 }
