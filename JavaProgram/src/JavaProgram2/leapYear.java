package JavaProgram2;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Leapyear();
	}
	static void Leapyear() {
		int yrs=2023;
	if (yrs%4==0 || yrs%400==0 || yrs%100==0  ) {
		System.out.println("this is a leapyear: "+yrs);
				}else {
					System.out.println("this is a not leapyear: "+yrs);
				}	
	}
		
	

}
