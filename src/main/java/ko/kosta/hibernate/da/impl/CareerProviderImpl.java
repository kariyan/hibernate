package ko.kosta.hibernate.da.impl;

import java.util.List;

import ko.kosta.hibernate.da.CareerProvider;
import ko.kosta.hibernate.domain.Career;
import ko.kosta.hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class CareerProviderImpl implements CareerProvider {

	public void insertCareer(Career career) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(career);
		session.getTransaction().commit();
		session.close();
	}

	public List<Career> findAllCareer() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Career> careers = session.createQuery("from Career c order by c.name asc").list();
		session.getTransaction().commit();
		session.close();
		return careers;
	}
}
