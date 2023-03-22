package com.CtrlAltDefeat;

public class Main {

	public static void main(String[] args) {
		System.out.println("Command Design Pattern ..");
		
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		
		Command lightOnCommand = new LightOnCommand(light);
		
		
		//remoteControl.setCommand(lightOnCommand);
		
		
		//remoteControl.buttonPressed();
		
		//for light off here
		
		Command lightOffCommand = new LightOffCommand(light);
		
		
		//remoteControl.setCommand(lightOffCommand);
		
		
		//remoteControl.buttonPressed();

	}

}
