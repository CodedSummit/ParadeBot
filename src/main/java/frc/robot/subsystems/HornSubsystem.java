// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HornSubsystem extends SubsystemBase {
    private final WPI_VictorSPX  m_rightHorn;
    private final WPI_VictorSPX  m_leftHorn; 

  /** Creates a new HornSubsystem. */
  public HornSubsystem() {
    m_rightHorn = new WPI_VictorSPX (5);
    m_leftHorn = new WPI_VictorSPX (6);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void honkRight(){
    m_rightHorn.set(1);
    m_rightHorn.set(0);
  }

    public void honkLeft(){
    m_leftHorn.set(1);
    m_leftHorn.set(0);
  }
}
