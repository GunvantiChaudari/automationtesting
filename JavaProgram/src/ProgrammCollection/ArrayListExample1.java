package ProgrammCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a1=new ArrayList();
		a1.add("ABC");
		a1.add("xyz");
		a1.add("pqr");
		a1.add("xyz");
		System.out.println(a1);
		System.out.println("list a2 has java or not: "+a1.contains("ABC"));
		System.out.println("index of pqr is: "+a1.indexOf("pqr"));
		System.out.println("size of element are: "+a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			Collections.sort(a1);//acending order
			Collections.reverse(a1);
			System.out.println("reversing sorted element of collection: "+a1);
			
		}
	}
}
