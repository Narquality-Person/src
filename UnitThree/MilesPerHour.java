package UnitThree;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		hours = hours + minutes / 60;
		mph = distance / hours;
	}

	public void print()
	{
		System.out.println(mph);
	}
}

/*
 distance = rate * time
 minutes / 60 = hours ( 360 / 60 == 6 hours )
  */