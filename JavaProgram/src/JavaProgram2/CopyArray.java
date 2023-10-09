package JavaProgram2;
// program to copy of element of one array into another array
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original[]= {10,30,20,50};
		int copy[]=original.clone();
		for(int j:copy) {
			System.out.println(j);
		}
		

	}

}
