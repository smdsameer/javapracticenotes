package JavaPackage1;

public class Mplab299 {

	public static void main(String[] args) {
		janny j=new janny();
		String g=j.add(99,"sam");
		System.out.println(g);
		String h=j.add("sam",90);
		System.out.println(h);

	}

}
class janny{
	String add(int g,String h) {
		System.out.println("add(int,String)");
		return g+h;
	}
String add(String g,int h) {
		System.out.println("add(String,int)");
		return g+h; 	
	}
	
}

