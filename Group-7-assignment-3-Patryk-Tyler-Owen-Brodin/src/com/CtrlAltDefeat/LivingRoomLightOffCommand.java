package com.CtrlAltDefeat;

public class LivingRoomLightOffCommand implements Command {
	
	LivingRoomLight light;
	
	
	public void LightOffCommand(LivingRoomLight light) {
		
		this.light = light;
	}
	
	@Override
	public void execute() {
		
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
		System.out.println("Living Room ligths off Button Reset");
	}
	
}
