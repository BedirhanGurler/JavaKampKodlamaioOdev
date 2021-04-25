
public class Main {

	public static void main(String[] args) {
		
		// Kurslarýn Gözükeceði Kýsým
		Course course1 = new Course(1, "C# Eðitimi", "2 Ay Sürecek Olan Muazzam Bir Kurs.", "Engin Demiroð", 10);
		Course course2 = new Course(2, "Python Eðitimi", "Dünyanýn En Ýyi Eðitimi Olacak.", "Bedirhan Gürler", 15);
		Course course3 = new Course(3, "Java Eðitimi", "React Ýle Ýyi Gider.", "Engin Demiroð", 20);
		Course course4 = new Course(4, "C++ Eðitimi", "Syntax'ýný Bilirsen Hepsi Ayný.", "Engin Demiroð", 0);
		
		Course[] courses = {course1,course2,course3,course4};
		for (Course course : courses) {
			System.out.println("Kurs Adý: " + course.courseName + "\n" + 
							   "Kurs Açýklamasý: " + course.description + "\n" + 
							   "Kursun Eðitmeni: " + course.instructorName + "\n" +
							   "Kursun Ücreti: " + course.unitPrice + " TL" + "\n"
							);	
					
		}
		
		System.out.println("********************************************************************************");
		
		// Eðitmenlerin Gözükeceði Kýsým
		Instructor instructor1 = new Instructor(1, "Bedirhan Gürler");
		Instructor instructor2 = new Instructor(2, "Engin Demioð");
		
		Instructor[] instructors = {instructor1,instructor2};
		System.out.println("Eðitmenler:" + "\n" + "----------------------");
		for (Instructor instructor : instructors) {
			
			System.out.println(instructor.fullName + "\n");
			
		}
		
		// Eðitmen Ekleme Ve Silme Metotlarý
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.instructorAdd(instructor1);
		instructorManager.instructorDelete(instructor2);

	}

}
