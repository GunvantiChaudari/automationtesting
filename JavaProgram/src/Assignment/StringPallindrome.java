package Assignment;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="arora";
   String rev="";
   for(int i=str.length()-1;i>=0;i--) {
	   rev=rev+str.charAt(i);
   } 
	   if(str.equals(rev)) {
		   System.out.println("string is pallindrome");
	   }else {
		   System.out.println("string is not pallindrome");
	   }
   
	}

}
