package Week3Assgn;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class Week3Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//1a. subtract value of first element in the array from the value in the last element in the array and print result
		System.out.println(ages[ages.length-1] - ages[0]);

//1b. add a new age to array and repeat step above			    
	       int [] newages = new int [9];
	       
	       for(int i = 0; i < 8; i++) {
	    	   newages[i] = ages[i];
	       }
	       newages[8] = 35;
	       
	      System.out.println(newages[newages.length-1] - newages[0]);  
	      
//1c. use a loop to iterate through the array and calc the average age, print result
	      int sum = 0;
	      for (int number : newages) {
	    	  sum += number; 
	      }
	      
	      double ave = sum / newages.length;
	      System.out.println(ave);
	      
//2. create string array called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
	    String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	      
//2a. use loop to iterate through the array and calculate the average number of letters per name, print result
	      int sumLetters = 0;
	      
	      for (int i = 0; i < names.length; i++) {
	    	 sumLetters += names[i].length();
	      }
	     
	      double aveLetters = sumLetters / names.length;
	      System.out.println(aveLetters);
	      
//2b. use loop to iterate through the array again and concatenate all names together separated by spaces, print result
	      String result = "";
	      for (int counter = 0; counter < names.length; counter++) {
	       	 result = result.concat(names[counter]);
	       	 	if (counter < names.length-1) {
	       	 		result = result.concat(" ");
	       	 	}	 	       	 
	      }  System.out.println(result);
	      
   
//3. how do you access the last element of any array?
	      //array[array.length-1]
	       
//4. how do you access the first element of any array?
	      //array[0]
	      
//5. create new array of int called nameLengths, 
//   write a loop to iterate over the previously created names array and 
//   add the length of each name to the nameLengths array	      
	      int [] nameLengths = new int[6];
	      for (int a = 0; a < nameLengths.length; a++) {
	    	  nameLengths[a] = names[a].length();
	      }
	 
//6. write loop to iterate over the nameLengths array and calculate the sum of all elements in array, print result
	      int total = 0;
	      for (int b : nameLengths) {
	    	  total += b; 
	      }
	      
	      System.out.println(total);
	      
//7. write method that takes String, word and an int, n, as arguments and returns the word concatenated to itself n number of times
	      System.out.println(dupword("Hello",4));
	   

//8. write method that takes two Strings, firstName & lastName, and returns full name as a String separated by a space
	      String name1 = "John";
	      String name2 = "Jones";
	      String allNames = fullName(name1, name2);
	      
	      System.out.println(allNames);
	      
//9. write method that takes array of int and returns true if sum of all int in array is greater than 100
	      int[] numArray = new int [3];
	      numArray[0] = 63;
	      numArray[1] = 88;
	      numArray[2] = 35;
	      
	      System.out.println(sumArray(numArray));
	      
//10. write method that takes array of double and returns the average of all elements in array
	      double[] grades = new double[5];
	      grades[0] = 73.5;
	      grades[1] = 99;
	      grades[2] = 80.5;
	      grades[3] = 100;  
	      grades[4] = 63.5;
	      
	      System.out.println(calcAve(grades));
	      
//11. write method that takes two arrays of double and returns true if the average of the elements in first array
	 // is greater than average of elements in second array
	      double[] doubleArr = {29, 83.5, 2.98, 88};
	      
	      System.out.println(isFirstAveGT(grades, doubleArr));
	      
//12.  write method called willBuyDrink that takes boolean isHotOutside and a double moneyInPocket and 
	 //  returns true if it is hot outside and if moneyInPocket is greater than 10.5
	     	double moneyInPocket = 13;
	     	boolean isHotOutside = true;
	      		
	      	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	      	
	      	     	      
	
//13. create method of your own: return the age of a person based on year of birth
	      Scanner year = new Scanner(System.in);
	    	  System.out.println("What year were you born? ");
	    	  
	    	  int birthYear = year.nextInt();
	    	  
	      System.out.println(getAge(birthYear));
	  	 	      
		 	      
}
	      
//7.
public static String dupword(String word, int n) {
String dupword = "";
for (int i = 0; i < n; i++) {
	dupword += word; 
}
return dupword;
}

//8.
public static String fullName(String first, String last) {
return first + " " + last;
}

//9. 
public static boolean sumArray(int[] numbers) {
return Arrays.stream(numbers).sum() > 100;
}

//10.
public static double calcAve(double[] numbers) {
//	double sum = 0;
//	for (double number : numbers) {
//		sum += number;
//	}
return Arrays.stream(numbers).average().orElse(Double.NaN);
		//sum / numbers.length; 
}	

//11. 
public static boolean isFirstAveGT(double[] firstArr, double[] secondArr) {
double firstAve = Arrays.stream(firstArr).average().orElse(Double.NaN);
double secondAve = Arrays.stream(secondArr).average().orElse(Double.NaN);

return firstAve > secondAve;
}

//12.
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
boolean buyDrink;

if (isHotOutside == true && moneyInPocket > 10.5) {
	buyDrink = true;
} else {
	buyDrink = false;
}
return buyDrink;
}

//13. 
public static int getAge (int birthYear) {
return Year.now().getValue() - birthYear;
}


}




