package Assignment;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {10,20,30,10,40,20,30};
		for(int i=0;i<b.length;i++) {
		   for(int j=i+1;j<b.length;j++) {
			   if(b[i]==b[j]) {
				   System.out.println("dublicate element are: "+b[i]);
			   }
		   }
		}

	}

}
