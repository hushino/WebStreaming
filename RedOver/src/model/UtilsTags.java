package model;

 
import java.util.List;

 
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Tags;
import hibernateUtil.HibernateUtil;

public class UtilsTags {
	Session session = null;
	Transaction transaction = null;
	
	public List<Tags> getTags() {
		session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Tags> tags = session.createQuery("from Tags").list();
		
		/*ArrayList<Tags> arreglo = new ArrayList<>();
		for (Object object : session.createQuery("FROM Tag").list() 
				
			)
		{
			arreglo.add((Tags) object);
		}*/
		session.close();
		return tags;
	}
}
