package JavaPackage1;

public class MOlab297 {

	public static void main(String[] args) {
	Too t=new Too();
	int a=t.add(20,30);
	System.out.println(a);
	int b=t.add(30,40,40);
	System.out.println(b);

	}

}
class Too{
	int add(int a,int b) {
		System.out.println("add(int,int)");
		return a+b;
	}
	int add(int a, int b, int c) {
		System.out.println("add(int,int,int)");
		return a+b+c;
	}
}
