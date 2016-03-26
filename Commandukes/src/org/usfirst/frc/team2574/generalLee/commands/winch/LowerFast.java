package org.usfirst.frc.team2574.generalLee.commands.winch;

import org.usfirst.frc.team2574.generalLee.subsystems.Winch;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LowerFast extends Command {

    public LowerFast() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Winch.set(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Winch.getPos() < 1;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
