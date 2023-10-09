package NewAssignment;
interface chip{
	void shape();
}
interface square{
	void shape();
}
class rectangle implements chip,square{
	public void shape() {
		int a[]= {10,20,30,10,40};
		int min=a[0];
		for (int i=0;i>a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("minimum number:"+min);
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle a1=new rectangle ();
		a1.shape();
		
	}
}
