/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveCom;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.GateCom;
import frc.robot.commands.NlaunchCom;
import frc.robot.commands.Return;
import frc.robot.commands.chargeCom;
import frc.robot.commands.launchCom;
import frc.robot.subsystems.DriveSub;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.GateSub;
import frc.robot.subsystems.chargeSub;
import frc.robot.subsystems.launchSub;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final DriveSub m_robotDrive = new DriveSub();
  private final GateSub m_gate = new GateSub();
  private final chargeSub m_intake = new chargeSub();
  private final launchSub m_shoot = new launchSub();

  public static final Joystick js = new Joystick(0);


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    m_robotDrive.setDefaultCommand(
      new DriveCom(
        m_robotDrive,
        () -> -js.getY(),
        () -> js.getZ()));
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(js, Button.kA.value)
    .whenHeld(new chargeCom(m_intake));
    new JoystickButton(js, Button.kB.value)
    .whenHeld(new GateCom(m_gate));
    new JoystickButton(js, Button.kX.value)
    .whenPressed(new launchCom(m_shoot));
    new JoystickButton(js, Button.kY.value)
    .whenPressed(new NlaunchCom(m_shoot));
    new JoystickButton(js, Button.kBumperLeft.value)
    .whenHeld(new Return(m_intake));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
