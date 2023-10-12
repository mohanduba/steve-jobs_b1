
public class BasicInfo extends StudentInfo{
public static void main(String[]args) {
BasicInfo basic = new BasicInfo();
basic.setUserId("123A");
System.out.println("StudentID:"+basic.getUserId());

basic.setFirstName("MohanRao");
System.out.println("FirstName:"+basic.getFirstName());

basic.setLastName("Duba");
System.out.println("LastName:"+basic.getLastName());

basic.setGender("Male");
System.out.println("Gender:"+basic.getGender());

basic.setEmail("mohanraoduba45@gmail.com");
System.out.println("DoorNo:"+basic.getEmail());

basic.setCourseName("Java Full Stack");
System.out.println("StudentCourseName:"+basic.getCourseName());

basic.setCourseName("2023-2024");
System.out.println("CourseDuration:"+basic.getCourseName());

basic.setDateOfJoin("2023-08-07");
System.out.println("JoiningDate:"+basic.getDateOfJoin());

basic.setCourseSubBranch("IT");
System.out.println("SubBranch:"+basic.getCourseSubBranch());

basic.setdNo("16-705A");
System.out.println("DoorNo:"+basic.getdNo());
	
basic.setApartment("LivSpace");
System.out.println("Residency:"+basic.getApartment());

basic.setStreet("12A");
System.out.println("RoadNo:"+basic.getdNo());

basic.setCity("Hyd");
System.out.println("City:"+basic.getCity());

basic.setState("Telangana");
System.out.println("State:"+basic.getState());

basic.setCountry("India");
System.out.println("Country:"+basic.getCountry());

basic.setdNo("530040");
System.out.println("Pincode:"+basic.getdNo());
}
}

