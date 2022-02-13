package ClockTower;
/******************
***ClockTower.class
***CS 257 LAB 2A
***Author: Jacob Golden
***Date: Jan. 18, 2020
*********************/



public class ClockTower 
{
	
	//OTHER CLASS VARIABLES
	private static int numClockTowers = 0;
	
	//INSTANCE VARIABLES
	private int hour, numDongs;
	private String name;
	
	
	//CLASS METHODS
	public static int numClockTowers()
	{

		System.out.println("There are currently " + numClockTowers + " clock towers.");
		return numClockTowers;
		
	}
	
	//CONSTRUCTORS
	public ClockTower()
	{
		
		name = "Big Ben";
		hour = 0;
		numClockTowers += 1;
		
	}
	
	public ClockTower(String nameIn)
	{
		
		name = nameIn;
		hour = 0;
		numClockTowers += 1;
		
	}
	
	//INSTANCE METHODS
	public String getName()
	{
		
		return name;
		
	}
	
	public int getHour()
	{
		
		return hour;
		
	}
	
	
	public void setName(String nameIn)
	{
		
		name = nameIn;
		
	}
	
	
	//SERVICE METHODS
	public void advanceClock(int numHours)
	{
		
			for (int i = 0; i < numHours; i++)
				advanceOneHour();
		
	}
	
	//TOSTRING METHOD
	public String toString()
	{
		
		return getName() + " is currently at hour " + getHour() + ":00.";
		
	}
	
	//HELPER/SUPPORT METHODS
	
	private void ringBell(int numDongs)
	{
		
		System.out.print(name + " ");
		System.out.print(hour + ":00 ");
		for(int i = 0; i < numDongs; i++)
		{
			
			System.out.print("DONG ");
			
		}
		
		System.out.println("\n");
		
	}
	
	private void advanceOneHour()
	{
		
		hour += 1;
		if(hour == 12)
		{
			
			numDongs = 2;
			
		}
		else if(hour == 0)
		{
			
			numDongs = 4;
			
		}
		
		else if(hour == 24)
		{
			
			hour = 0;
			numDongs = 4;
			
		}
		
		else
		{
			
			numDongs = 1;
			
		}
		
		ringBell(numDongs);
		
	}
	
	

}//end class ClockTower
