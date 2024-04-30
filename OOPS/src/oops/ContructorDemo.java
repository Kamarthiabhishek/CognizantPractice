package oops;

class Student{
	String name;
	int age;
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	//Constructor
	Student(){
		System.out.println("Constructor called!!");
	}
	//Constructor overloading
	//parameterized constructor
	Student(String ename, int age){
		this.name = ename; //here this.name refers to the object name name refers to the passed argument
		this.age = age;
	}
}

public class ContructorDemo {

	//Constructor is used to initialize the objects
	
	//Constructor has no return type
	
	//Constructor can be called only once(when object is defined)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();//constructor is called as soon as object is created
		System.out.println("Object created");
		//Java has it's own constructor built, but when we explicitly create our own constructor then that constructor is called.
		
		Student s1 = new Student(); //Again the constructor is called when another object is created
		s1.name = "Sravani";
		s1.age = 23;
		s1.print();
		
		Student s2 = new Student("Abhi",23); //Passing parameters to the parameterized constructor
		s2.print();
	}

}
