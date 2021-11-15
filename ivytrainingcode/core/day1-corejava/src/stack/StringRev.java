package stack;
import java.util.*;
public class StringRev {

	public static void main(String[] args) {
		
		String data="i love java";
		char arr[]=data.toCharArray();//it covert the string to array of chars
		
		//Why it is poor in performance? String pool?
		
		//WE NEED TO LEARN HOW String WORKS INTERNALLY!
		
		String dataRev="";
		for(int i=arr.length-1; i>=0; i--) {
			dataRev= dataRev +arr[i];
		}
		System.out.println(dataRev);
		
		
		
		/*	String					StringBuilder			StringBuffer
		 * immutable*				mutable					mutable
		 * 							fast					slow(thread safe*)
		 * 
		 */
		
		
		//String vs StringBuilder vs StringBuffer : what is the diff
		//Why string dont have revese function?
		
//		String data="i love java";
//		System.out.println(data);
//		
//		//there is no reverse method ?
//		
//		String revData=new StringBuilder(data).reverse().toString();
//		System.out.println(revData);
		
		
		
	}
}
