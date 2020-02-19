/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSub extends SubsystemBase {
  /**
   * Creates a new Drive.
   */
  private final SpeedControllerGroup m_leftMotors =
    new SpeedControllerGroup(new WPI_TalonSRX(DriveConstants.kLeftMotor1Port),
                             new WPI_VictorSPX(DriveConstants.kLeftMotor2Port));
  private final SpeedControllerGroup m_rightMotors =
    new SpeedControllerGroup(new WPI_TalonSRX(DriveConstants.kRightMotor1Port),
                             new WPI_VictorSPX(DriveConstants.kRightMotor2Port));
  
  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors,m_rightMotors);
  
  public DriveSub() {
  }

  public void arcadeDrive(double fwd, double rot){
    m_drive.arcadeDrive(fwd,rot);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
