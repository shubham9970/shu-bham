package beans;

import javax.persistence.Entity;

public class Student 
{
   private int Student_id;
   private String Student_name;
   private String Student_email;
public int getStudent_id() {
	return Student_id;
}
public void setStudent_id(int student_id) {
	this.Student_id = student_id;
}
public String getStudent_name() {
	return Student_name;
}
public void setStudent_name(String student_name) {
	this.Student_name = student_name;
}
public String getStudent_email() {
	return Student_email;
}
public void setStudent_email(String student_email) {
	this.Student_email = student_email;
}
  
}
