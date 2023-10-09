package ProgrammCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List <Integer>a1=new ArrayList<Integer>();
       List <Integer>a2=new ArrayList<Integer>();
      // a2.add(0);
     //  a2.add(1);
     //  a2.add(2);
      // System.out.println(a2.get(2));
      // System.out.println(a2.set(0, 3));
       System.out.println(a2);
       a1.add(3);
       a1.add(4);
       a1.add(1, 5);
       a1.addAll(a2);
       /*a1.addAll(1, a2);
       a1.remove(0);
       a1.removeAll(a2);
       a1.get(1);
       System.out.println(a1.get(1));
       System.out.println(a1.set(0, 7));
       System.out.println(a1);*/
       Iterator obj=a1.iterator();
       while(obj.hasNext()) {
    	   System.out.println(obj.next());
       }
       
       
       
	}

}
