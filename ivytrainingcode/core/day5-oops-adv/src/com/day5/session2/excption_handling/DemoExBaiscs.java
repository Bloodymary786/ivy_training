package com.day5.session2.excption_handling;
import java.io.*;

//ex of checked ex
public class DemoExBaiscs {

	public static void main(String[] args)  {
		try {
			BufferedReader br=new BufferedReader(new FileReader("demo.txt"));
			System.out.println("file is found");
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}
		
	}
}
