package team1699.utils.sensors.simsensors;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

   public class SimGyroTest {

    private SimGyro simGyro;

    @Before
    public void setup(){
        simGyro = new SimGyro(0);
    }

    /*
    Tests the rate of rotation
    */
    @Test
    public void testRate(){
        simGyro.setRate(10);
        assertEquals(10, simGyro.getRate(), 0.01);

    }
    /*
    Tests the returned angle
    */
    @Test
    public void testAngle(){
        simGyro.setRate(10);

        int expectedValue = 0;

        for(int i = 0; i <= 10000; i += 10){
            expectedValue += 10 * 10;
            simGyro.update(10);
            assertEquals(expectedValue, simGyro.getAngle(), 0.01);
        }
    System.out.println(expectedValue);
    System.out.println(simGyro.getAngle());
    }
}