import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		ArrayList<Person> personList = new ArrayList();
		
		Person person = new Person();
		
		int n = 0;
		
		try {
			personList = addPerson(n, personList,person);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("1 - Add Array ");
		System.out.println("2- Display Array from index number");
		try {
			 n = reader.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e.toString());
			System.exit(0);
		}
		
		if(n == 1) {
			try {
				personList = addPerson(n, personList,person);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}else if (n == 2) {
			System.out.println("Enter index number: ");
			try {
				 n = reader.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(e.toString());
				System.exit(0);
			}
			DisplayPerson(personList, n);
		}else {
			System.out.println("Please enter valid number!");
			System.exit(0);
		}

	}
	
	public static void DisplayPerson(ArrayList<Person> personList, int n) {
		
		try {
			System.out.println(personList.get(n).toString());
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.exit(0);
		}
		
	}
	
	public static ArrayList<Person> addPerson(int n, ArrayList<Person> personList, Person person) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many you want to add?");
		try {
			 n = reader.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e.toString());
			System.exit(0);
		}
		for(int i = 0; i<n ; i++) {
			try {
				System.out.println("First Name:");
				String _firstName = reader.next();
				person.setFirstName(_firstName);
				System.out.println("Last Name:");
				String _lastName = reader.next();
				person.setLastName(_lastName);
				System.out.println("Age :");
				int _age = reader.nextInt();
				person.setAge(_age);
				System.out.println("Salary :");
				int _salary = reader.nextInt();
				person.setSalary(_salary);
				
				personList.add(person);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
		return personList;
	}
	

}
