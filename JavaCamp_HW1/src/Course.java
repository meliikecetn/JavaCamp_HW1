
public class Course {
			
		
		public Course(String courseName,String instructorName,int completionRate) {
			this();
			this.courseName=courseName;
			this.instructorName=instructorName;
			this.completionRate=completionRate;
			
		}
		
		public Course() {
			
			System.out.println("Course Constructor'�n icerisindeyiz..");
		}
		
		String courseName;
		String instructorName;
		int completionRate;
		
	}


