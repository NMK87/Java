package inheritance;

public class InheritanceTeacherMain extends InheritanceTeacher {
	 
	int teacherId=1;
	
	public static void main(String args[]) {
		InheritanceTeacherMain obj = new InheritanceTeacherMain();
		
		System.out.println(obj.CollegeName);
		System.out.println(obj.TeacherName);
		System.out.println(obj.teacherId);
		obj.trophy();

		
	}

}