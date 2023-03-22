package com.CtrlAltDefeat;

public class Main {

	public static void main(String[] args) {
		System.out.println("Command Design Pattern ..");
		
		
		RemoteControl remoteControl = new RemoteControl();
		
		//Light light = new Light();
		AirConditioner airConditioner = new AirConditioner();
		LivingRoomLight livingRoomLight = new LivingRoomLight();
		OutdoorLight outdoorLight = new OutdoorLight();
		GarageDoor garageDoor = new GarageDoor();
		
		Command airConditonerONCommand = new AirConditionerOnCommand(airConditioner);
		Command airConditonerOFFCommand = new AirConditionerOnCommand(airConditioner);
		//Command LivingRoomLightONCommand
		//Command lightOnCommand = new LightOnCommand(light);
		
		int Selectionchoice = 0;
		
		
		System.out.println("------ REMOTE CONTROL ------");
		System.out.println("1. Air Conditioner ON");
		System.out.println("2. Air Conditioner OFF");
		System.out.println("3. Garage Door Open");
		System.out.println("4. Garage Door Close");
		System.out.println("5. Living Room Light ON");
		System.out.println("6. Living Room Light OFF");
		System.out.println("7. Outdoor Light ON");
		System.out.println("8. Outdoor Light OFF");
		System.out.println("9. All Lights ON");
		System.out.println("10. All Lights OFF");
		System.out.println("11. Unused ON");
		System.out.println("12. Unused OFF");
		System.out.println("13. Undo");
		System.out.println("14. Reset");
		System.out.println("15. Quit");
		
		boolean running = true;
		
		while(running) {
		switch(Selectionchoice) {
		  case 1:
		    // code block
		    break;
		  case 2:
		    // code block
		    break;
		  case 3:
			    // code block
			    break;
		  case 4:
			    // code block
			    break;
		  case 5:
			    // code block
			    break;
		  case 6:
			    // code block
			    break;
		  case 7:
			    // code block
			    break;
		  case 8:
			    // code block
			    break;
		  case 9:
			    // code block
			    break;
		  case 10:
			    // code block
			    break;
		  case 11:
			    // code block
			    break;
		  case 12:
			    // code block
			    break;
		  case 13:
			    // code block
			    break;
		  case 14:
			    // code block
			    break;
		  case 15:
				System.out.println("Existing Remote Application...");
				running = false;
			    break;
		  default:
		    // code block
		}
	}
		
		//remoteControl.setCommand(lightOnCommand);
		
		
		//remoteControl.buttonPressed();
		
		//for light off here
		
		Command lightOffCommand = new LightOffCommand(light);
		
		
		//remoteControl.setCommand(lightOffCommand);
		
		
		//remoteControl.buttonPressed();

	}

}
