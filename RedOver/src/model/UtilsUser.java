package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Users;
import hibernateUtil.HibernateUtil;

public class UtilsUser {
	Session session = null;
	Transaction transaction = null;
	
	public void addUser(Users user) {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
