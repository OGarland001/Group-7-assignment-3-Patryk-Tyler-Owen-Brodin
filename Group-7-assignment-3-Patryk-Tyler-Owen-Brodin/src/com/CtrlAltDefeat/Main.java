package com.CtrlAltDefeat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Command Design Pattern ..");
				
		RemoteControl remoteControl = new RemoteControl();
		AirConditioner airConditioner = new AirConditioner();
		LivingRoomLight livingRoomLight = new LivingRoomLight();
		OutdoorLight outdoorLight = new OutdoorLight();
		GarageDoor garageDoor = new GarageDoor();
		
		Command airConditonerONCommand = new AirConditionerOnCommand(airConditioner);
		Command airConditonerOFFCommand = new AirConditionerOffCommand(airConditioner);
		Command garageDoorOpenCommmand = new GarageDoorOpenCommand(garageDoor);
		Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		Command livingRoomLightONCommand = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOFFCommand = new LightOffCommand(livingRoomLight);
		Command outdoorLightONCommand = new LightOnCommand(outdoorLight);
		Command outdoorLightOFFCommand = new LightOffCommand(outdoorLight);
		Command allLightsOFFCommand = new AllLightsOffCommand(livingRoomLight, outdoorLight);
		Command allLightsONCommand = new AllLightsOnCommand(livingRoomLight, outdoorLight);

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
		
		System.out.println("Please enter the corresponding number to the above buttons and use 15 to Quit");
		
		boolean running = true;
		Scanner userInput = new Scanner(System.in);
		
		while(running) {
			
		Selectionchoice = userInput.nextInt();
		
		switch(Selectionchoice) {
		
		  case 1:
			  
			  remoteControl.setCommand(airConditonerONCommand, airConditonerOFFCommand);
			  remoteControl.onButtonPressed();
		    
		    break;
		  case 2:
			  
			  remoteControl.setCommand(airConditonerONCommand, airConditonerOFFCommand);
			  remoteControl.offButtonPressed();
			  
		    break;
		  case 3:
			  remoteControl.setCommand(garageDoorOpenCommmand, garageDoorCloseCommand);
			  remoteControl.onButtonPressed();
			    // code block
			    break;
		  case 4:
			  remoteControl.setCommand(garageDoorOpenCommmand, garageDoorCloseCommand);
			  remoteControl.offButtonPressed();
			    // code block
			    break;
		  case 5:
			  
			  remoteControl.setCommand(livingRoomLightONCommand, livingRoomLightOFFCommand);
			  remoteControl.onButtonPressed();
			  
			    break;
		  case 6:
			  
			  remoteControl.setCommand(livingRoomLightONCommand, livingRoomLightOFFCommand);
			  remoteControl.offButtonPressed();
			  
			    break;
		  case 7:
			  remoteControl.setCommand(outdoorLightONCommand, outdoorLightOFFCommand);
			  remoteControl.onButtonPressed();
			    break;
		  case 8:
			  remoteControl.setCommand(outdoorLightONCommand, outdoorLightOFFCommand);
			  remoteControl.offButtonPressed();
			    break;
		  case 9:
			  remoteControl.setCommand(allLightsONCommand,allLightsOFFCommand);
			  remoteControl.onButtonPressed();
			    break;
		  case 10:
			  remoteControl.setCommand(allLightsONCommand,allLightsOFFCommand);
			  remoteControl.offButtonPressed();
			    break;
		  case 11:
			    // unused Slot to be implemented later
				System.out.println("Unused Slot-No Content");
			    break;
		  case 12:
			    // unused Slot to be implemented later
				System.out.println("Unused Slot-No Content");
			    break;
		  case 13:
			    // undo command
			  try {
				  remoteControl.undoButtonPressed();
			  }
			  catch (Exception e) {
				System.out.println("No Button Pressed");
			  }
			  
			    break;
		  case 14:
			  System.out.println("Remote Buttons Reset");
			  remoteControl.setCommand(airConditonerONCommand, airConditonerOFFCommand);
			  remoteControl.resetButtonPressed();
			  
			  remoteControl.setCommand(garageDoorOpenCommmand, garageDoorCloseCommand);
			  remoteControl.resetButtonPressed();
		
			  remoteControl.setCommand(livingRoomLightONCommand, livingRoomLightOFFCommand);
			  remoteControl.resetButtonPressed();
			  
			  remoteControl.setCommand(outdoorLightONCommand, outdoorLightOFFCommand);
			  remoteControl.resetButtonPressed();
		
			  remoteControl.setCommand(allLightsONCommand,allLightsOFFCommand);
			  remoteControl.resetButtonPressed(); 
			    break;
		  case 15:
				System.out.println("Existing Remote Application...");
				running = false;
			    break;
		  default:
		    System.out.println("Invalid Button Choice");
		    break;
		}
	}
		userInput.close();
	}

}
