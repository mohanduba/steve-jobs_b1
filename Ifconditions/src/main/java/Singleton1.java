
public class Singleton1 {
public static void main(String[]args) {
Singleton st = Singleton.singletonTest();
System.out.println(st.input1);
Singleton st2 = Singleton.singletonTest();
System.out.println(st2.input2);
System.out.println(st2.input1);
}
}

