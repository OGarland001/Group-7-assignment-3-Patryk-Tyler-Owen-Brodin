package com.CtrlAltDefeat;

public class OutdoorLightOffCommand implements Command {
	
	OutdoorLight light;
	
	
	public void LightOffCommand(OutdoorLight light) {
		
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
	public void reset() {
		System.out.println("OutdoorLightOff Button Reset");		
	}
	
	
}
