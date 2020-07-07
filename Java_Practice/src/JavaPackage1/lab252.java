package JavaPackage1;

public abstract class lab252 {

	public static void main(String[] args) {
		System.out.println("main :"+saki.a);
	}

}
class saki{
	static int a;
	static{
		final int b=20;
		System.out.println(a);
		System.out.println(b);
	}
}