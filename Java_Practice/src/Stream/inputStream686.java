package Stream;

import java.io.BufferedInputStream;

public class inputStream686 {

	public static void main(String[] args)  {
System.out.println("Enter data");
try {
	BufferedInputStream bis=new BufferedInputStream(System.in);{
		while(true) {
			int asc=bis.read();
			if(asc==13)break;
			char ch=(char)asc;
			System.out.print(ch);
		}
	}} catch(Exception e) {
		e.printStackTrace();
	}
}}