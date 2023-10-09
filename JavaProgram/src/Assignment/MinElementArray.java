package Assignment;
import java.util.*;
public class MinElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n;
     Scanner A1=new Scanner(System.in);
     System.out.println("enter number:");
     n=A1.nextInt();
     int a[]= new int[5];
     for(int i=0;i<n;i++) {
    	 a[i]=A1.nextInt();

     for(int j=0;j<n;j++) {
    	 System.out.println("element teken from console "+a[j]);
     }*/
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] array = new int[3];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			//reading array elements from the user   
			array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (int i=0; i<n; i++)   
		{  
			System.out.println(array[i]);  

		}
	}
}

