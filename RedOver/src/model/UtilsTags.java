package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Tags;
import hibernateUtil.HibernateUtil;

public class UtilsTags {
	Session session = null;
	Transaction transaction = null;

	public List<Tags> findTagWithAnime() {
		session = HibernateUtil.getSessionFactory().openSession();
		ArrayList<Tags> arreglo = new ArrayList<>();
		for (Object object : session.createQuery("from Tags")
				//.setHint("org.hibernate.cacheable", true)
				.getResultList()

		) {
			arreglo.add((Tags) object);
		}
		session.close();
		return arreglo;
	}

	public Tags findbyId(Long id) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.getTransaction();
		transaction.begin();
		Tags tags = session.get(Tags.class, id);
		transaction.commit();
		session.close();
		return tags;
	}

}
