package UnitOne;

import static java.lang.System.*;

public class StarsandStripes
{
   public StarsandStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   System.out.println("********************");
   }

   public void printTwentyDashes()
   {
	   System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n\n");
   }
   
   public void printASmallBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   {
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }   
}