package Assignment;

import java.util.HashSet;

public class Hasset {

	public static void main(String[] args) {
			HashSet<String> set=new HashSet<String>();
			set.add("cat");
			set.add("dog");
			set.add("pig");
			System.out.println("all element:"+set);
			set.remove("dog");
			System.out.println("all element:"+set);
			
	}		
	}


