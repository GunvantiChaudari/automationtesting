package JavaProgram2;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         constructor A1=new constructor();
		 constructor A2=new constructor(30);
		 constructor A3=new constructor(20,40);
	}
		constructor()  {
    	   System.out.println("this is a costructor");
		} 
       constructor(int a){
    	   System.out.println("value of a;"+a);
       }
	   constructor(int c,int b){
		   System.out.println("value of c:"+c);
		   System.out.println("value of d:"+b);
	   }

}
