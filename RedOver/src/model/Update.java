package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Anime;
import hibernateUtil.HibernateUtil;

public class Update {
	Session session = null;
	Transaction transaction = null;

	public void updateAnime(int id) {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			Anime animu = (Anime) session.get(Anime.class, id);
			animu.setNombre("Uchiha");
			session.update(animu);
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
