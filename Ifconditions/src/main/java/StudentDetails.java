import java.util.Date;
public class StudentDetails {
	StudentInfo1 getStuData() {
	StudentInfo1 st = new StudentInfo1();
	st.setUserId("12345A");
	st.setCourseName("Java Full Stack");
	st.setCourseDuration("5Months");
	st.setDateOfJoin("2023/08/08");
	st.setCourseSubBranch("It");
	st.setAddressinfo1(getAddrData());
	st.setRegBasicInfo1(getBasicData());
	return st;
	
	
	}
	private AddressInfo1 getAddrData() {
		AddressInfo1 ad = new AddressInfo1();
		ad.setdNo("16-705A");
		ad.setApartment("LivSpace");
		ad.setStreet("RoadNo:12");
		ad.setCity("Hyd");
		ad.setState("Telangana");
		ad.setCountry("India");
		ad.setPincode(6575758);
		return ad;
	}
	private RegBasicInfo1 getBasicData() {
		RegBasicInfo1 ba = new RegBasicInfo1();
		ba.setFirstName("MohanRao");
		ba.setLastName("Duba");
		ba.setEmail("abc45@gmail.com");
		ba.setGender("Male");
		ba.setMoblie(8374899858l);
		return ba;
	}
}