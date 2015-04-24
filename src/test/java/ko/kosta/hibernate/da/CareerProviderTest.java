package ko.kosta.hibernate.da;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import ko.kosta.hibernate.da.impl.CareerProviderImpl;
import ko.kosta.hibernate.domain.Career;
import ko.kosta.hibernate.domain.CompanyCarrer;

import org.junit.Before;
import org.junit.Test;

public class CareerProviderTest {
	private CareerProvider provider;

	@Before
	public void setUp() throws Exception {
		provider = new CareerProviderImpl();
	}

	@Test
	public void testInsertUser() {
		
		CompanyCarrer companyCarrer = new CompanyCarrer();
		companyCarrer.setBeginDate(new Date());
		companyCarrer.setEndDate(new Date());
		companyCarrer.setBusiness("kosta");
		companyCarrer.setName("company name");
		
		provider.insertCareer(companyCarrer);
		List<Career> careers = provider.findAllCareer();
		
		assertEquals("company name", careers.get(0).getName());
	}
}
