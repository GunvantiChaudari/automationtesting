package JavaProgram2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Palindrome A1=new Palindrome();
       A1.palindrome();
	}
	 void palindrome() {
    	 int n=151;
    	 int rem=0,sum=0;
    	 int temp=n;
    	 while (n>0) {
    		 rem=n%10;
    		 sum=sum*10+rem;
    		 n=n/10;
    	 }if (sum==temp) {
    		 System.out.println("palindrome");
    	 }else {
    		 System.out.println("not palindrome");
    	 }
     }
}
