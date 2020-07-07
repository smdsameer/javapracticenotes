package JavaPackage1;

public class warpperlab524 {

	public static void main(String[] args) {
	JlcService jser=new JlcService();
	byte by1=12;	byte by2=23;
jser.show(by1,by2);
	}

}
class JlcService{
	void show(int ab,int bc) {
		System.out.println("\n show (int-int)");
	}
	void show(Byte ab,Byte bc) {
		System.out.println("\n show (Byte-Byte)");
	}
	void show(byte ab,byte bc) {
		System.out.println("\n show (byte...)");
	}
	void show(byte...ab) {
		System.out.println("\n show(byte...)");
	}
}