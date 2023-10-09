package Assignment;

public class ReversePreservingposition {
	//Reverse the string with preserving the position of spaces
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="i am not a string";
    char ch[]=str.toCharArray();
    String gh="";
    char sh[]=gh.toCharArray();
    for(int i=0;i<str.length();i++) {
    	if (ch[i]==' ') {
    		sh[i]=' ';
    	}
    }
    int j=sh.length-1;
    for(int i=0;i<ch.length;i++) {
    	if(ch[i]!=' ') {
    		if(sh[j]==' ') {
    			j--;
    		}
    		sh[j]=ch[i];
    		j--;	
    	}
    }
    System.out.println(String.valueOf(sh)); 
	}

}
