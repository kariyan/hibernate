package ko.kosta.hibernate.da.impl;

import java.util.List;

import ko.kosta.hibernate.da.UserProvider;
import ko.kosta.hibernate.domain.User;
import ko.kosta.hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class UserProviderImpl implements UserProvider {

	public void insertUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	public List<User> findAllUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<User> users = session.createQuery("from User u order by u.name asc").list();
		session.getTransaction().commit();
		session.close();
		return users;
	}
}
