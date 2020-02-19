/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.intakeConstants;
//import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;

public class chargeSub extends SubsystemBase {
  /**
   * Creates a new intakeSub.
   */
  //private SupplyCurrentLimitConfiguration supplyCurrentLimitConfiguration = 
  //new SupplyCurrentLimitConfiguration(true, 35,40, 1);

  private final WPI_VictorSPX m_intake1 = new WPI_VictorSPX(intakeConstants.kintakeMotorPort);
  
  public chargeSub(){
    //m_intake1.configSupplyCurrentLimit(supplyCurrentLimitConfiguration);
  }
  public void intake() {
    m_intake1.set(-0.5);
  }

  public void end() {
    m_intake1.set(0);
  }

  public void back(){
    m_intake1.set(0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
