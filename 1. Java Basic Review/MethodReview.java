package review;

//Method/Function:
//  They should sever for a unique purpose.
//  Pros:
//      We want to reuse our code and make our code
//       easy to maintain
public class MethodReview {
	
	public static void main(String[] args) {
			
		//Purpose: Compute the sum for 
		//           the integers from the lower boundary
		//           till the upper boundary
		
		//1. Compute the sum from 1 to 15
		
		int sum =0;
		
		for(int i=1;i<=15;i++) {
			sum+=i;
		}
		
		//2. Compute the sum from 56 to 750
		
		int sum2 =0;
		
		for(int i=56;i<=750;i++) {
			sum2+=i;
		}
		
		//3. Compute the sum from 1586 to 6678
		
		int sum3 =0;
		
		for(int i=1586;i<=6678;i++) {
			sum3+=i;
		}
		
		//4. Compute the sum from 1 to 20000
		int sum4 = sum(1,20000);
		int sum5 = sum(-8751,20000);

		//Test Cases for sum method:
		
		// 1 ---> list all cases that my sum method
		//       could apply, if all return results
		//       are equal to ground truth 
		//         ---> 100% our method is correct 
		//       (what we just did, however, it is less feasible)
		// 2 ---> Use a smarter approach but can not 
		//        reach 100% confidence (might be very close)
		//        How?
		//        We will observe the all possible cases
		//        the method could apply, and category them into
		//        different groups.
		//        --> Select couple(>3) representative 
		//        example to do the testing,
		//        if all these selected examples passed,
		//        we could assume all cases under this category
		//        will also passed. 
		//        (In this we can't 100% guarantee 
		//         the correctness of our method, but very close).
		//         Meantime, it is efficient.
		
		// Test Sum Method:
		//1. lower boundary is -, upper boundary is -
		System.out.println(sum(-6,-5) == -11);//2 #s
		System.out.println(sum(-150,-3) == -(150+3)*74); //> 2#s
		System.out.println(sum(-66666,-66666) == -66666);//1 #s
		
		//2. lower boundary is -, upper boundary is +
		System.out.println(sum(-6,5) == -6);//More - #s
		System.out.println(sum(-6,9) == 24);//More + #s
		System.out.println(sum(-77,77) == 0);//+ and - #S are equal 

		//3. lower boundary is +, upper boundary is +
		System.out.println(sum(6,6) == 6);//1#
		System.out.println(sum(86,87) == 173);//2#s
		System.out.println(sum(188,89213) == (89213-188+1)*(89213+188)/2);//> 2#s



		//Test Cases for isOdd method
		
		//1. Number is Odd
		System.out.println( isOdd(1) ==  true);
		System.out.println( isOdd(89) ==  true);
		System.out.println( isOdd(434383433) ==  true);

		//2. Number is Even
		System.out.println( isOdd(0) ==  false);
		System.out.println( isOdd(2) ==  false);
		System.out.println( isOdd(88888888) ==  false);
		System.out.println( isOdd(242686432) ==  false);

		//3. Number is Negative
		System.out.println( isOdd(-2) ==  false);
		System.out.println( isOdd(-37) ==  false);
		System.out.println( isOdd(-32327) ==  false);

	}
	
	
	//Signature: Name: input data type(s) ---> return data type
	//Purpose:
	//Examples:
	
	
	//Signature:  sum: int(lower)  int(upper)  ---> int
	//Purpose:  Compute the sum for 
	//            the integers from the lower boundary
	//           till the upper boundary
	//Examples:
	//          sum(1,3) ---> 6
	//          sum(2,6) ---> 20
	//          sum(-8,10) ---> 19
	public static int sum(int lower,int upper) {
		//Implement the code???
		int sum = 0;
		
		for(int i=lower;i<=upper;i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	
	
	//Signature:  isOdd: int  ---> boolean
	//Purpose: Check whether the given number is Odd number
	//         If the given number is Odd number, it should return true;
	//         Otherwise, it should return false.
	//         If the given number is negative, return false.
	//Examples:
	//          isOdd(5) --> true
	//          isOdd(8) --> false
	//          isOdd(-9) --->?false
	public static boolean isOdd(int num) {
		//1. If number is negative ---> return false
		if(num<0) {
			return false;
		}
		
		
		//2. If number is positive or 0:
		//     2-a. number is Odd
		//     2-b. number is Even
		else {
			if(num%2!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		

	}
	
	
	
	
	

}
