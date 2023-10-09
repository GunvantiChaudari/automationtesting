package Assignment;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner A1=new Scanner(System.in);
		System.out.println("enter number:");
			int num=A1.nextInt();
			Pallindrome( num);
	}
	static void Pallindrome (int num) {
		  int rev=0,rem;
		  int temp=num;
		  while(num>0) {
			  rem=num%10;
			  rev=rev*10+rem;
			  num=num/10;	  
		  }if(temp==rev) {
			  System.out.println("number is pallindrome");
		  }else {
			  System.out.println("number is not a pallindrome");
		  }
	}

}
