package Doggos;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class FamilyTester {
	Family test = new Family("The Smiths", 2);
	test.addKiddo(0, new Kiddo("Jane", "1 - Doug"));
	test.addKiddo(1, new Kiddo("John", "1 - Buddy"));
	System.out.println(test);
}
