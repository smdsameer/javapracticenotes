package Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileIPstream {

	public static void main(String[] args) {
System.out.println("Enter data");
try { 
	FileInputStream fis=new FileInputStream("\"G:\\New Text Document.txt\"");
	BufferedInputStream bis=new BufferedInputStream(fis);{
		while(true) {
			int asc=bis.read();
			if(asc==-1) break;
			char ch=(char)asc;
			System.out.print(ch);
		}
	}}catch(Exception e) {
		e.printStackTrace();
	}
}

	}


