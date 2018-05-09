package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateUtil;

public class CheckUser {
	Session session = null;
	Transaction transaction = null;
	
	public boolean check(String uname) {
		session = HibernateUtil.getSessionFactory().openSession(); 
		try { 
			Object query = session.createQuery("from Users where name = :username")
					.setParameter("username", uname)
					.setHint("org.hibernate.cacheable", true)
					.setCacheRegion("common")
					.uniqueResult();
			if ( query != null ) {
				session.close();
				return true;
			}
		} catch (Exception e) {
			session.close();
			e.printStackTrace();
		}
		session.close();
		return false;
	}
}
