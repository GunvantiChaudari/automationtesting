package Assignment;

import java.util.Arrays;

public class RightRotateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int b[]= {10,20,40,50,60};
     int last=b[b.length-1];
     for(int i=b.length-1;i>0;i--) {
    	 b[i]=b[i-1];
    	 
     }
     b[0]=last;
     System.out.println("Right rotate value are: "+Arrays.toString(b));
	}

}
