package ko.kosta.hibernate.da;

import java.util.List;

import ko.kosta.hibernate.domain.Career;
import ko.kosta.hibernate.domain.User;

public interface CareerProvider {
	public void insertCareer(Career career);

	public List<Career> findAllCareer();
}
