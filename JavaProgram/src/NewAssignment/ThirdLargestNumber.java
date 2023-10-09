package NewAssignment;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {10,20,25,63,96,57};
     int size=a.length,temp;
     for(int i=0;i<size;i++) {
    	for(int j=i+1;j<size;j++) {
    		if(a[i]>a[j]) {
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
     }
     System.out.println("Third largest number is : "+a[size-3]);
     
	}

}
