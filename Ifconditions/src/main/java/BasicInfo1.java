
public class BasicInfo1 {
public static void main(String[]args) {
	StudentDetails studentDetails = new StudentDetails(); 
	System.out.println("StudentID:"+studentDetails.getStuData().getUserId());
	System.out.println("Course:"+studentDetails.getStuData().getCourseName());
	System.out.println("Duration:"+studentDetails.getStuData().getCourseDuration());
	System.out.println("Branch:"+studentDetails.getStuData().getCourseSubBranch());
	System.out.println("Date of join:"+studentDetails.getStuData().getDateOfJoin());
	System.out.println("DoorNo:"+studentDetails.getStuData().getAddressinfo1().getdNo());
	System.out.println("Apartment name:"+studentDetails.getStuData().getAddressinfo1().getApartment());
	System.out.println("City:"+studentDetails.getStuData().getAddressinfo1().getCity());
	System.out.println("street:"+studentDetails.getStuData().getAddressinfo1().getStreet());
	System.out.println("State:"+studentDetails.getStuData().getAddressinfo1().getState());
	System.out.println("Country:"+studentDetails.getStuData().getAddressinfo1().getCountry());
	System.out.println("PinCode:"+studentDetails.getStuData().getAddressinfo1().getPincode());
}

}
