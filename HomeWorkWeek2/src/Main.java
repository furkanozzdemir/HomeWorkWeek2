
public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("furkan �zdemir", 13);
		Student student2 = new Student("�mer �engel", 15);

		Student[] students = { student1, student2 };

		for (Student s1 : students) {

			System.out.println("student name:" + s1.studentName + " \nstudent id:" + s1.student�d);
		}

		System.out.println("****************************************************************************************");

		Course course1 = new Course("java kamp�", 1, "engin demiro�", 1000);
		Course course2 = new Course("flutter kamp", 3, "emre altunbilek", 3000);

		Course[] courses = { course1, course2 };

		for (Course c1 : courses) {
		
			System.out.println(" course name:" + c1.courseName + "\ncourse id:" + c1.courseId + "\neducator name : "
					+ c1.educatorName + "\nmaximum participants number:" + c1.maxParticipantsNumber);
			System.out.println("********************************************************************************");
		}
		
		
		System.out.println("********************************************************************************");
		
		CourseMenagement menagement=new CourseMenagement();
		menagement.addStudent(student1);
		menagement.student�nfo(student1);
		System.out.println("------------------------------------------------");
		
		menagement.addCourse(course1);
		menagement.course�nfo(course1);

	}

}
