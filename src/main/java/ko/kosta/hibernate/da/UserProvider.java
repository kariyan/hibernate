package ko.kosta.hibernate.da;

import java.util.List;

import ko.kosta.hibernate.domain.User;

public interface UserProvider {
	public void insertUser(User user);

	public List<User> findAllUsers();
}
