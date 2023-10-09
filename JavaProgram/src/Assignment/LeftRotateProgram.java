package Assignment;

import java.util.Arrays;

public class LeftRotateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {10,20,30,40,50};
    int first=a[0];
    for(int i=0;i<a.length-1;i++) {
    	a[i]=a[i+1];
    }
    a[a.length-1]=first;
    System.out.println("left rotate value are: "+Arrays.toString(a));
	}

}
