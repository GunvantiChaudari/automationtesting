package NewAssignment;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Nashik";
		String S2="Nashik";
		String s3="Pune";
		String s4=new String("Nashik");
		System.out.println("compare s1 & s2: "+s1.equals(S2));
		System.out.println("compare s1 & s4: "+(s4==s1));
		//System.out.println(" concatination of two string using + "+(s1=s1+s3));
		//System.out.println(" concatination of two string using method "+(s1.concat(s3)));
		System.out.println("find charecter at given index: "+(s1.charAt(2)));
		System.out.println("find length of string: "+s1.length());
		System.out.println("find the charecter in string: " +s1.contains("as"));
		System.out.println("find the starting in string: " +s1.startsWith("Na"));
		System.out.println("find the ending in string: " +s1.endsWith("k"));
		System.out.println("find the index of charecter in string: " +s1.indexOf('i'));
		System.out.println("find the last index in string: " +s1.lastIndexOf('i'));
		System.out.println("find the string is empty:  " +s1.isEmpty());
		
		
		
		
			

	}

}
