package NewAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[]= {10,20,30,40,50,60};
		int i=0;
		int j=a.length-1,temp;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
System.out.println("the reverse number is:"+Arrays.toString(a));
	}*/
	/*Scanner s=new Scanner(System.in);
	int n=s.nextInt();*/
   int arr[]= {10,20,30,40,50};
   int n=arr.length;
   System.out.println("reverse number is:");
   for (int i=n-1;i>=0;i--) {
	   System.out.print(" "+arr[i]);
	   
   }
  
	  

}
}