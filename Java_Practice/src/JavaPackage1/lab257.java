package JavaPackage1;

public class lab257 {

	public static void main(String[] args) {
		System.out.println("iam main()");
		{
			int a=10;
			System.out.println("iam Local Block 1 in main() :"+a);
		}
		{
			int a =20;
			System.out.println("iam local Block 2 in main() :"+a);
		}
		{
			String a="sam";
			System.out.println("iam local block 3 in main() :"+a);
		}
	}

}
