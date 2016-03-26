package org.usfirst.frc.team2574.generalLee.commands.winch;

import org.usfirst.frc.team2574.generalLee.Robot;
import org.usfirst.frc.team2574.generalLee.subsystems.Mast;
import org.usfirst.frc.team2574.generalLee.subsystems.Winch;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MastUp extends Command {

    public MastUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.winch);
    	requires(Robot.mast);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Winch.manual();
    	Winch.ratchetSet(.6);
    	//double time = Timer.getFPGATimestamp();
    	while(Winch.lowLim() ) {
    		Winch.set(.6);
    	}
    	Winch.set(.15);
    	System.out.println("stopped");
    	
    	Winch.initWinch();
    	
    	System.out.println("post init");
    	Winch.set(.1);
    	//Winch.set(-.2);
    	//Mast.initPosPID();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Winch.ratchetSet(0.6);
    	
    	
    	
    	Winch.set(-.4);
    	while(Winch.getPos() < 3.7) {
    		
    	}
    	Winch.set(0);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
