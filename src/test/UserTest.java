package test;

import org.hibernate.Session;

import com.UserDetails;
import com.Vehicle;

import comUtil.HibernateUtil;

public class UserTest {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		UserDetails user1 = new UserDetails();
		user1.setUserName("Amin");
		session.save(user1);
		
		
		UserDetails user2 = new UserDetails("Mansur");
		session.save(user2);
		
		Vehicle veh = new Vehicle();
		veh.setVehicleName("Toyota");
		session.save(veh);
		
		
		//mapping between user and veh objects
		user1.setVehicle(veh);
//		user2.setVehicle(veh);
		
		
		
		// Commit the transaction
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
	
}
