package JavaPackage1;

public class MPlab294 {

	public static void main(String[] args) {
		abc h=new abc();
		byte b=112;
		h.show(b);
		h.show((byte)112);
	}

}
class abc{
	void show(byte x) {
		System.out.println("show(byte)");
	}
}
