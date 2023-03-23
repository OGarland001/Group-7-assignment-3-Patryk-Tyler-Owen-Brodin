package com.CtrlAltDefeat;

public class RemoteControl 
{
	private Command slotOnCommand;
	private Command slotOffCommand;
	private Command lastCommand;
		
	public void setCommand(Command slotOnCommand, Command slotOffCommand) 
	{
		this.slotOnCommand = slotOnCommand;
		this.slotOffCommand = slotOffCommand;
	}
	
	public Command getCommand() 
	{
		return lastCommand;
	}
	
	void onButtonPressed() 
	{
		lastCommand = slotOnCommand;
		slotOnCommand.execute();
	}
	
	void offButtonPressed() 
	{
		lastCommand = slotOffCommand;
		slotOffCommand.execute();
	}
	
	void undoButtonPressed() 
	{
		lastCommand.undo();
	}
	
	void resetButtonPressed() 
	{
		slotOffCommand.reset();
		slotOnCommand.reset();
	}	
}
