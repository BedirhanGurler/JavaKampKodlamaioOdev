public class Course {
	int id;
	String courseName;
	String description;
	String instructorName;
	int unitPrice;
	
	public Course(int id, String courseName, String description, String instructorName, int unitPrice) {
		this.id = id;
		this.courseName = courseName;
		this.description = description;
		this.instructorName = instructorName;
		this.unitPrice = unitPrice;
	}
}
