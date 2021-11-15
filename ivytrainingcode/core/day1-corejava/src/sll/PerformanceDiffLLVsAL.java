package sll;

import java.util.*;

public class PerformanceDiffLLVsAL {

	public static void main(String[] args) {
		List<Long> list1=new LinkedList<Long>();
		
		List<Long> list2=new ArrayList<Long>();
		
		//Banchmarking*: performace calcuation: tools
		
		System.out.println("AL");
		doBenchmark(list2);
		
	}

	private static void doBenchmark(List<Long> list1) {
		//first i will add 1L element into list
		for(long i=0;i<1E5; i++) {
			list1.add(i);
		}
		
		long start=System.currentTimeMillis();
		for(long i=0;i<1E5; i++) {
			list1.add(0, i);
		}

		long end=System.currentTimeMillis();
		
		System.out.println("time taken: "+ (end-start)+" ms");
	}
}

/*
 *
LL
time taken: 9 ms

AL
time taken: 2109 ms

 */





