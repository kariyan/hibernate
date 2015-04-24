package ko.kosta.hibernate.domain;

public class SchoolCareer extends Career {
	private String major;
	private boolean graduate;

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public boolean isGraduate() {
		return graduate;
	}
	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}
}
