package NewAssignment;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int b[]= {10,20,30,40,50};
  int size=b.length;
  int last=b[size-1];
  for(int i=size-1;i>0;i--) {
	  b[i]=b[i-1];
  }
  b[0]=last;
  System.out.println("right rotatiom:"+Arrays.toString(b));
		
		}
	}


