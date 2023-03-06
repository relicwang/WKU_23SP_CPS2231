package twodimarray;

import java.util.Scanner;

//Purpose: Implement a simple 3*3 TicTacToe Chess Game
public class TicTacToeGame {

	public static void main(String[] args) {
		
		//Code to test your Methods!!!!
		runTestCases();
		
		
		
		//1. Initialize a chess board (3*3)
		//    --> default values for numeric array
		//         --->0
		int[][] gameBoard = new int[3][3];
	
//		gameBoard[0][1]=1;
//		gameBoard[1][1]=-1;
		
		
		
		
		//2. Print the board
		printBoard(gameBoard);

		//3. Invite Player 1 to take an action
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your action (row number followed by col number):");
		int p1RowIndex = input.nextInt()-1;
		int p1ColIndex = input.nextInt()-1;
		gameBoard[p1RowIndex][p1ColIndex]=1;
		
		//4. Print the board
		printBoard(gameBoard);
		
		//5. Check the win status
		//    Possible win status:
		//      1. Player 1 wins
		//      2. Player 2 wins
		//      3. Tie cases (No empty place in the board, but no body win)
		//      4. Continue
		int winStatus = checkWinStatus(gameBoard);

		
		
		
		//6. Invite Player 2 to take an action
		
		//7. Print the board
		
		//8. Check the win status
		
		
	}

	private static void runTestCases() {
		//1. Test cases for checkWinStatus()
		
		// a. P1 wins;
		
		//   a-1. row-wise win
		System.out.println(checkWinStatus(new int[][]{{1,1,1},{-1,1,1},{-1,0,1}}));
		
		//   a-2. col-wise win
		
		//   a-3. diagonise-wise win
		
		
		//TODO: Complete test cases with other methods
		
		
		
		
	}

	//Signature:  checkWinStatus:int[][] -> int
	//Purpose: Check the win status and return
	//  		     1 --> Player 1 wins
	//    			 2 --> Player 2 wins
	//               3 --> Tie cases (No empty place in the board, but no body win)
	//               4 -->Continue
	//Examples: checkWinStatus({{1,1,1},{-1,1,1},{-1,0,1}}) 
	//               --> return 1
	// (MORE EXAMPLES RERUIRED)
	private static int checkWinStatus(int[][] gameBoard) {
		//1. Check Player 1 win 
		//    a. sum of the row ---> 3
		for(int i=0;i<gameBoard.length;i++) {
			int rowSum=0;
			for(int j=0;j<gameBoard[0].length;j++) {
				rowSum+=gameBoard[i][j];
			}

			if(rowSum==3) {
				return 1;
			}
		}
		
		
		//    b. sum of the col ---> 3
		
		for(int j=0;j<gameBoard[0].length;j++) {
			int colSum=0;
			for(int i=0;i<gameBoard.length;i++) {
				colSum+=gameBoard[i][j];
			}

			if(colSum==3) {
				return 1;
			}
		}
		
		

		//   TODO: c. sum of diagonize --> 3
		//    
		
		
		//2. Check Player 2 win
		//	  a. sum of the row ---> -3
			for(int i=0;i<gameBoard.length;i++) {
				int rowSum=0;
				for(int j=0;i<gameBoard[0].length;j++) {
					rowSum+=gameBoard[i][j];
				}

				if(rowSum==-3) {
					return 2;
				}
			}
		
	
		
		//    b. sum of the col ---> -3
			for(int j=0;j<gameBoard[0].length;j++) {
				int colSum=0;
				for(int i=0;i<gameBoard.length;i++) {
					colSum+=gameBoard[i][j];
				}

				if(colSum==-3) {
					return 2;
				}
			}	
			
			
	
			
		//   TODO: c. sum of diagonize --> -3
		//    
		
		
		//3. Check tie case
		//   If neither p1 or p2 wins, and no empty space in the board
		//  ---> case
		// ---> If we can reach here, nothing returned yet, 
	   //        which means p1 or p2 not wins
		
			boolean isFullyOccupied=true;
			
			for(int i=0;i<gameBoard.length;i++) {
				
				for(int j=0;i<gameBoard[0].length;j++) {
					if(gameBoard[i][j]==0) {
						isFullyOccupied=false;
					}
				}
			}
			
			if(isFullyOccupied) {
				return 3;
			}
			
			//4. Check continue
			//  If none of the abobe -->
			else {
				return 4;
			}
	
		
		
	
	}


	//Signature: printBoard: int[][] --> void
	//Purpose: Print the board status, where 1 represents X,
	//            -1 represents O, 0 represents No Action yet.
	//            Otherwise, print invalid
	//Examples:
	//        printBoard({ {0,0}, {0,0}, {0,0}}) --->
	//                 print a board like:
	//                       _|_
	//                       _|_ 
	//                       _|_
	//        printBoard({ {1,0}, {0,-1}, {0,0}}) --->
	//                 print a board like:
	//                       X|_
	//                       _|O 
	//                       _|_
	
	//TODO: HOW TO NOT PRINT LAST VERTICAL LINE
	//      MORE TEST CASES
	private static void printBoard(int[][] gameBoard) {
		//Get Shape of board
		int rowNum = gameBoard.length;
		int colNum = gameBoard[0].length;
		
		//Print the board
		for(int rowIndex=0;rowIndex<rowNum;rowIndex++) {
			for(int colIndex=0;colIndex<colNum;colIndex++) {
				
				//If user 1's action
				if(gameBoard[rowIndex][colIndex]==1) {
					System.out.print("X");
				}
				//If user 2's action
				else if	(gameBoard[rowIndex][colIndex]==-1) {
					System.out.print("O");
				}
				//If no action yet
				else if(gameBoard[rowIndex][colIndex]==0) {
					System.out.print("_");
				}
				//Invalid Case:
				else {
					System.out.print("INVALID MOVE");
				}
				
				System.out.print("|");
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
	}

}
