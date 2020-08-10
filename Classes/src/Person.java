
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=0 && age <=100) {
			this.age = age;
		}
		else {
			this.age = 0;
		}
	}
	public boolean isTeen() {
		boolean result;
		if (this.age>=12 && this.age<=20) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	public String getFullName() {
		String fullName = "";
		if(firstName.isEmpty() && lastName.isEmpty()) {
			return fullName;
		}
		else if(firstName.isEmpty()) {
			return lastName;
		}
		else if(lastName.isEmpty()) {
			return firstName;
		}
		else {
			fullName = firstName + " " +lastName;
			return fullName;
		}
	}
}
