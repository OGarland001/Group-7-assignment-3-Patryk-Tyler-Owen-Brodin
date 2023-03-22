package com.CtrlAltDefeat;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor ) {
		this.garageDoor =garageDoor;
	}
	
	@Override
	public void execuet() {
		
		garageDoor.close();
		
	}
	
	@Override
	public void undo()
	{
		System.out.println("Garage Door close has been undone");
		garageDoor.open();
	}
}
