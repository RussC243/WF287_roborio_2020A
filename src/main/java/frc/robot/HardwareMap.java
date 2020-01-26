package frc.robot;
/**
 This class defines how the roborio is connected to its peripheral hardware
  and what that hardware does.... all in one place rather than buried in each sub system file  
 */
public class HardwareMap {
  //Joystick - This is the IZT brand,  generic USB joystick
  private final int buttonA                  = 1;       // To abstract the functionality, 
  public  final int button_testA             = buttonA; //  alias the private objects with public objects like this
  private final int buttonB                  = 2;
  public  final int buttonB_testB            = buttonB;
  //private final int buttonX                  = 3; 
  //private final int buttonY                  = 4; 
  //private final int buttonBumperLeft         = 5; 
  //private final int buttonBumperRight        = 6; 
  //private final int axisLeftX             = 0; 
  private final int axisLeftY             = 1; 
  public  final int axisTankDriveLeft     = axisLeftY;
  //private final int axisTriggerLeft       = 2; 
  //private final int axisTriggerRight      = 3; 
  //private final int axisRightX            = 4; 
  private final int axisRightY            = 5; 
  public  final int axisTankDriveRight    = axisRightY;
 
  public  final int driveMotorLeft 	= 0 ; //spark 0
  public  final int driveMotorRight  = 1;  //spark 1
 
  /*
  //*************  The following items are  placeholders pasted in from last year*************************

 //map CAN IDs, PWM, DIO here
 

 //Arm motors: Talon SRX  
 public  final int canID_armMotorLeft          = 4;  //can ID 4
 public  final int canID_armMotorRight         = 5;  //can ID 5
 // Pneumatics control module and Power Distribution Panel
 public  final int canID_PCM                   = 6;  //can ID 6
 public  final int canID_PDP                   = 7;  //can ID 7
 //Intake motor: Spark PWM  
 public  final int motorIntake           = 4; //next PWM is at 4 to be common with peanut 
 //Wrist, Spark PWM. 
 public  final int wristMotor            = 5; //PWM 
 //Pneumatic Solonoids value for solenoid values. connected to pneumatic controller, PCM 
 public  final int pnuematic_hatch_pull  = 0;
 public  final int pnuematic_hatch_push  = 1;
 public  final int pneumatic_climb_extend = 2;
 public final int pneumatic_climb_retract = 3;
 // compressors
 public  final int pneumaticCompressor = 0 ;
 // sensors
 public  final int potArm    = 0;
 public  final int potWrist  = 1;

  
  //all of the Point of View (POV aka D-pad) buttons
  //Caution: Pressing two buttons at one time returns 45 degree values.
  //Example: Pressing down and left returns 225. 
  private final int povUp           = 0;
  public  final int povClimbExtend  = povUp;
  private final int povRight        = 90;
  public  final int povHatchPull    = povRight;
  private final int povDown         = 180;
  public  final int povClimbRetract= povDown;
  private final int povLeft         = 270;
  public  final int povHatchPush    = povLeft;
  
  //Power Distribution Panel
  public  final int PDP_driveMotorLeftFront 	= 3;// place holders 
  public  final int PDP_driveMotorLeftRear 	  = 3;  
  public  final int PDP_driveMotorRightFront 	= 3;  
  public  final int PDP_driveMotorRightRear 	= 3;  
  public  final int PDP_armMotorLeft          = 3;  
  public  final int PDP_armMotorRight         = 3;  
  public  final int PDP_intakeMotor           = 3; 
  public  final int PDP_wristMotor            = 3; 
  */
}
