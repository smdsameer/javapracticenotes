package JavaPackage1;

public class Methodsparameterlab293 {

	public static void main(String[] args) {
		Janu J=new Janu();
		System.out.println(J.show(20));
	}

}
class Janu{
	int show(int x) {
		System.out.println("show()");
		return x+1;
	}
}
