package JavaProgram2;
//find a smallest element of array
public class ArrayProgra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgra a1=new ArrayProgra();
		a1.smallest(new int[]{10,3,40,5,8});
		a1.largest(new int[]{70,30,20,40,10});


		}
		void smallest(int git[]) {
			int min=git[0];
			for(int i=1;i<git.length;i++) { //i=1 ,i=2,i=4
				if(min>git[i]) {   //min=10   10>20 nahiye 
					min=git[i];//min=6,min=5
				}
			}
			System.out.println("minimum number: "+min);

		}
		void largest(int sit[]) {
			int max=sit[0];
			for(int i=1;i>sit.length;i++) {
				if(max<sit[i]) {
					max=sit[i];
				}
			}
			System.out.println("maximum number: "+max);
		}
	}