
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demirog",30);
		
		Course course2 = new Course("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demirog",40);
		
		
		Course [] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.courseName+" "+course.instructorName+" "+course.completionRate);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.openMyCourses();
		courseManager.allCourses();
		courseManager.openQuestions();
		courseManager.preperationToCamp();
		
		
		Category category1 = new Category("T�m�",0);
		Category category2 = new Category("Programlama",1);
		
		
	}

}
