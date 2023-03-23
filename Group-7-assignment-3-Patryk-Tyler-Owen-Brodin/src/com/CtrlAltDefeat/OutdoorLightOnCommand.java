package com.CtrlAltDefeat;

public class OutdoorLightOnCommand implements Command
{
	OutdoorLight light;
		
	public void LightOnCommand(OutdoorLight light) 
	{
		this.light = light;
	}
	
	@Override
	public void execute() 
	{
		light.on();
	}
	
	@Override
	public void undo()
	{
		System.out.println("Light on has been undone");
		light.off();
	}

	@Override
	public void reset()
	{
		light = null;
		System.out.println("OutdoorLightOn Button Reset");				
	}
}
