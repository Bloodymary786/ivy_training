package string_demo;
class Dog{
	
}
public class DemoString {

	public static void main(String[] args) {
		
		//String vs StringBuffer vs StringBuilder
		//String are immutable and thread safe=> String pool*
		
		String name="raja";
		String name2=new String("raja");
		String name3="raja";
		System.out.println(name==name2);
		System.out.println(name==name3);
		
//		Dog d=new Dog();
//		
//		String name="raja";
//		String name2=new String("raja");
//		
		
		name.toUpperCase();
		//System.out.println(name);
//		String []names= {"raj","ravi","kamal"};
//		
//		for(String name: names) {
//			System.out.println(name);
//		}
	}
}
