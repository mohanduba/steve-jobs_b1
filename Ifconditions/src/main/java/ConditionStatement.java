
public class ConditionStatement {
public static void main(String[]args) {
ConditionStatement cs = new ConditionStatement();
	cs.getBiggerNumbers(3,9,5);
}
	
void getBiggerNumbers(int a,int b,int c) {
	if(a>b && a<c) {
		System.out.println(a +" is bigger");
		
	}
	else if(b>a && b<c) {
		System.out.println(b +" is bigger");
	}
	else {
		System.out.println(c +" is 2nd bigger");
	}
}
}




