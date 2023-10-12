
class IfConditions {
static	int a = 10;
static	int b = 50;
	    int c = 50;
	    int d = 60;
public static void main(String[]input) {
IfConditions i = new IfConditions();
i.test();
}
void test(){
if(c==b) {
	System.out.println("c is equal than b");
}
if(a>b) {
	System.out.println("a is less than b");
}
else if(c>b) {
	System.out.println("a is greater than b");
}
else if(c==d) {
	System.out.println("c is less than d");
}
else {
	System.out.println(a);
}

}
}