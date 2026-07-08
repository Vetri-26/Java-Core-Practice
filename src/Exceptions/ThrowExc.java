package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExc {

	public static void main(String[]args) {
		try {
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void read() throws FileNotFoundException{
		FileReader read=new FileReader("document.txt");
	}
	
}
