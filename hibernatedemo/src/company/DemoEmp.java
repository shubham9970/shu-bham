package company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoEmp {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 private Session session = null;
//		  
//		 Configuration cfg = new Configuration()
//		 .configure("hibernate.cfg.xml");
//		 SessionFactory sf = cfg.buildSessionFactory();
		  
		SessionFactory sfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session =  sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Emp e1 = new Emp();
		e1.setCustomerId(1);
		e1.setCustomerName("shub1");

		Emp e2 = new Emp();
		e2.setCustomerId(2);
		e2.setCustomerName("shub2");
		
		session.save(e1);
		session.merge(e2);
		tx.commit();
		session.close();
		sfactory.close();
	}

}
