package hashing;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class FreqOfEachWord {

	public static void main(String[] args) throws IOException {
			//word , freq
		Map<String, Integer>map=new TreeMap<String, Integer>();
		
		
		BufferedReader br=new BufferedReader(new FileReader("data2.txt"));
		
		String line=null;
		while((line =br.readLine())!=null) {
			String tokens [] =line.split(" ");
			
			for(String token : tokens) {
				if(map.containsKey(token)) {
					Integer freq= map.get(token);
					freq++;
					map.put(token, freq);
				}else {
					map.put(token, 1);
				}
			}
		}
		
		//print the map
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
	}
}





