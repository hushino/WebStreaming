package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Anime;
import hibernateUtil.HibernateUtil;

public class ModelAdd {
	Session session = null;
	Transaction transaction = null;

	public void addAnime(Anime anime) {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			session.save(anime);
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

		//HibernateUtil.shutdown();
	}
 
}
