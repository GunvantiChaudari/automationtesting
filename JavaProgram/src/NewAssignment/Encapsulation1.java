package NewAssignment;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 a1=new Encapsulation1();
		System.out.println( " i am a ssn:" +a1.getssn());
		System.out.println(" i am a team:" +a1.getteam());
		a1.setssn(30);
		a1.setteam(15.2);
		System.out.println("ssn:" +a1.getssn());
		System.out.println("team:" +a1.getteam());

	}
    private int ssn;
    private double team;
    public int getssn() {
    	return ssn;
    }
    public double getteam() {
    	return team;
    }
    public void setssn(int ssn) {
    	this.ssn=ssn;
    }
    public void setteam(double team) {
    	this.team=team;
    }
}
