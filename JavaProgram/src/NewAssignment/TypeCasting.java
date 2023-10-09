package NewAssignment;

public class TypeCasting {
 double d=19;//implicit narrowing to small 64bit to 32bit
 double d1=(int)15;//explicitly narrowing(big to small 64 bit to 32bit
 int a=10;
 double s=(double)a;//explicitly widning to small 32 bit to big 64bit
  public double castig() {
	  return a;//implicit widning 
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCasting g=new TypeCasting();
		System.out.println(g.d);
		System.out.println(g.d1);
		System.out.println(g.a);
		System.out.println(g.s);
		System.out.println(g.castig());
		
	}
	

}
