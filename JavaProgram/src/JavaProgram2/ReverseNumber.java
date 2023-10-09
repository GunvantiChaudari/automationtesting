package JavaProgram2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number();
	}
	static void Number() {
		int  num=234;
		int temp=num;
		int rev=0,rem;
		while (num!=0) {
			rem=num%10;//4,3,2
			rev=rev*10+rem;//4,43,432
			num=num/10;//23,2,
		}
		System.out.println("reverse number is: "+rev);
		if (rev==temp) {
			System.out.println("number is pallindrome");
		}else {
			System.out.println("number is not pallindrome");
		}
	}

}
