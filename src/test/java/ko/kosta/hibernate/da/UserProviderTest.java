package ko.kosta.hibernate.da;

import static org.junit.Assert.*;

import java.util.List;

import ko.kosta.hibernate.da.impl.UserProviderImpl;
import ko.kosta.hibernate.domain.Address;
import ko.kosta.hibernate.domain.User;

import org.junit.Before;
import org.junit.Test;

public class UserProviderTest {
	private UserProvider provider;

	@Before
	public void setUp() throws Exception {
		provider = new UserProviderImpl();
	}

	@Test
	public void testInsertUser() {
		Address address = new Address();
		address.setCity("city");
		address.setState("state");
		address.setZipCode("111-222");
		
		User user = new User("demonpark", "tester", address);
		user.setUserId("demonpark");
		user.setName("tester");
		
		provider.insertUser(user);
		List<User> users = provider.findAllUsers();
		assertNotNull(users);
		assertEquals("demonpark", users.get(0).getUserId());

		user = new User("sjpark", "developer", address);
		provider.insertUser(user);
		users = provider.findAllUsers();
		assertEquals(2, users.size());
	}
}
