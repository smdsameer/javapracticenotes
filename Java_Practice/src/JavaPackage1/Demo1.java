package JavaPackage1;

public class Demo1 {
 	
	public static void main(String args[]) {
Hello h=null;
System.out.println("Ref Created :");
h=new Hello();
	}
}
class Hello{
	
	{
		System.out.println("Instance Block :");
	}
	static{
    System.out.println("Static Block :");		
	}
}
