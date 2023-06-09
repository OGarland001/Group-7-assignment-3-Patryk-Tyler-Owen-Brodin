package com.CtrlAltDefeat;

public class AllLightsOffCommand implements Command
{
	LivingRoomLight light1;
	OutdoorLight light2;
	
	public AllLightsOffCommand(LivingRoomLight light1, OutdoorLight light2) 
	{
		this.light1 = light1;
		this.light2 = light2;
	}
	
	@Override
	public void execute() 
	{
		light1.off();
		light2.off();
	}

	@Override
	public void undo() 
	{
		System.out.println("All lights off has been undone");
		light1.on();
		light2.on();
	}

	@Override
	public void reset() 
	{
		light1 = null;
		light2 = null;
		System.out.println("AllLightsOff Button Reset");		
	}
}
