package JavaPackage1;

public class autoboxing {

	public static void main(String[] args) {
	Boolean B1=true;   // auto boxing
	Boolean B2=true;
	System.out.println(B1==B2);  //true
	boolean b=true;
	Boolean b1=new Boolean(b);
	Boolean b2=new Boolean(b);
	System.out.println(b1==b2);  //false
	}

}
