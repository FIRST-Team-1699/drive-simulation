package team1699.utils.simmotors;
import com.ctre.phoenix.motorcontrol.ControlMode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimSpeedControllerTest{

    private SimSpeedController simController;

    @Before
    public void setup() {
        simController = new SimSpeedController(0);
    }

    @Test
    public void testIsInverted(){
        simController.setInverted(true);
        assertTrue(simController.getInverted());
    }

    @Test
    public void testSpeed(){
        simController.set(25.5);
        assertEquals(25.5, simController.get(), 0.001);
    }

}