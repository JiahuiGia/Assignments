

/**
	  * Assignment for your lecture 2.
	  * Please finish all the questions under 'Assignment'.
	  * Please try the two questions under 'Bonus'.
	  * Please write some tests as practice.
	  * When you are writing tests, you should think about what situations might cause error? like 0,-1...
	  * The deadline of this assignment is 01/27/2016 23:59.
	  * Please feel free to contact me for any questions.
	  * @author Yang
	  */

public class Assignment2 {
		
	 	//Assignment
	 	/**
	 	 * Given an integer N as input, check the following:
	 	 * If N is odd, print "Weird".
	 	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
	 	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
	 	 * If N is even and N>20, print "Not Weird".
	 	 */
	 	public void weirdNumber(int n){
			
	 		if(n<0)
	 			System.out.println("Wrong number, please try it again");
	 		else{
	 			if(n%2==1){
					System.out.println(n + " Weird");
				}else{
					if(n>=2 && n<=5){
						System.out.println(n + " Not weird");
					}else if(n>=6 && n<=20){
						System.out.println(n + " Weird");
					}else{	
						System.out.println(n + " Not Weird");
					}
				}
	 		}
	 	}
	 	
	 	/**
	 	 * Input an array of scores and return the right grades based on following rules
	 	 * 90<=score    -->4
	 	 * 80<=score<90 -->3
	 	 * 70<=score<80 -->2
	 	 * 60<=score<70 -->1
	 	 * score<60     -->0
	 	 */
	 	public int[] checkGrade(int[] scores){
	 		
	 		
	 		int [] grades = new int [scores.length];
	 		int i = 0;
	 		for(i=0;i<scores.length;i++){
	 			if(scores[i]<0 || scores[i]>100){
	 				System.out.println(scores[i]+" Wrong score");
	 				break;
	 			}
	 			else{
	 				if(scores[i]>=90)
	 					grades[i] = 4;
	 				if(scores[i]<90 && scores[i]>=80)
	 					grades[i] = 3;
	 				if(scores[i]<80 && scores[i]>=70)
	 					grades[i] = 2;
	 				if(scores[i]<70 && scores[i]>=60)
		 				grades[i] = 1;
	 				if(scores[i]<60)
	 					grades[i] = 0;
	 			}
	 		}
	 		
	 		return grades;
	 	}
	 	
	 	/**
	 	 * Write a method to determine whether a number is prime 
	 	 */
	 	public boolean isPrimeNumber(int n){
	 		
	 		if(n>0){
	 			int i = 1;
				int m = 0;
				
				for(i=1;i<=n;i++){
					if(n%i == 0)
						m = m + 1;
				}
				
				if(m == 2)//should be m==2
					return true;
				else
					return false;
	 		}else
	 			return false;
	 		
	  	}
	  	
	  	/**
	  	 * Write a method to find N numbers which are power of three.
	           * e.g. n=4, return {1,3,9,27}
	  	 */
	  	public int[] findPowerOfThree(int n){
	  		
	  		int[] power = new int[n];
	  		int i;
	  		for(i=0;i<n;i++){
	  			double num = Math.pow(3, i);
	  			power[i] = (int)(num);
	  		}
	  		return power;
	 	}
	 	
	 	/**
	 	 * Count occurrences of a given letter in a given string.
	 	 */
	 	public int countLetter(String str,char c){
	 		
	 		int i;
	 		int n = 0;
	 		for(i=0;i<str.length();i++){
	 			if(c == str.charAt(i))
	 					n = n+1;
	 		}
	 		return n;
	 	}
	 	
	 	/**
	 	 * Find maximum and minimum in a given array, and return the max and min number
	 	 */
	 	 //Input:-1,-2,-3 Output:-3,0   Input:1,2,3 Output:0,3.   Find the bug
	 	public int[] findMinMax(int[] nums){
	 		int[] minmax = new int[2];
	 		minmax[0] = nums[0];
	 		minmax[1] = nums[0];
	 		
	 		int i;
	 		for(i=1;i<nums.length;i++){
	 			if(minmax[0]>nums[i])
	 				minmax[0] = nums[i];
	 			if(minmax[1]<nums[i])
	 				minmax[1] = nums[i];
	 		}
	 		return minmax;
	 	}
	 	
	 	/**
	 	 * Find N fibonacci numbers
	 	 * Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 	 * Typically, f(0)=f(1)=1. 
	 	 */
	 	public int[] fibonacciNumber(int n){
	 		
	 		int[] fibonaccinumbers = new int[n];
	 		
	 		int i;
	 		for(i=0;i<n;i++){
	 			if(i<=1)
	 				fibonaccinumbers[i] = 1;//should be "= 1", not i
	 			else
	 				fibonaccinumbers[i] = fibonaccinumbers[i-1] + fibonaccinumbers[i-2];
	 		}
	 		return fibonaccinumbers;
	 	}
	 	
	 	
	 	
	 	//Bonus
	 	/**
	 	 * Given a non-negative integer n, repeatedly add all its digits until the result has only one digit.
	 	 * For example:
	 	 * Given n = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 	 */
	 	public int addDigits(int n){
	 		
	 		int lastN = 0;
	 		int sum = 0;
	 		int d = 0;
	 		
	 		for(sum=0;sum<10;sum=sum+d){
	 			while(n>0){
	 				lastN = n;
	 				n = n/10;
	 				d = lastN%10;//you could use n%10 to get the remainder, like "13%10 = 3" "16%5 = 1"
	 				sum = sum + d;
	 			}
	 			if(sum>10){
	 				n = sum;
	 				sum = 0;
	 				d = 0;
	 			}
	 			else
	 				return sum;
	 		}
	 		return sum;
	 		
	 	}
	 	
	 	/**
	 	 * Write a program to check whether a given number is an ugly number.
	 	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes another prime factor 7.
	 	 * Note that 1 is typically treated as an ugly number.
	 	 */
	 	public boolean isUgly(int n){
	 		
	 		if(n<=0) return false;

	 		if(n>1){
	 			while(n%2==0)
	 				n=n/2;
	 			while(n%3==0)
	 				n=n/3;
	 			while(n%5==0)
	 				n=n/5;
	 		}
	 		if(n==1)
	 			return true;
	 		else
	 			return false;
	 		
	 	}		
}
