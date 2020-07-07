package JavaPackage1;

public class MPlab300 {

	public static void main(String[] args) {
		Challo C=new Challo();
		byte b=20;
		C.add(b,40);
		C.add(23,b);

	}

}
class Challo{
	void add(byte a,int b) {
		System.out.println("add(byte,int)");
	}
	
	
	void add(int a,byte b) {
		System.out.println("add(int,byte)");
}
	}