package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertClass {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
     FileInputStream a1=new  FileInputStream ("D:\\AUTOMATION SESSION\\Workspace\\JavaProgram\\PropertyFile\\Sample.properties" );
     Properties prop = new Properties();
     prop.load(a1);
     System.out.println(prop.getProperty("username"));
     System.out.println(prop.getProperty("surname"));
     System.out.println(prop.getProperty("email"));
     String ai=prop.getProperty("age");
     int a=Integer.parseInt(ai);
     FileOutputStream agh=new FileOutputStream("D:\\AUTOMATION SESSION\\Workspace\\JavaProgram\\PropertyFile\\Sample.properties" );
     prop.setProperty("tester","manual");
     prop.store(agh, ai);
     agh.close();
	}

}
