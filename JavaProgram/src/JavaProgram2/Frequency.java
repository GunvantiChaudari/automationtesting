package JavaProgram2;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int git[]= {10,20,10,20,30};
		Arrays.sort(git);
		int size=git.length;
		for(int a:git) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int i=(size-1);i>=0;i--) {
			System.out.print(git[i]+" ");
		}
		for (int i=0;i<size;i++) {
			int count=1;
			while(i<size-1 && git[0]==git[i+1]) {
				i++;
				count++;
			}
			System.out.println(git[i] + " "+count);
		}



	}

}
