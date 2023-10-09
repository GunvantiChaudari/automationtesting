package Assignment;
import java.util.*;
public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		
   Scanner a1=new Scanner(System.in);
   System.out.println("enter the size: ");
   n=a1.nextInt();
   int a[]=new int[n];
   System.out.println("Enter a value: ");
   for(int i=0;i<a.length;i++) {
	   a[i]=a1.nextInt();
	  
   }
   int first=a[0];
   for(int j=0;j<a.length-1;j++) {
      a[j]=a[j+1];
   }
	a[a.length-1]=first;
	System.out.println("left rotate: "+Arrays.toString(a));

}
}
