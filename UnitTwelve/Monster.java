package UnitTwelve;

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}
	
	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		setMyHeight(ht);
	}
	
	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt)
	{
		setMyHeight(ht);
		setMyWeight(wt);
	}
	
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age)
	{
		setMyHeight(ht);
		setMyWeight(wt);
		setMyAge(age);
	}
	
	//modifiers - write set methods for height, weight, and age
	public void setMyWeight (int weight)
	{
		myWeight = weight;
	}
	
	public void setMyHeight (int height)
	{
		myHeight = height;
	}
	
	public void setMyAge (int age)
	{
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getMyWeight()
	{
		return myWeight;
	}
	
	public int getMyAge()
	{
		return myAge;
	}
	
	public int getMyHeight()
	{
		return myHeight;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getMyHeight(), getMyWeight(), getMyAge() );
	}

	public boolean equals( Object obj )
	{
		Monster monsterTwo = (Monster)obj;
		if (myHeight == monsterTwo.myHeight && myWeight == monsterTwo.myWeight && myAge == monsterTwo.myAge)
		{
			return true;
		}
		else
			return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (myHeight > rhs.getMyHeight())
		{
			return 1;
		}
		else if (myHeight == rhs.getMyHeight())
		{
			if (myWeight > rhs.getMyWeight())
			{
				return 1;
			}
			else if (myWeight == rhs.getMyWeight())
			{
				if (myAge > rhs.getMyAge())
				{
					return 1;
				}
				else if (myAge == rhs.getMyAge())
				{
					return 0;
				}
				return -1;
			}
			return -1;
		}
		return -1;
	}

	//write a toString() method
	public String toString()
	{
		String output = getMyHeight() + " " + getMyWeight() + " " + getMyAge();
		return output;
	}
	
	
}