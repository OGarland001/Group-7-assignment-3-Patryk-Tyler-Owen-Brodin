package com.CtrlAltDefeat;

public class OutdoorLight extends Light 
{
	@Override
	public void on() 
	{
		System.out.println("Turn on the Outdoor Light");
	}
	
	@Override
	public void off() 
	{
		System.out.println("Turn off the Outdoor Light");
	}
}
