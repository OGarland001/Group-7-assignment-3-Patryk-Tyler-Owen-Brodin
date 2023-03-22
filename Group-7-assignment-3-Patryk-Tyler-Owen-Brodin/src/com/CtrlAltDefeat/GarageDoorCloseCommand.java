package com.CtrlAltDefeat;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor ) {
		this.garageDoor =garageDoor;
	}
	
	@Override
	public void execute() {
		
		garageDoor.close();
		
	}
	
	@Override
	public void undo()
	{
		System.out.println("Garage Door close has been undone");
		garageDoor.open();
	}
	
	@Override
	public void reset()
	{
		System.out.println("GarageDoorClose Button Reset");
	}
}
