// Java program to convert a decimal 
// number to binary number 
import java.io.*; 
import java.util.*;
class GFG 
{ 
	// function to convert decimal to binary 
	static void exam1(int n) 
	{ 
		// array to store binary number 
		int[] binaryNum = new int[1000];

		// counter for binary array 
		int i = 0; 
		while (n > 0) 
		{
			// storing remainder in binary array 
			binaryNum[i] = n % 2; 
			n = n / 2; 
			i++; 
		}

		// printing binary array in reverse order 
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(binaryNum[j]); 
	} 
	
	// driver program 
	public static void main (String[] args) 
	{ 
		// int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
		System.out.println("Decimal : " + n); 
		System.out.print("Binary : "); 
		exam1(n);
	} 
}