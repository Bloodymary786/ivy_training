package basics;

public class DateProblem {

	public static void main(String[] args) {
		int dd, mm, yyyy;
		dd = 31;
		mm = 12;
		yyyy = 2021;

		System.out.println("date is : " + dd + "/" + mm + "/" + yyyy);

		// next date ?
		// 1. u need to take care about leap year
		
		// 2. need to mange no of days in a month
		int noOfDays[]= {-1, 31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(yyyy))
			noOfDays[2]=29;
		
		// 3. u need to manipuate date ...
		
		dd=dd+1;
		if(dd>noOfDays[mm]) {
			dd=1;
			mm++;
			if(mm>12) {
				mm=1;
				yyyy++;
			}
		}

		System.out.println("date is : " + dd + "/" + mm + "/" + yyyy);
		
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}



