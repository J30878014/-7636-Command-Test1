/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.GateConstants;

public class GateSub extends SubsystemBase {
  /**
   * Creates a new Gate.
   */
  private final WPI_VictorSPX m_gate = new WPI_VictorSPX(GateConstants.kgateMotorport);
  
  public GateSub() {
  }

  public void gate(){
    m_gate.set(0.5);
  }
  
  public void end() {
    m_gate.set(0);
    
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
