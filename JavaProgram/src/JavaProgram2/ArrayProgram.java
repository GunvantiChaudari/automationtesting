package JavaProgram2;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgram.add(10);
		ArrayProgram.sub(new int[]{10,20,30});
		ArrayProgram.multi(new char[] {'a','b','c'});
		System.out.println(ArrayProgram.div());
	}
	 int [] arr;
	/*  int array[] ;
       
        array=new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        for(int i=0;i<array.length;i++) {
        	System.out.println(array[i]);
        }
        int arr[]= {10,20,30,40};
        char wee[]= {'a','b','c','d'};
        for(int a:arr) {
        	System.out.println(a);
        }
        System.out.println("***********");
        for(char c:wee) {
        	System.out.println(c);
        }*/



	public static void add(int a) {

		System.out.println("a:"+a);
		System.out.println("**********8");
	}

	public static void sub(int a[]) {
		//a=new int[10];
		for(int b:a) {
			System.out.println(b);

		}
	}
	static void multi(char G[]) {
		for(char c:G) {
			System.out.println(c);

		}
		//for(int i=0;i<G.length;i++) {
		System.out.println(G[2]);
		//}
	}
	public static int[] div(){
		System.out.println("div:");
		return new int[] {1,2,3,4};
		
		
	}





}
