
interface A {
	void Adisplay();

}
interface B{
	void Bshow();
}
class AB implements A,B{
	public void Adisplay() {
		System.out.println("Parent");
	}
	public void Bshow() {
		System.out.println("Parent");
	}
	
}
public class Hello{
public static void main(String[]args) {
	AB a = new AB();
	a.Adisplay();
}
}
