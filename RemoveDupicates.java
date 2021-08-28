package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupicates {
	public static void main(String[] args) {
		String text = " We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> unique = new LinkedHashSet<String>();
		for (String eachWord : words) 
		{
			unique.add(eachWord);
		}
		for (String wd : unique) 
		{
			System.out.println(wd + " ");
	
	/*Declare a String as PayPal India

	1.Convert it into a character array

	2.Declare a Set as charSet for Character

	3.Declare a Set as dupCharSet for duplicate Character

	4.Iterate character array and add it into charSet

	5.If the character is already in the charSet then, add it to the dupCharSet

	6.Check the dupCharSet elements and remove those in the charSet

	7.Iterate using charSet

	8.Check the iterator variable isn't equals to an empty space

	9.print it*/
		}
	}
}
