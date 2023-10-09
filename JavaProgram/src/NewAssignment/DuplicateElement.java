package NewAssignment;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int b[]= {10,20,30,40,10,20};
   int size=b.length;
   for(int i=0;i<size-1;i++) {
   for(int j=i+1;j<size;j++) {
	   if(b[i]==b[j]) {
		   System.out.println("dublicate element: "+b[i]);
	   }
   }
	   
   }
	}

}
