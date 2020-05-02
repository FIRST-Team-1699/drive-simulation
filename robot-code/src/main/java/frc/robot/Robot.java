package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.trajectory.Trajectory;
import edu.wpi.first.wpilibj.trajectory.TrajectoryUtil;

import java.io.IOException;
import java.nio.file.Path;

public class Robot extends TimedRobot {

    @Override
    public void robotInit() {
    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void autonomousInit() {
        String trajectoryJSONPath = "home/lvuser/deploy/paths/driveToShoot.wpilib.json";
        try {
            Path trajectoryPath = Filesystem.getDeployDirectory().toPath().resolve(trajectoryJSONPath);
            Trajectory trajectory = TrajectoryUtil.fromPathweaverJson(trajectoryPath);
        } catch (IOException e) {
            DriverStation.reportError("Unable to open trajectory: " + trajectoryJSONPath, e.getStackTrace());
        }
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopPeriodic() {

    }

    @Override
    public void testPeriodic() {
        runTest();
    }

    private void runTest() {

    }
}
