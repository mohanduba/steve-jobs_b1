package Collections;

import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer input1[] = {1,30,43,20,5};
		RegistrationData std1 = new RegistrationData();
		RegistrationData std2 = new RegistrationData();
		std1.setId(123);
		//System.out.println(std1.getId());
		std1.setName("MOHAN");
		//System.out.println(std1.getName());
		std1.setGender('M');
		//System.out.println(std1.getGender());
		std1.setEmail("mohan@gmail.com");
		//System.out.println(std1.getEmail());
		std1.setDob(new Date());
		//System.out.println(std1.getDob());
		std1.setMobile(123456789l);
		//System.out.println(std1.getMobile());
		
		std2.setId(1234);
		//System.out.println(std2.getId());
		std2.setName("CPS");
		//System.out.println(std2.getName());
		std2.setGender('M');
		//System.out.println(std2.getGender());
		std2.setEmail("cps@gmail.com");
		//System.out.println(std2.getEmail());
		std2.setDob(new Date());
		//System.out.println(std2.getDob());
		std2.setMobile(987654321l);
		//System.out.println(std2.getMobile());
		
		RegistrationData []inputArray = {std1,std2};
		
		for(Integer e:input1) {
			
			System.out.print(" "+e);
		}
		System.out.println();
		List list = new ArrayList<>();
		
		list.add(std1.id);
		list.add(std1.name);
		list.add(std1.gender);
		list.add(std1.email);
		list.add(std1.dob);
		list.add(std1.mobile);
		list.add(std2);
		//list.get(1);
		System.out.println(list);
		System.out.println(list.get(0)); //using get method
		
		List<RegistrationData> list2 = new ArrayList<RegistrationData>();
		
		for(RegistrationData ele:inputArray) {
			System.out.println("StudentId::"+ele.id);
			System.out.println("StudentName::"+ele.name);
			System.out.println("StudentGender::"+ele.gender);
			System.out.println("StudentEmail::"+ele.email);
			System.out.println("StudentDob::"+ele.dob);
			System.out.println("Studentmobile::"+ele.mobile);
			System.out.println(" ");
			
		}
		
		
		
	}
	
	
}
