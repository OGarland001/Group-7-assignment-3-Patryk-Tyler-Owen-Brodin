package com.CtrlAltDefeat;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor ) {
		this.garageDoor =garageDoor;
	}
	
	@Override
	public void execute() {
		
		garageDoor.open();
		
	}
	
	@Override
	public void undo()
	{
		System.out.println("Garage Door open has been undone");
		garageDoor.close();
	}
}
