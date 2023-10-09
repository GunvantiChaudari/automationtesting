package NewAssignment;
class student{
	student(int git){
		System.out.println("i am a tudent class constructor"+git);
	}
	void rollno(int num) {
		int rem,rev=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}if(temp==rev) {
			System.out.println("number is pallindrome");
		}else {
			System.out.println("number is not a pallindrome");
		}
	}
}
class student1 extends student{
	student1(){
		super(20);
		System.out.println(" iam a student 1 class constructor");
	}
	void rollno(){
		int number=168;
		int rem,rev=0,temp;
		temp=number;
		while(number>0) {
			rem=number%10;
			rev=(rev*rev*rev)+rem;
			number=number/10;
		}if(temp==rev) {
			System.out.println("number is amstrong");
		}else {
			System.out.println("number is not a amstrang");
			super.rollno(151);
		}
	}
}

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 A1=new student1();
		A1.rollno();


	}
}