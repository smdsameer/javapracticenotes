package JavaPackage1;

public class MPlab301 {

	public static void main(String[] args) {
 run r=new run();
 byte b=20;
 r.add(20,b);
 r.add(b,30);

	}

}
class run{
	void add(int a,byte b) {
		System.out.println("add(int,byte)");
	}
	void add(byte a,int b) {
		System.out.println("add(byte,int)");
	}
}