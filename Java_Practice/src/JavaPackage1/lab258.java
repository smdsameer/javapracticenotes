package JavaPackage1;

public class lab258 {

	public static void main(String[] args) {
System.out.println("iam main()");
int a=90;
{
	int a=30;//duplicate local variable can't be assinged //
	System.out.println("iam local Block 1 in main() :"+a);
}
	}

}
