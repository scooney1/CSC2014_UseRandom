/**
 * Author:	Sam Cooney
 * Project:	UseRandom
 * Date:	Sep 13, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 */

//1. Allows for use of pre-existing classes.
//2. int nextInt()
//3. Can be positive or negative.
//4. Random obj = new Random();
//5. int num1 = obj.nextInt();
//6. Negative infinity to positive infinity(integers only).
//7. int num1 = obj.nextInt(10)+1;

//
//----------------------------------AGORITHM-------------------------------
//

// INPUT: tatolSeconds
// PROCESS: 
// 1. Do totalSeconds % 60 and store in seconds. 
// 2. Divide totalSeconds by 60 and store in totalMinutes.
// 3. Do totalMinutes % 60 and store in minutes.
// 4. Divide totalMinutes by 60 and store in hours. 
// 5. Print hours, minutes, and seconds.

//
//-----------------------------------PROGRAM-------------------------------
//

import java.util.Random;

public class UseRandom {

	public static void main(String[] args) {
		Random obj = new Random();
		int totalSeconds, totalMinutes, seconds, minutes, hours;
		
		int num1 = obj.nextInt();			// Random number with no constraints.
		System.out.println("Here is a number from the random number generator: " + num1);
		int num2 = obj.nextInt(10)+1;			// Random number between 1 and 10.
		System.out.println("Here is a positive number in the range 1-10: " + num2);
		totalSeconds = num2 * 20000;		// Create totalSeconds variable.
		System.out.println("Here is the total number of seconds: " + totalSeconds);
		seconds = totalSeconds % 60;		// Find number of seconds when converted.
		totalMinutes = totalSeconds / 60;	// Find total minutes.
		minutes = totalMinutes % 60;		// Find number of minutes when converted.
		hours = totalMinutes / 60;			// Find number of hours when converted.
		System.out.println("Hours = " + hours);
		System.out.println("Minutes = " + minutes);
		System.out.println("Seconds = " + seconds);
		
		System.out.println("***************************************************************");		// This
		System.out.println("*                         Sam Cooney                          *");		// is
		System.out.println("*                          CSC 2014                           *");		// my
		System.out.println("*                         Project #5                          *");		// own
		System.out.println("***************************************************************\n\n");	// box.
	}

}
