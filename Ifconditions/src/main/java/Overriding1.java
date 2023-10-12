

public class Overriding1 {
	void display() {
		System.out.println("Parent");
	}
}
class Overriding2 extends Overriding1{
	void display() {
		System.out.println("child");
	}
}
class Main{
public static void main(String[]args) {
	Overriding2 o = new Overriding2();
	o.display();
}
}
