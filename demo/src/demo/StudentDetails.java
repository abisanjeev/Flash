package demo;

public class StudentDetails {
	public static void main(String args[]){
		Student stu = new Student();
		Validator val = new Validator();
		stu.show();
		val.validate(stu);
		
			}

}


class Validator{
	public void validate(Student obj){
		obj.MarksValidation(20, 35, 90);
	}
}