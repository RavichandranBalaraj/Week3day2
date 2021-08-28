package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortusingCollections {

	public static void main(String[] args) {
	String arr[] = {"Google"," Microsoft","TestLeaf"," Maverick"};
List<String>list = new ArrayList<String>(Arrays.asList(arr));
System.out.println(list);
Collections.reverse(list);
System.out.println(" REVERSED LIST");
System.out.println(list);

}
	}
/*1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

2.Get the length of the array		

3. sort the array			

4. Iterate it in the reverse order

5. print the array
		
6. Required Output: Wipro, HCL , CTS, Aspire Systems*/

