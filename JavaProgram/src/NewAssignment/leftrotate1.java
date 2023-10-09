package NewAssignment;

import java.util.Arrays;

public class leftrotate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {10,20,30,40,50};
     int size=a.length;
     int first=a[0];
     for(int i=0;i<size-1;i++) {
    	 a[i]=a[i+1]; 	
     }
     a[size-1]=first;
    System.out.println("left rotate element :"+Arrays.toString(a));
       
	}
}
