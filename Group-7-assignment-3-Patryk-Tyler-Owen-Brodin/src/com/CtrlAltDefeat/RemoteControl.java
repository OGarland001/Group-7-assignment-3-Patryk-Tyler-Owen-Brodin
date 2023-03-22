package com.CtrlAltDefeat;

public class RemoteControl {

	//For assignment for reset it means that all buttons on the remote have no command. So like we added an undo to each command we should add a noCommand to each one
	//can and should make Command listOfButtons[];
	private Command slotOnCommand;
	private Command slotOffCommand;
	private Command lastCommand;


	
	public void setCommand(Command slotOnCommand, Command slotOffCommand, Command lastCommand) {
		this.slotOnCommand = slotOnCommand;
		this.slotOffCommand = slotOffCommand;
		this.lastCommand = lastCommand;
	}
	
	public Command getCommand() {
		return lastCommand;
	}
	
	void onButtonPressed() {
		lastCommand = slotOnCommand;
		slotOnCommand.execute();
	}
	
	void offButtonPressed() {
		lastCommand = slotOffCommand;
		slotOffCommand.execute();
	}
	
	void undoButtonPressed() {
		lastCommand.execute();
	}
	

	
}
