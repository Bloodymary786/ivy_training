package hashing;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.*;
/*
 * read  the file 
 * till it is not finished 
 * then make token of each line
 * then put that into set (dont allow duplicates)
 * finally print it
 */
public class DemoHashing {

	public static void main(String[] args) throws IOException {
		
		//downcasting and upcasting *
		
		Set<String> words=new LinkedHashSet<String>();
		
		BufferedReader br=new BufferedReader(new FileReader("data2.txt"));
		
		String line=null;
		while((line =br.readLine())!=null) {
			//token of each line and then put into HashSet, LinkedHashSet, TreeSet(R B tree algo)
			String tokens [] =line.split(" ");// it will return u array of strings
			
			for(String token : tokens) {
				words.add(token.toLowerCase());
			}
		}
		//print all the tokens 
		for(String word: words) {
			System.out.println(word);
		}
		
		// HashMap, hashtable, HashSet
		//Set
	}
}





