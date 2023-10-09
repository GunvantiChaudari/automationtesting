package Assignment;
import java.util.*;
public class RightRotate {

	public static void main(String[] args) {
	int a[]=new int [5];
	Scanner a1=new Scanner(System.in);
	System.out.println("Enter the value: ");
	for(int i=0;i<=a.length;i++) {
	a[i]=a1.nextInt();
	}
	int first=a[0];
	for(int b:a){
	 a[b]=a[b+1];
	 
	
	a[a.length-1]=first;
	System.out.println(b);
	
	}		

}

}