package javaprograms;

import java.util.Scanner;

public class Sumofoddnum {

	public static void main(String[] args) {
		int number, i, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <=number; i=i+2)
		{
		
			
				oddSum = oddSum + i; 
			
		}
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
	}


