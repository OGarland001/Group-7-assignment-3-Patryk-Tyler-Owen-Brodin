package com.CtrlAltDefeat;

public class AirConditionerOnCommand implements Command {

	AirConditioner airConditioner;
	
	public AirConditionerOnCommand(AirConditioner airConditioner)
	{
		this.airConditioner = airConditioner;
	}
	
	@Override
	public void execute() {
		
		airConditioner.on();
		
	}
	
	@Override
	public void undo()
	{
		System.out.println("Air Conditioner off has been undone");
		airConditioner.off();
	}
}
