package NewAssignment;

public class CopyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,20,30,40};
      int copy[]=a.clone();
      for(int i:copy) {
    	  System.out.print("  "+i);
      }
	}

}
