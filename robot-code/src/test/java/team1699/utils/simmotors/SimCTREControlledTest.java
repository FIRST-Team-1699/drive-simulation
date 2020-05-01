package team1699.utils.simmotors;

import com.ctre.phoenix.motorcontrol.ControlMode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimCTREControlledTest {

    private SimCTREControlled simController;

    @Before
    public void setup(){
        simController = new SimCTREControlled(0, "SimController");
    }

    @Test
    public void testPercentOut(){
        simController.set(ControlMode.PercentOutput, 10.0);
        assertEquals(10.0 / 12.0, simController.getPercentOut(), 0.01);
    }

    @Test
    public void testCorrectVoltage(){
        simController.set(ControlMode.PercentOutput, 10.0);
        assertEquals(10.0, simController.getVoltage(), 0.01);
    }

    @Test
    public void testCorrectCurrent(){
        simController.set(ControlMode.Current, 13.0);
        assertEquals(13.0, simController.getCurrent(), 0.01);
    }

    @Test
    public void testSensorValues(){
        simController.setSensorVelocity(50);
        assertEquals(50, simController.getSelectedSensorVelocity());

        int expectedValue = 0;

        for(int i = 0; i <= 10000; i += 10){
            expectedValue += 50 * 10;
            simController.update(10);
            assertEquals(expectedValue, simController.getSelectedSensorPosition());
        }

        simController.setSensorVelocity(10);
        for(int i = 0; i <= 10000; i += 10){
            expectedValue += 10 * 10;
            simController.update(10);
            assertEquals(expectedValue, simController.getSelectedSensorPosition());
        }
    }
}
