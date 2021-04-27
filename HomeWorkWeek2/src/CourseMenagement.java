
public class CourseMenagement {
	
	
	
	public void addStudent(Student student) {
	System.out.println(student.studentName+":  added to course ");
	}
	
	public void addCourse(Course course) {
		
		
		System.out.println(course.courseName+" course added");
	}

	public  void courseİnfo(Course course)
	{
		System.out.println("course name;"+course.courseName+ 
				" course id:"+course.courseId+
				" educator name :"+ course.educatorName+
				"  number of course participants:"+course.maxParticipantsNumber);
	}

	public void studentİnfo(Student student) {
		System.out.println("studen name:"+student.studentName+
				" student id:"+student.studentİd);
		
		
		
	}
	
	public void deleteStudent(Student student) {
		
		System.out.println(student.studentName+" deleted");
	}
	
	
	
	
	

}
