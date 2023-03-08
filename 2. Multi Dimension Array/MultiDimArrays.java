package twodimarray;

import java.util.Scanner;

//Purpose: Explore different operations related to the 2D dimension array
public class MultiDimArrays {

	public static void main(String[] args) {
		
		  // 1. Operations in Global-wise of 2D Array 
		  // (Iterate over whole space of 2D array) 
		  // a. Fill the value into our 2D Array 
		  int[][] nums1 = new int[2][3]; // 2--> 2 rows; 3--> 3 columns // 0|0|0 // 0|0|0
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Please enter 2*3 array elements one-by-one:");
		  
		  // NOT efficient way 
//		  nums1[0][0]=input.nextInt(); 
//		  nums1[0][1]=input.nextInt(); 
//		  nums1[0][2]=input.nextInt(); 
//		  nums1[1][0]=input.nextInt();
//		  nums1[1][1]=input.nextInt(); 
//		  nums1[1][2]=input.nextInt();
		  
		  //Better Implementation
		  // Generate all row index 
		  for (int rowIndex = 0; rowIndex < nums1.length;rowIndex++) {// 0,1 
			  // Generate all col. index 
			  for (int colIndex = 0;colIndex < nums1[0].length; colIndex++) {// 0,1,2
				  //Read the value from user and assign to the corresponding position
				  nums1[rowIndex][colIndex] = input.nextInt(); 
			   } 
		 }
		  
		  // b. Print all elements in 2D Array (Similar as previous one)
		  // Generate all row index 
		  for (int rowIndex = 0; rowIndex < nums1.length; rowIndex++) {// 0,1 
			  // Generate all col. index 
			  for (int colIndex = 0; colIndex < nums1[0].length; colIndex++) {// 0,1,2 
				  System.out.print(nums1[rowIndex][colIndex] + " "); 
			  }
		  
			  System.out.println(); 
		  }
		 
		  // c. Find the largest/smallest among the 2D Array 
		  // We need visit all elements in 2D array
		  
		  //Assume the very first is the largest
		  int maxNum = nums1[0][0];
		  
			// Generate all row index
			for (int rowIndex = 0; rowIndex < nums1.length; rowIndex++) {// 0,1
				// Generate all col. index
				for (int colIndex = 0; colIndex < nums1[0].length; colIndex++) {// 0,1,2

					// If any time, my current element > maxNum 
					// --> we update the max number
					if (maxNum < nums1[rowIndex][colIndex]) {
						maxNum = nums1[rowIndex][colIndex];
					}
				}

			}
		  
		  System.out.println("The largest number is "+maxNum);
		 

		int[][] studentsScore = 
			  { { 99, 100, 78, 93, 80, 74 }, 
				{ 98, 90, 80, 93, 78, 78 }, 
				{ 100, 100, 74, 93, 80, 34 },
				{ 93, 99, 78, 88, 80, 74 }, 
				{ 99, 100, 88, 93, 74, 88 } };

		// 2. Operations in Row-wise of 2D Array
		// a. Find the largest element in each row
		// --> define a variable: maxRowNum (which saves the largest val for that row)

		for (int rowIndex = 0; rowIndex < studentsScore.length; rowIndex++) {// 0,1

			int maxRowNum = studentsScore[rowIndex][0];// IMPORTANT: WHERE PLACE IT!

			// Generate all col. index
			for (int colIndex = 0; colIndex < studentsScore[0].length; colIndex++) {// 0,1,2
				if (studentsScore[rowIndex][colIndex] > maxRowNum) {
					maxRowNum = studentsScore[rowIndex][colIndex];
				}

			}

			// -->At this point, we all compare all elements in that row
			System.out.println("The largest number for row: " + (rowIndex + 1) + " is " + maxRowNum);

		}

		// b. Find which row has the largest sum

		// Compute the sum of 1st row
		int maxRowSum = 0;
		int maxRowSumIndex = 0;

		for (int colIndex = 0; colIndex < studentsScore[0].length; colIndex++) {
			maxRowSum += studentsScore[0][colIndex];
		}

		// Compare the 1st row sum with rest row, and update the maxRowSum with its
		// index
		// accordingly
		for (int rowIndex = 1; rowIndex < studentsScore.length; rowIndex++) {

			int rowSum = 0;// Record the sum of current row
			// Generate all col. index
			for (int colIndex = 0; colIndex < studentsScore[0].length; colIndex++) {// 0,1,2
				rowSum += studentsScore[rowIndex][colIndex];
			}

			System.out.println("The sum number for row: " + (rowIndex + 1) + " is " + rowSum);

			// Compare the current row sum with maxRowSum
			if (maxRowSum < rowSum) {
				maxRowSum = rowSum;
				maxRowSumIndex = rowIndex;
			}

		}

		System.out.println("The max row sum is: " + maxRowSum + ". And row is " + (maxRowSumIndex + 1));

		// 2. Operations in Column-wise of 2D Array
		// a. Find the largest element in each column
		// --> define a variable: maxColNum (which saves the largest val for that col)

		for (int colIndex = 0; colIndex < studentsScore[0].length; colIndex++) {// Lock the col index one by one
			int maxColNum = studentsScore[0][colIndex];

			for (int rowIndex = 0; rowIndex < studentsScore.length; rowIndex++) {

				if (maxColNum < studentsScore[rowIndex][colIndex]) {
					maxColNum = studentsScore[rowIndex][colIndex];
				}
			}

			System.out.println("The largest number for column: " + (colIndex + 1) + " is " + maxColNum);

		}

		// b. Find which column has the largest sum
		// TODO: YOUR TURN

	}

}
