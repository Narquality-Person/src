package Journals;

public class modTen {
	int number;
	int oneHundreds;
	int middle;
	int hundredOnes;
	int pali;
	
	public modTen(int num) {
		// TODO Auto-generated constructor stub
		number = num;
		
	}
	public void checkPalindrome()
	{
		oneHundreds = number%10;
		middle = number%100;
		hundredOnes = number%1000;
		
		pali = oneHundreds *100 + middle*10 + hundredOnes;
		
		if (number == pali)
		{
			System.out.println(pali + " is a palindrome of " + number);
		}
		else
			System.out.println(pali + " is not a palindrome of " + number);
	}
	
}
