package Assignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str=" like";
     String rstr="";
     char ch[]=str.toCharArray();
     for(int i=str.length()-1;i>=0;i--) {

    	 rstr+=ch[i];
     }
     System.out.println("the reverse string is: "+rstr);
		

}
}