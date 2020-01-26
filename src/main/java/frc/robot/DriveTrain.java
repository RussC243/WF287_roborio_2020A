package frc.robot;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.*;

/**
 * Add your docs here.
*/
public class DriveTrain 
{
  Spark           driveLeft;
  Spark           driveRight;
  HardwareMap hMap;
  SpeedController leftSpeedGroup; 
  SpeedController rightSpeedGroup;
  DifferentialDrive diffDrive;
  double DRIVE_SCALE = 0.99;
  
  public DriveTrain()//constructor
  {
    hMap = new HardwareMap();
    driveLeft	= new Spark(hMap.driveMotorLeft);
    driveRight	= new Spark(hMap.driveMotorRight);
    diffDrive = new DifferentialDrive(driveLeft,driveRight);
    //driveLeftFront  = new VictorSP(hMap.canID_driveMotorLeftFront);
    //driveLeftRear   = new WPI_TalonSRX(hMap.canID_driveMotorLeftRear);
    //driveRightFront = new WPI_TalonSRX(hMap.canID_driveMotorRightFront);
    //driveRightRear  = new WPI_TalonSRX(hMap.canID_driveMotorRightRear);
    //leftSpeedGroup = new SpeedControllerGroup(driveLeftFront, driveLeftRear);; 
    //rightSpeedGroup = new SpeedControllerGroup(driveRightFront, driveRightRear);;
    //diffDrive = new DifferentialDrive(leftSpeedGroup,rightSpeedGroup);
    diffDrive.setSafetyEnabled(false);
  }
  public void drive(double left, double right)
  {
     if(Math.abs(left)>0.1 || Math.abs(right)>0.1) //don't creep
     {
        diffDrive.tankDrive(left*DRIVE_SCALE,right*DRIVE_SCALE);
     }
     else
     {
        diffDrive.tankDrive(0,0);
     }
  }
}
