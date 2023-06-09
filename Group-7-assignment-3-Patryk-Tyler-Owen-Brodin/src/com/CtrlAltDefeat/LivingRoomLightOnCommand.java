package com.CtrlAltDefeat;

public class LivingRoomLightOnCommand implements Command
{
	LivingRoomLight light;
		
	public void LightOnCommand(LivingRoomLight light) 
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
		System.out.println("Living Room ligths On Button Reset");
	}
}
