package NewAssignment;

public class Encap {
    private int f=10;
    private double g=3.1d;
    private char h='a';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap S1 = new Encap();
		System.out.println("f:"+S1.getF());
		System.out.println("g:"+S1.getG());
		System.out.println("h:"+S1.getH());
		S1.setF(30);
		S1.setG(4.5d);
		S1.setH('e');
		System.out.println("f:"+S1.getF());
		System.out.println("g:"+S1.getG());
		System.out.println("h:"+S1.getH());
		

	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public double getG() {
		return g;
	}
	public void setG(double g) {
		this.g = g;
	}
	public char getH() {
		return h;
	}
	public void setH(char h) {
		this.h = h;
	}

}
