package team1699.utils.simmotors;
import com.ctre.phoenix.motorcontrol.ControlMode;
import org.junit.Before;
import org.junit.Test;



public class SimSpeedControllerTest{
    private SimSpeedController simController;
    public void setup() {simController = new SimSpeedController()}

    @BeforeClass
    public void testIsInverted(){
        simController.setInverted(true);
        assertTrue(true, getInverted);



    }
    @BeforeClass
    public void testSpeed(){
        simController.set(ControlMode.speed, 25.5);
        assertEquals(25.5, speed, 0.001);

    }



}