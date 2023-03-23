package com.CtrlAltDefeat;

public class LightOffCommand  implements Command
{
	Light light;
		
	public LightOffCommand(	Light light) 
	{
		this.light = light;
	}
	
	@Override
	public void execute() 
	{
		light.off();
	}
	
	@Override
	public void undo()
	{
		System.out.println("Light off has been undone");
		light.on();
	}
	
	@Override
	public void reset()
	{
		light = null;
		System.out.println("LightsOff Button Reset");
	}
}
