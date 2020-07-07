package JavaPackage1;

public class Molab298 {

	public static void main(String[] args) {
	Finish F=new Finish();
	int a=F.add(10,20);
	System.out.println(a);
	String b=F.add(98,"amena");
	System.out.println(b);

	}

}
class Finish{
	int add(int a, int b) {
		System.out.println("add(int,int)");
		return a+b;
	}
String add(int a, String b) {
	System.out.println("add(int,String)");
	return a+b;
}
}
