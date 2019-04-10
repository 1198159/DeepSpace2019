package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimbLatchSubsystem extends Subsystem {

	private DoubleSolenoid latchPneumatics = RobotMap.latchPneumatics;

	@Override
	protected void initDefaultCommand() {
	}

	public void OpenLatch() {
		latchPneumatics.set(DoubleSolenoid.Value.kForward);
	}

	public void CloseLatch() {
		latchPneumatics.set(DoubleSolenoid.Value.kReverse);
	}
}