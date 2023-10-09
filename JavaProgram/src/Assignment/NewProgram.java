package Assignment;

import java.util.Arrays;
import java.util.HashMap;

public class NewProgram {
public static void main(String[]args) {
	/*String str="gunvanti";
	String rev=" ";
	char ch[]=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		rev+=ch[i];
	}
	System.out.println("the reverse number is:"+rev);
	String a="silent";
	String b="listen";
	a=a.toLowerCase();
    b=b.toLowerCase();
	if(a.length()!=b.length()) {
		System.out.println("both string are not anagram");
	}else {
		char ch[]=a.toCharArray();
		char dh[]=b.toCharArray();
		Arrays.sort(dh);
		Arrays.sort(ch);
		if(Arrays.equals(ch, dh)==true) {
			System.out.println("both string are anagram");
		}else {
			System.out.println("both string are not anagram");
		}	
	}*/	
	String str="Gunavanti";
	HashMap<Character,Integer> a1=new HashMap<>();
	for(int i=str.length()-1;i>=0;i--) {
		if(a1.containsKey(str.charAt(i))) {
			int count=a1.get(str.charAt(i));
			a1.put(str.charAt(i), ++count);
		}else {
		a1.put(str.charAt(i),1);
		}
	}
	System.out.println("occurance of each character:"+a1);
}
}
