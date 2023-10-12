package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = new ArrayList<>();
		
		list.add(2);
		list.add(30);
		list.add(20);
		list.add(22);
		list.add(11);
		list.add(20);
		System.out.println(list);
		
Set set = new TreeSet<>();
	set.add(2);
	set.add(30);
	set.add(20);
	set.add(22);
	set.add(11);
	set.add(20);
	System.out.println(set);
	
Set set1 = new HashSet<>();
	set1.add(2);
	set1.add(30);
	set1.add(20);
	set1.add(22);
	set1.add(11);
	System.out.println(set1);
	}

}
