package Assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueElement {
//WAP to get unique elements only from the list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String>a1=new ArrayList<String>();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("b");
        a1.add("d");
        a1.add("a");
        a1.add("c");
        a1.add("s");
        System.out.println("original arraylist value:"+a1);
        HashSet<String> b1=new HashSet<String>(a1);
        System.out.println("ArrayList unique value is:"+b1);
	

}
}