package beanstest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class StudentEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configobj=new Configuration();
		configobj.configure("beanresources/hibernate.cfg.xml");
		SessionFactory sfactobj= configobj.buildSessionFactory();
		
		Session sesobj=sfactobj.openSession();
		Transaction traobj=sesobj.beginTransaction();
		//create student object........
		Student stuobj =new Student();
		stuobj.setStudent_id(102);
		stuobj.setStudent_name("aa");
		stuobj.setStudent_email("abc@gmail.com");
	//	int pk=(int)
		sesobj.save(stuobj);
		traobj.commit();
		sesobj.close();
		//sfactobj.close();
		System.out.println("data inserted successfull ");
		
	}

}
