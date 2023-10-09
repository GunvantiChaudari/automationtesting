package NewAssignment;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {11,12,13,14,15,16};
      int size=a.length;
      for(int i=0;i<size;i++) {
    	  if(a[i]%2==0) {
    		  System.out.println("even number is:"+a[i]);
    	  }
      }
    	  for(int j=0;j<size;j++) {
    		  if(a[j]%2!=0) {
    			  System.out.println("odd number is:"+a[j]);
    		  }
    	  }
    	  
      
	

}
}

