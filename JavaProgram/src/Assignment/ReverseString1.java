package Assignment;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="welcome";
	     String rstr="";
	     char ch[]=str.toCharArray();
	     for(int i=str.length()-1;i>=0;i--) {

	    	 rstr+=ch[i];
	     }
	     System.out.println("the reverse number is: "+rstr);
			
}
}
