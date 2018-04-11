package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Anime;
import hibernateUtil.HibernateUtil;

public class ModelDelete {
	Session session = null;
	Transaction transaction = null;

	public void deleteUsuario(Long id) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		Anime anime = (Anime) session.get(Anime.class, id);
		session.delete(anime);
		transaction.commit();
		session.close();
	}

}
