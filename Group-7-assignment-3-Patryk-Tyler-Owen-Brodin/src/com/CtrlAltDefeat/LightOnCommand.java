package com.CtrlAltDefeat;

public class LightOnCommand  implements Command
{
	Light light;
	
	public LightOnCommand(Light light)
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
		System.out.println("LightsOn Button Reset");
	}
}
