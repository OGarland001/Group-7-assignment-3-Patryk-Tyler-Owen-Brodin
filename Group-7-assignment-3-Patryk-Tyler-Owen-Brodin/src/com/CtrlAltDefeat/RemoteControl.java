package com.CtrlAltDefeat;

public class RemoteControl {

	//For assignment for reset it means that all buttons on the remote have no command. So like we added an undo to each command we should add a noCommand to each one
	private Command slotOnCommand;
	private Command slotOffCommand;
	private Command lastCommand;
	private Command noCommand;
	
	public void setCommand(Command slotOnCommand, Command slotOffCommand) {
		this.slotOnCommand = slotOnCommand;
		this.slotOffCommand = slotOffCommand;
		
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
		lastCommand.undo();
	}
	
	void resetButtonPressed() {
		noCommand.reset();
	}
	

	
}
