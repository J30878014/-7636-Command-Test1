/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants {
      public static final int kLeftMotor1Port = 9;
      public static final int kLeftMotor2Port = 0;
      public static final int kRightMotor1Port = 7;
      public static final int kRightMotor2Port = 5;
    }
    
    public static final class intakeConstants {
      public static final int kintakeMotorPort = 1;
    }
    
    public static final class GateConstants {
      public static final int kgateMotorport = 6;
    }
    
    public static final class shootConstants {
      public static final int kshootMotorPort = 10;
    }
}
