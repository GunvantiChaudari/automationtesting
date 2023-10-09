package Assignment;

public class CountOccurance {
	//How to count occurrences of each character in a string in java?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="character";
		final int MAX_CHAR=256;
		int size=str.length();
		int[] count=new int[MAX_CHAR];
		for(int i=0;i<size;i++) 
			count[str.charAt(i)]++;
		char a[]=new char[size];
		for(int i=0;i<size;i++) {
			a[i]=str.charAt(i);
			int count1=0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i)==a[j]) {
					count1++;
				}
			}
			if(count1==1) {
				System.out.println(count[str.charAt(i)]+"  "+str.charAt(i));
		}
		}
	}
}
