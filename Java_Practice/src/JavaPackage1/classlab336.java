package JavaPackage1;

public class classlab336 {

	public static void main(String[] args) {
		Apple A=new Apple();
        System.out.println(A.P);
        A.P=99;
        System.out.println(A.P);
	}

}
class Apple{
	int P;
}