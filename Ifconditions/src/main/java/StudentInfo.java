import java.util.Date;
public class StudentInfo extends RegBasicInfo{
private String userId;
private String courseName;
private String courseDuration;
private String DateOfJoin;
private String courseSubBranch;

public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(String courseDuration) {
	this.courseDuration = courseDuration;
}
public String getDateOfJoin() {
	return DateOfJoin;
}
public void setDateOfJoin(String dateOfJoin) {
	DateOfJoin = dateOfJoin;
}
public String getCourseSubBranch() {
	return courseSubBranch;
}
public void setCourseSubBranch(String courseSubBranch) {
	this.courseSubBranch = courseSubBranch;
}





}
