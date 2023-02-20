package review;

import java.util.Scanner;

//Goal: Review the topics we covered in Java1
//      1. What's is the programming design recipe?
//      2. Identifier (e.g. variable, constant, class)
//      3. Different Types of errors
//      4. Selections (if, switch)
//      5. Loops
//      6. Methods
//      7. Arrays
public class JavaBasicReview {

	public static void main(String[] args) {
		//Programming Design Recipe?
		// 1. Think first(Clearly Read and comprehensively understand the task)
		// 2. Think about logic/algorithm to solve the task in mind
		// 3. Write the concrete steps 
		///    a. Pour 50g of oil
		//     b. heat up to 150 degree
		//     c. put 200g of rice
		//     d. cook for 30s
		//     e. put 2 eggss
		//     f. cook for another 30s
		//     g. good to eat
		//4. Write the code/implementation
		
		
		//Identifiers
		//   a. Variables:
		//        why? --> we want to have something
		//          that can hold the value want to
		//          save, and it's value can be changed we want.
		//  Format to create variable:
		//       DataType Name = SOME_VALUE;
		double radius = 8.9;
		radius = 89;
		
		//   b. Constants:
		//      Saving the value that will unlikely
		//       be changed.
		
		final double PI = 3.14159;
//		pi = 7.8;
		
		//Name Conventions(rules):
		// 1. Class :
		//      1st Letter of each words should be uppercase.
		//
		//    Example: We want to create a class
		//      to compute the car speed
		//    Name might be : carspeed --> CarSpeed
		
		// 2. Variable
		//       1st Letter of each words should be uppercase,
		//        except the 1st word should lowercase
		//    Example:  A variable to hold car speed
		//       ---> carspeed , CarSpeed, carSpeed
		
		
		// 3. Constant:
		///    Capitalize every letters, and using underscore to connect different words
		//    e.g. PI
		//    e.g. define the gravity for the moon
		//          MOON_GRAVITY
		
		// 
		
		
	   //Different types of Errors:
	   // 1. Syntax/Compile Error 
//		for(int i=1;i<100) {
//			
//		}
		
	   // 2. Runtime Error
		// a. divided by 0
//		System.out.println(7/0);
		
		// b. Input Mismatch Error
		//     e.g. Get int number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a int:");
//		int num =  input.nextInt();
		
	   // 3. Logic Error
	   //     Example:  Goal : 5/2 --> 2.5
		//  integer division:
		//      Both parents are int, --> their
		//        child has no choice but int.
		//      If either one of the parents is double,
		//      ---> Their child can be double
		double result = 5/2.0;
		System.out.println(result);
		
		//I want my loop run 100 times
		for(int i=0;i<=100;i++) {
			
		}
		
		//Selections
		// if ... else if... else if.. ....  else
		
		System.out.println("Please enter a int number");
		int num = input.nextInt();
		
		// 1. One-way if selection
		if(num>10) {
			System.out.println(">10");
		}
		
		
		// 2. Two-way if selection
		if(num>10) {
			System.out.println(">10");
		}
		else {//Otherwise
			System.out.println("<=10");
		}
		
		
		
		// 3. Multi-way if selections
		
		//Code 1:
		if(num>10) {
			System.out.println(">10");
		}
		else if(num>5) {//Otherwise
			System.out.println(">5");
		}
		else if (num>3) {
			System.out.println(">3");
		}
		else {
			System.out.println("<=3");
		}
		
		
		//Code 2: Incorrect
		if(num>10) {
			System.out.println(">10");
		}
		
	    if(num>5) {//Otherwise
			System.out.println(">5");
		}
	    
	    if (num>3) {
			System.out.println(">3");
		}
		else {
			System.out.println("<=3");
		}
		
	    //Switch:
	    //   Working the selections that need case matching
	    
	    //   Only accept: int, char, byte, (>JDK 1.7 String)
	   
	    //  Example: We want to show the corresponding month name
	    //       when user give us month 
	    //     1 --> Jan
	    //     2 --> Feb
	    //     3 --> March
	    System.out.println("Please enter a month number:");
	    int monthNum = input.nextInt();
//	    if(monthNum==1) {
//	    	System.out.println("Jan");
//	    }
	    
//	    else if(monthNum==2) {
//	    	System.out.println("Feb");
//	    }
//	    else if(monthNum==3) {
//	    	System.out.println("March");
//	    }
//	    //...
//	    else if(monthNum==1) {
//	    	System.out.println("Nov");
//	    }
//	    else {System.out.println("Dec");}
//	    
	    //Better Approach: using switch
	    switch(monthNum) {
		    case 1: System.out.println("Jan");break;
		    case 2: System.out.println("Feb");break;
		    case 3: System.out.println("March");break;
		    //..
		    case 12: System.out.println("December");break;

	    }
	    
	    
	    //Task:
	    //  User will give us a number to
	    //    represent dayOfWeek, your program
	    //   should show whether is a work day or weekend.
	    
		
		//Loops:
	    //   1. For      : Know how many times will loop run
	    //   2. While    : When number of times of loop is not known
	    //   3. Do-While : Run at least once
		
	    
	    //1. For:
	    for(int i=0;i<200;i++) {
	    
	    }
	    
	    //2. While
	    int i=0;
	    
	    while(i<200) {
	    	
	
	    	i++;
	    }
	    
	    //Best Work for unknown number of loops
	    //Examples:
	    //    We generate a random, and ask user to guess
	    //     user will keep guessing until hit the key
	    
	    //   a. Generate a random num in [0,99](ints)    
	    int key = (int)(Math.random()*100);
	    
	    //   b. Ask user to guess a number,
	    //       and keep guessing until match the key
	    System.out.println("Please enter a guess:");
	    int userGuess = input.nextInt();
	    
	    while(userGuess!=key) {
		    System.out.println("Try again:");
		     userGuess = input.nextInt();
		    	
	    }
	    
	    //Do-while
	    do {
	    
	        System.out.println("Please enter a guess:");
		    userGuess = input.nextInt();
	    
	    }while(userGuess!=key);
	    
	    
	    
	}

}
