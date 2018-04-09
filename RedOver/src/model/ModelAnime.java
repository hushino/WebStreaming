package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Anime;
import hibernateUtil.HibernateUtil;

public class ModelAnime {
	Session session = null;
	Transaction transaction = null;

	public List<Anime> getAnime() {
		session = HibernateUtil.getSessionFactory().openSession(); 
		ArrayList<Anime> arreglo = new ArrayList<Anime>();
		for (Object oneObject : session.createQuery("FROM Anime")
				.getResultList()
			)
		{
			arreglo.add((Anime) oneObject);
		}
		session.close();
		return arreglo;

	}
}
