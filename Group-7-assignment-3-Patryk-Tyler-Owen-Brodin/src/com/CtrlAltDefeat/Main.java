package com.CtrlAltDefeat;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
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
			  try 
			  {
				  remoteControl.setCommand(airConditonerONCommand, airConditonerOFFCommand);
				  remoteControl.onButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
		    break;
		  case 2:
			  try 
			  {
				  remoteControl.setCommand(airConditonerONCommand, airConditonerOFFCommand);
				  remoteControl.offButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
		    break;
		  case 3:
			  try 
			  {
				  remoteControl.setCommand(garageDoorOpenCommmand, garageDoorCloseCommand);
				  remoteControl.onButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 4:
			  try 
			  {
				  remoteControl.setCommand(garageDoorOpenCommmand, garageDoorCloseCommand);
				  remoteControl.offButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 5:
			  try 
			  {
				  remoteControl.setCommand(livingRoomLightONCommand, livingRoomLightOFFCommand);
				  remoteControl.onButtonPressed();  
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 6:
			  try 
			  {
				  remoteControl.setCommand(livingRoomLightONCommand, livingRoomLightOFFCommand);
				  remoteControl.offButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 7:
			  try 
			  {
				  remoteControl.setCommand(outdoorLightONCommand, outdoorLightOFFCommand);
				  remoteControl.onButtonPressed();  
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 8:
			  try 
			  {
				  remoteControl.setCommand(outdoorLightONCommand, outdoorLightOFFCommand);
				  remoteControl.offButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 9:
			  try 
			  {
				  remoteControl.setCommand(allLightsONCommand,allLightsOFFCommand);
				  remoteControl.onButtonPressed();  
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 10:
			  try 
			  {
				  remoteControl.setCommand(allLightsONCommand,allLightsOFFCommand);
				  remoteControl.offButtonPressed(); 
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Content");
			  }
			    break;
		  case 11:
			    // unused Slot to be implemented later
			    break;
		  case 12:
			    // unused Slot to be implemented later
			    break;
		  case 13:
			    // undo command
			  try 
			  {
				  remoteControl.undoButtonPressed();
			  }
			  catch (Exception e) 
			  {
				System.out.println("No Button Pressed");
			  }
			  
			    break;
		  case 14:
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
