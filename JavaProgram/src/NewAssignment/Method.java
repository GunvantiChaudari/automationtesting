package NewAssignment;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orignal();
	}

	private static void orignal() {
		int num=162,rem=0;
		int rev=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}if (rev==temp) {
			System.out.println("the number is pallindrome");
		}else {
			System.out.println("the number is not pallindrome");
		}
	}
}