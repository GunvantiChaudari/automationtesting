package NewAssignment;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation2 a1=new Encapsulation2 ();
		System.out.println("circle is shape: "+a1.getcircle());
		System.out.println("square is shape: "+a1.getsquare());
		System.out.println("rectangle is shape: "+a1.getrectangle());
		a1.setcircle(30);
		a1.setsquare(15.3);
		a1.setrectangle(12.3f);
		System.out.println("circle is: "+a1.getcircle());
		System.out.println("square is:"+a1.getsquare());
		System.out.println("rectangle is:"+a1.getrectangle());
		
	}
    private int circle;
    private double square;
    private float rectangle;
	public int getcircle() {
		return circle;
	}
    public double getsquare() {
    	return square;
    }
    public float getrectangle() {
    	return rectangle;
    }
    public void setcircle(int circle) {
    	this.circle=circle;
    }
    public void setsquare(double square) {
    	this.square=square;
    }
    public void setrectangle(float rectangle) {
    	this.rectangle=rectangle;
    }
}
