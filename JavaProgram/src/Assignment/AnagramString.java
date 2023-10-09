package Assignment;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String A="LISTEN";
        String B="SILENT";
        char ch[]=A.toCharArray();
        char gh[]=B.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(gh);
        if(Arrays.equals(ch, gh)) {
        	System.out.println("both strings  are a anagram ");
        }else {
        	System.out.println("both strings  are not a anagram ");
        }
	}

}
