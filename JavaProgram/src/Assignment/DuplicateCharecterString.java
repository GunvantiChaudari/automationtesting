package Assignment;

public class DuplicateCharecterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="character";
     char ch[]=str.toCharArray();
     int count=0;
     for(int i=0;i<str.length();i++) {
    	 for(int j=i+1;j<str.length();j++) {
    		 if(ch[i]==ch[j]) {
    			 count++;
    			 System.out.println("duplicate character is: "+ch[i]);
    	    	 break;
    		 }
    		 
    	 }
     } 
	}

}
