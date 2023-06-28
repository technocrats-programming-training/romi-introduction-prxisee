// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import static lib.Romi.driveTime;
import static lib.Romi.turnTime;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    // Write your code here:
    System.out.println("Going forwards for two seconds.");
    driveTime(0.8, 2);
    sleepSeconds(0.5);
    turnTime(-0.5, 1);
    driveTime(1, 0.5);
    sleepSeconds(1);
    
  }
}
