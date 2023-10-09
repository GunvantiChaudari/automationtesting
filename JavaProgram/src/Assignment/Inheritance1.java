package Assignment;

import java.util.Arrays;

class fruit{
	fruit(int num){
		System.out.println("i am parent class constructor");
	}
		public void taste() {
		int arr[]= {10,20,30,40,50,60};
		int size=arr.length;
		int first=arr[0];
		for(int j=0;j<size-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[size-1]=first;
		System.out.println("left rotate array: "+Arrays.toString(arr));
		}
		
}

class mango extends fruit{

	mango(){
		super(25);
		System.out.println("i am a child class constructor");
	}
	public void apple() {
		System.out.println("apple is fruit");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		mango a1=new mango();
		a1.taste();
		a1.apple();

	}


}