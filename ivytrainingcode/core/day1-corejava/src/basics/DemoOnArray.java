package basics;
class Dog{
	String color;
	Dog(String c){
		color=c;
	}
}
public class DemoOnArray {

	public static void main(String[] args) {
		int []arr2=new int[5];
		
		
		Dog []dogs=new Dog[5];
		
		dogs[0]=new Dog("black");
		dogs[1]=new Dog("black");
		dogs[2]=new Dog("white");
		dogs[3]=new Dog("black");
		dogs[4]=new Dog("brown");
		dogs[5]=new Dog("black");
		
		
		
		//how many dogs are there in this array?
		
		for(Dog dog: dogs) {
			System.out.println(dog.color);
		}
		
		
		
		//can we create array of objects?
		
		
//		String names[]= {"raj","rajiv","keshav","gunika"};
//		for(String name: names) {
//			if(name.contains("raj"))
//			System.out.println(name);
//		}
		
		
		
		
		//what is array?
		int arr[]= {4,6,7,8};//they are objects
		
		//1. how to iterate it
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//2. enhanced loop
		
//		for(int temp: arr) {
//			System.out.println(temp);
//		}
		
		//3. using java 8 syn*
	
	}
}
