package NewAssignment;
public class Encapsulation{
	private int x=20;
     
	public static void main (String[]args) {
		Encapsulation A1= new Encapsulation();
		System.out.println("x:"+A1.getx());
		A1.setx(50);
		System.out.println("x:"+A1.getx());
			}
	public int getx() {
		return x;
		
	}
	public void setx(int x) {
		this.x=x;
	}
}