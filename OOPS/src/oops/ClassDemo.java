package oops;

class pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing something");
	}
	public void print() {
		System.out.println(this.color); //this is used to refer the object that calls the function
		System.out.println(this.type);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		pen p1 = new pen(); //creating the object of the pen class
		p1.color ="Blue"; //initializing the color
		p1.type = "Gel"; //initializing the type
		p1.write(); //calling the write function
		p1.print(); //calling the print function
	}

}
