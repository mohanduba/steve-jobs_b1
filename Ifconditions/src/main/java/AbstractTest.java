
abstract class AbsractTest {
abstract void display();
}
abstract class AbstractTest1 extends AbsractTest{
void display() {
	System.out.println("Hello");	
}
 abstract void show();
}

class AbstractTest2 extends AbstractTest1 {
	void show() {
		System.out.println("Hiii");
	}
}

