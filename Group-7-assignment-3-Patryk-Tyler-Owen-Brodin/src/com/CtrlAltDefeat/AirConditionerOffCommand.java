package com.CtrlAltDefeat;

public class AirConditionerOffCommand implements Command 
{
	AirConditioner airConditioner;
	
	public AirConditionerOffCommand(AirConditioner airConditioner) 
	{
		this.airConditioner = airConditioner;
	}
	
	@Override
	public void execute() 
	{
		airConditioner.off();
	}
	
	@Override
	public void undo()
	{
		System.out.println("Air Conditioner on has been undone");
		airConditioner.on();
	}
	
	@Override
	public void reset()
	{
		airConditioner = null;
		System.out.println("AirConnditioneroff Button Reset");
	}
}
