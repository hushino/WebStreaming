package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Episodio;
import hibernateUtil.HibernateUtil;

public class UtilsCaps {
	Session session = null;
	Transaction transaction = null;

	public List<Episodio> getEpisodio() {
		session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<Episodio> arreglo = new ArrayList<>();
		for (Object oneObject : session.createQuery("FROM Episodio b ORDER BY b.updateDate DESC")
				.setHint("org.hibernate.cacheable", true)
				.setCacheRegion("common")
				.setMaxResults(10)
				.getResultList())
		{
			arreglo.add((Episodio) oneObject);
		}
		session.close();
		return arreglo;
	}
	
	public Episodio ShowEpisodio(Long id) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		Episodio episodio = session.get(Episodio.class, id);
		transaction.commit();
		session.close();
		return episodio;
	}
	
	public void AddCapitulo(Episodio episodio) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.save(episodio);
		transaction.commit();
		session.close();
	}
}
