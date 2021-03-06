/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.shootConstants;
import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;

public class launchSub extends SubsystemBase {
  /**
   * Creates a new shoot.
   */
  private SupplyCurrentLimitConfiguration supplyCurrentLimitConfiguration = 
  new SupplyCurrentLimitConfiguration(true, 35,40, 1);
  
  private final WPI_TalonSRX m_shoot = new WPI_TalonSRX(shootConstants.kshootMotorPort);

  public launchSub() {
    m_shoot.configSupplyCurrentLimit(supplyCurrentLimitConfiguration);
  }

  public void shoot(){
    m_shoot.set(ControlMode.PercentOutput,-0.9);
    
  }
  
  public void unshoot(){
    m_shoot.set(ControlMode.PercentOutput,0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
