package JavaPackage1;

public class MPlab303 {

	public static void main(String[] args) {
sorry s=new sorry();
s.show(null);
s.show("sami");

	}

}
class sorry{
	void show(String sami ) {
		System.out.println("show(string)");
	}
		void show(Object sami){
			System.out.println("Show(object)");
		}
	}
