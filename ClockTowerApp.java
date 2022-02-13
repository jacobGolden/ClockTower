package ClockTower;
/******************
***ClockTowerApp.java
***CS 257 LAB 2B
***Author: Jacob Golden
***Date: Jan. 18, 2020
*********************/

import java.util.Scanner;

public class ClockTowerApp 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		//declare variables
		int numHours;
		
		//output num clocktowers
		ClockTower.numClockTowers();
		
		//create clocktower default constructor
		ClockTower ct1 = new ClockTower();
		
		//create clocktower spasskaya tower
		ClockTower ct2 = new ClockTower("Spasskaya Tower");
		
		//output state of each clocktower
		System.out.println(ct1);
		System.out.println(ct2);
		
		//input positive numHours
		do
		{
			
			System.out.println("Please input a positive number of hours to advance both clocks: ");
			String s = scan.nextLine();
			numHours = Integer.parseInt(s);
			
		}while(numHours <= 0);
		
		
		//advance both clock numHours
		ct1.advanceClock(numHours);
		ct2.advanceClock(numHours);
		
		//advance ct1 only
		ct1.advanceClock(numHours);
		
		//output state of each clocktower
		System.out.println(ct1);
		System.out.println(ct2);
		
		//output numClockTowers
		ClockTower.numClockTowers();
		
		scan.close();
		
	}

}
