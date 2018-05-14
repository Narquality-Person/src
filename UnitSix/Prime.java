package UnitSix;

public class Prime {
	int number;
	
	public Prime(int num)
	{
		number = num;
	}
	
	public void setNumber(int num)
	{
		number = num;
	}
	
	public boolean isPrime()
	{
		for (int i = 2; i < number; i++)
		{
			if (number%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public String toString() {
		if (isPrime()) {
			return (number + " is prime.");
		}
		else {
			 return (number + " is not prime.");
		}
	}
}
