package dao;

import org.hibernate.Session;

import hibernateUtil.HibernateUtil;

public class CheckUser {
	Session session = null;
	
	public boolean check(String uname, String role) {
		session = HibernateUtil.getSessionFactory().openSession(); 
		try { 
			Object query = session.createQuery("from Users where name = :username and role = :role")
					.setParameter("username", uname)
					.setParameter("role", role)
					.setHint("org.hibernate.cacheable", true)
					.setCacheRegion("common")
					.uniqueResult();
			if ( query != null) {
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
 