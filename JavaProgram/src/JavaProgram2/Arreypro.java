package JavaProgram2;

public class Arreypro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arreypro.sit (new int []{40,50,30});
		Arreypro.kit(new int[] {01,02,03});
		System.out.println(new int[]{90,80,70});
		
		int mul[]= {10,20,30};
		for(int i:mul) {
			System.out.println(i);
		}
		System.out.println("*********");
		int kit[]= {20,30,40};
		for(int g:kit) {
			System.out.println(g);
		}
		System.out.println("***********");
		int dig[]= {20,30,50};
		for(int j:dig) {
		System.out.println(j);
	}
	}
	static void sit(int dit[] ){
		for(int d:dit) {
			System.out.println(d);
		}
		
	}
	static void kit(int jiy[]) {
		for(int l:jiy) {
			System.out.println(l); 
			
		}
	}	
	static int[] min(){
		for(int o:min()) 
		System.out.println("min");
		return new int[] {90,80,70};
		
	}

}