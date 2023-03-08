package twodimarray;

import java.util.Arrays;

public class As6MaxScore {

	public static void main(String[] args) {

//Background: 5	Students' 6 assignment score
//             1D Approach ---> too much and hard to maintain
//		double[] s1Score = { 99, 100, 78, 93, 80, 74 };
//		double[] s2Score = { 98, 90, 80, 93, 78, 78 };
//		double[] s3Score = { 100, 100, 74, 93, 80, 34 };
//		double[] s4Score = { 93, 100, 78, 88, 80, 74 };
//		double[] s5Score = { 99, 100, 88, 93, 74, 88 };
//
//		// Find which student get the highest score for AS6
//
//		double max = s1Score[5];
//		int maxStudent = 1;
//
//		if (max < s2Score[5]) {
//			max = s2Score[5];
//			maxStudent = 2;
//		}
//		if (max < s3Score[5]) {
//			max = s3Score[5];
//			maxStudent = 3;
//		}
//
//		if (max < s4Score[5]) {
//			max = s4Score[5];
//			maxStudent = 4;
//		}
//		if (max < s5Score[5]) {
//			max = s5Score[5];
//			maxStudent = 5;
//		}

//		for(int i=0;i<s1Score.length;i++) {
//			int max = s1Score[i];
//		}

		
		//2D Array Approach
		int[][] studentsScore = { { 99, 100, 78, 93, 80, 74 }, 
								  { 98, 90, 80, 93, 78, 78 }, 
								  { 100, 100, 74, 93, 80, 34 },
								  { 93, 100, 78, 88, 80, 74 }, 
								  { 99, 100, 88, 93, 74, 88 } };
		
		//Task 1:
		// Which student get highest score in assignment 6?	
		//Loop over all students
		int maxScore = studentsScore[0][5];
		int maxStudent = 0;
		
		for(int rowIndex=1;rowIndex<studentsScore.length;rowIndex++) {
//			System.out.println(studentsScore[rowIndex][5]);
			
			if(maxScore<studentsScore[rowIndex][5]) {
				maxScore=studentsScore[rowIndex][5];
				maxStudent =rowIndex;
			}
			
		}
		
		
		//Task2: Highest assignment score for each individual student
	
		//Brainstorming:
		//Work on 1st student first
		int maxEachStuScore= studentsScore[0][0];
		
		for(int colIndex=0;colIndex<studentsScore[0].length;colIndex++) {
//			System.out.println(studentsScore[0][colIndex]);
			if(maxEachStuScore<studentsScore[0][colIndex]) {
				maxEachStuScore=studentsScore[0][colIndex];
			}
			
		}
		
		System.out.println("Student 1 highest assignment score is "+maxEachStuScore);

		
		
		//Work on 2nd student 
		
		 maxEachStuScore= studentsScore[1][0];
		
		for(int colIndex=0;colIndex<studentsScore[1].length;colIndex++) {
//			System.out.println(studentsScore[0][colIndex]);
			if(maxEachStuScore<studentsScore[1][colIndex]) {
				maxEachStuScore=studentsScore[1][colIndex];
			}
			
		}
		
		System.out.println("Student 2 highest assignment score is "+maxEachStuScore);
		
		
		
		System.out.println("\n\n\n\n");
		//Inside of typing row index manually, we 
		//   use loop to generate row indexes 
		//Using loop to loop all rows---> all students
		for(int rowIndex=0;rowIndex<studentsScore.length;rowIndex++) {
			
			 maxEachStuScore= studentsScore[rowIndex][0];
			
			for(int colIndex=0;colIndex<studentsScore[rowIndex].length;colIndex++) {
//				System.out.println(studentsScore[0][colIndex]);
				if(maxEachStuScore<studentsScore[rowIndex][colIndex]) {
					maxEachStuScore=studentsScore[rowIndex][colIndex];
				}
				
			}
			
			System.out.println("Student "+ (rowIndex+1)+" highest assignment score is "+maxEachStuScore);

			
			
		}
		
		
		//TAKE HOMEWORK:
		//  Largest # in each column
	}

}
