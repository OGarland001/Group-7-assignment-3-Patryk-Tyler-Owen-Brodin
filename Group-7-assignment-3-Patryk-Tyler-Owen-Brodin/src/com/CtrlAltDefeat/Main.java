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
		
		System.out.println("   ___________________________________________________");
		System.out.println("  /                                                   \\");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   |      1 AC ON       |   |      2 AC OFF      |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   |    3 GARAGE OPEN   |   |   4 GARAGE CLOSE   |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   | 5 LIV RM LIGHT ON  |   | 6 LIV RM LIGHT OFF |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   | 7 OUT DR LIGHT ON  |   | 8 OUT DR LIGHT OFF |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   | 9   ALL LIGHT ON   |   | 10  ALL LIGHT ON   |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   | 11    UNUSED       |   | 12     UNUSED      |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println(" |    ____________________     ____________________    |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |   | 13     UNDO        |   | 14      RESET      |   |");
		System.out.println(" |   |                    |   |                    |   |");
		System.out.println(" |    --------------------     --------------------    |");
		System.out.println("  \\___________________________________________________/");
		
		System.out.println("Please enter the correspodning number to the above buttons and use 15 to Quit");
		
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
		
		//Command lightOffCommand = new LightOffCommand(light);
		
		
		//remoteControl.setCommand(lightOffCommand);
		
		
		//remoteControl.buttonPressed();

	}

}
