package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Anime;
import hibernateUtil.HibernateUtil;

public class ModelUpdate {
	Session session = null;
	Transaction transaction = null;

	public void updateAnime(Anime anime) {
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			//String queryUpdate = "from Employee where sal = :id";
			Anime animu = (Anime) session.get(Anime.class, anime);
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
