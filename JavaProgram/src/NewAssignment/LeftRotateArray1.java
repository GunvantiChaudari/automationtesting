package NewAssignment;
import java.util.*;
public class LeftRotateArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int arr[]=new int [5];
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter a value: ");
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
	   }
	   for(int j=arr.length-1;j>=0;j--) {
		   System.out.println("reverse number: "+arr[j]);
	   }
	   

	}

}
