package com.CtrlAltDefeat;

public class LightOnCommand  implements Command{

	Light light;
	
	
	public LightOnCommand(Light light) {
		
		this.light = light;
	}
	
	@Override
	public void execuet() {
		
		light.on();
		
	}
	
	@Override
	public void undo()
	{
		System.out.println("Light on has been undone");
		light.off();
	}
	
}
