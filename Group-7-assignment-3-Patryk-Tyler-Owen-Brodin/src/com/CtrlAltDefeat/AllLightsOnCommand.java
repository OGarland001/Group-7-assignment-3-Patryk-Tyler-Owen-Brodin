package com.CtrlAltDefeat;

public class AllLightsOnCommand implements Command{
	LivingRoomLight light1;
	OutdoorLight light2;
	
	public void LightOnCommand(LivingRoomLight light1, OutdoorLight light2) {
		this.light1 = light1;
		this.light2 = light2;
	}
	
	@Override
	public void execute() {
		light1.on();
		light2.on();	
	}

	@Override
	public void undo() {
		System.out.println("All lights on has been undone");
		light1.off();
		light2.off();
	}

	@Override
	public void reset() {
		System.out.println("AllLightsOn Button Reset");				
	}

}
