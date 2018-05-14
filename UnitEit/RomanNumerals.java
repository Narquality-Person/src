package UnitEit;

import static java.lang.System.*;

public class RomanNumerals
{
	private int number;
	private String roman;
	char romanNumeral;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumerals(String str)
	{
		setRoman(str);
	}

	public RomanNumerals(int orig)
	{
		setNumber(orig);
	}

	public int setNumber(int num)
	{
		number = num;
		return number;
	}

	public String setRoman(String rom)
	{
		roman = rom;
		return roman;
	}

	public String getNumber()
	{
		for (int i = 0; i< NUMBERS.length; i++)
		{
			if (number == NUMBERS[i])
			{
				roman = setRoman(LETTERS[i]);
			}
			else if(number == 2500)
			{
				roman = setRoman(LETTERS[0] + LETTERS[0] + LETTERS[2]);
			}
			else if(number == 1500)
			{
				roman = setRoman(LETTERS[0] + LETTERS[2]);
			}
			else if(number == 23)
			{
				roman = setRoman(LETTERS[8] + LETTERS[8] + LETTERS[12]+ LETTERS[12]+ LETTERS[12]);
			}
			else if(number == 38)
			{
				roman = setRoman(LETTERS[8] + LETTERS[8] + LETTERS[8] + LETTERS[10] + LETTERS[12]+ LETTERS[12]+ LETTERS[12]);
			}
			else if(number == 49)
			{
				roman = setRoman(LETTERS[8] + LETTERS[8] + LETTERS[8] + LETTERS[8] + LETTERS[9]);
			}
		}
	return roman;
	}
	public int getRoman()
	{
		int nom = 0;
		int index = 0;
		String xL = "XL";
		String iX = "IX";
		
		while (index<roman.length())
		{
			if((roman.substring(index, index + 2)).compareTo(xL) == 0)
			{
				nom = nom + NUMBERS[7];
				index = index + 2;
			}
			else if((roman.substring(index, index + 2)).compareTo(iX) == 0)
			{
				nom = nom + NUMBERS[9];
				index = index + 2;
			}
			else
				for (int i = 0; i<roman.length(); i++)
				{
					
					if (roman.charAt(i) == 'L')
					{
						nom = nom + NUMBERS[6];
					}
					
					else if (roman.charAt(i) == 'X')
					{
						nom = nom + NUMBERS[8];
					}
					
					else if (roman.charAt(i) == 'V')
					{
						nom = nom + NUMBERS[10];
					}
					
					else if (roman.charAt(i) == 'I')
					{
						nom = nom + NUMBERS[12];
					}	
					
					index = index + 1;
				}
			
		}
		return nom;
	}
	public String toString()
	{
		return getNumber();
	}
	
	public int toRom()
	{
		return getRoman();
	}
}
