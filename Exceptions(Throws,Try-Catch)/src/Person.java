import java.util.InputMismatchException;

public class Person {
	public String FirstName;
	public String LastName;
	public int Age;
	public int salary;
	
//	public Person(String firstName, String lastName, int age, int salary) {
//		super();
//		FirstName = firstName;
//		LastName = lastName;
//		Age = age;
//		this.salary = salary;
//	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) throws ChechStringException {
		if(!firstName.matches("[a-zA-Z]+") ) {
			throw new NonNegatifException("Please only Letter");
		}else {
			FirstName = firstName;
		}
		
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) throws ChechStringException {
		if(!lastName.matches("[a-zA-Z]+") ) {
			throw new NonNegatifException("Please only Letter");
		}else {
			LastName = lastName;
		}
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) throws NonNegatifException {
		if(age >= 0 ) {
			Age = age;
		}else {
			throw new NonNegatifException("Can not be negatif");
		}
	
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) throws NonNegatifException {
		if(salary >= 0) {
			this.salary = salary;
		}else {
			throw new NonNegatifException(" Can not be negatif");
		}
	}
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", salary=" + salary
				+ "]";
	}
	
}
