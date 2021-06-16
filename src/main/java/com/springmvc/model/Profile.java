package com.springmvc.model;

public class Profile {
	private String name;
	private long mobNum;
	private String email;
	private int age;
	private String dob;
	private String schoolName;
	private String collegeName;
	private String currentCompanyName;
	private String exCompanyNames;
	
	public Profile() {
	}

	public Profile(String name, long mobNum, String email, int age, String dob, String schoolName, String collegeName,
			String currentCompanyName, String exCompanyNames) {
		super();
		this.name = name;
		this.mobNum = mobNum;
		this.email = email;
		this.age = age;
		this.dob = dob;
		this.schoolName = schoolName;
		this.collegeName = collegeName;
		this.currentCompanyName = currentCompanyName;
		this.exCompanyNames = exCompanyNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobNum() {
		return mobNum;
	}

	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCurrentCompanyName() {
		return currentCompanyName;
	}

	public void setCurrentCompanyName(String currentCompanyName) {
		this.currentCompanyName = currentCompanyName;
	}

	public String getExCompanyNames() {
		return exCompanyNames;
	}

	public void setExCompanyNames(String exCompanyNames) {
		this.exCompanyNames = exCompanyNames;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", mobNum=" + mobNum + ", email=" + email + ", age=" + age + ", dob=" + dob
				+ ", schoolName=" + schoolName + ", collegeName=" + collegeName + ", currentCompanyName="
				+ currentCompanyName + ", ExCompanyNames=" + exCompanyNames + "]";
	}

	
	
}
