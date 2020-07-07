package JavaPackage1;

public class MethosOverloadinglab296 {

	public static void main(String[] args) {
	Start S=new Start();
	int a=S.add(10,20);
	System.out.println(a);
	S.add(10,20);
    
	}

}
class Start{
	int add(int a,int b) {
		System.out.println("add(int,int)");
		return a+b;
	
       
	}
}