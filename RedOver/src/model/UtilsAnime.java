package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Anime;
import hibernateUtil.HibernateUtil;

public class UtilsAnime {
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
	
	}

	public List<Anime> getAnime() {
		session = HibernateUtil.getSessionFactory().openSession(); 
		ArrayList<Anime> arreglo = new ArrayList<Anime>();
		for (Object oneObject : session.createQuery("FROM Anime a ORDER BY a.UpdateDate DESC")
				//.setHint("org.hibernate.cacheable", true)
				.setMaxResults(10)
				.getResultList()
			)
		{
			arreglo.add((Anime) oneObject);
		}
		session.close();
		return arreglo;
	
	}
	
	public void deleteUsuario(Long id) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		Anime anime = (Anime) session.get(Anime.class, id);
		session.delete(anime);
		transaction.commit();
		session.close();
	}
	
	//Find By Id
	public Anime ShowAnime(Long id) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		Anime anime = (Anime) session.get(Anime.class, id);
		transaction.commit();
		session.close();
		return anime;
	}
	
	 public void updateAnime(Anime anime) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.update(anime);
		transaction.commit();
		session.close();
	
	} 
	
}