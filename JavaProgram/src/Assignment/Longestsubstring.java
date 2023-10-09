package Assignment;

import java.util.HashMap;

public class Longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="stringsalsa";
          Longestsubstring(str);
	}
	public static void Longestsubstring(String s1) {
		char chararray[]=s1.toCharArray();
		String temp=" ";
		int count=0;
	HashMap<Character,Integer> a1=new HashMap<Character,Integer>();
		for(int i=0;i<chararray.length;i++) {
			char ch=chararray[i];
			if(!a1.containsKey(ch)) {
				a1.put(ch, i);
			}else {
				i=a1.get(ch);
				a1.clear();
			}
			if (a1.size()>count) {
				count=a1.size();
				temp=a1.keySet().toString();
			}
		}
		System.out.println("actual string: " +s1);
		System.out.println("Longest substring: " +temp);
		System.out.println("size for longest substring : " +count);
		
	}

}
