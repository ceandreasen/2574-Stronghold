package org.usfirst.frc.team2574.generalLee.commands.winch;

import org.usfirst.frc.team2574.generalLee.Robot;
import org.usfirst.frc.team2574.generalLee.subsystems.Winch;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RaiseWait extends Command {

    public RaiseWait() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Winch.set(-.4);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Winch.getPos() >= 3.7;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Winch.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
