
public class Singleton {
	int input1=10;
	int input2=20;
	int input3=30;
static Singleton a;
private Singleton(){
	
}
public static Singleton singletonTest(){
	if(a==null) {
		a=new Singleton();	
		}
	return a;
	
}

}


