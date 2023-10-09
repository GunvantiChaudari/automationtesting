package JavaProgram2;
class amstrong1{
void calling() {
	  int num=153;
	  int rem,rev=0,temp;
	  temp=num;
	  while(num>0) {
		  rem=num%10;
		  rev=(rem*rem*rem)+rev;
		  num=num/10;  
	  }if (temp==rev) {
		  System.out.println("number is a armstron");
	  }else {
		  System.out.println("number is a not a armstrong");
	  }
	  
}
}
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amstrong1 A1=new amstrong1();
		A1.calling();
		

	}
	

}
