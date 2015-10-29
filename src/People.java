import java.util.Scanner;


public class People {
	private static Scanner keyboard = new Scanner(System.in);
	public People() {
		
	}
	public static void main(String[] args) {
		String personsName = keyboard.next();
		int personsAge = keyboard.nextInt();
		Person asdf = new Person(personsName, personsAge);
		Person markPerson = new Person("Mark", 15);
		System.out.println(asdf.getName());
		System.out.println(asdf.getAge());
		if (markPerson.getName().equals (asdf.getName()) && markPerson.getAge() == (asdf.getAge())) {
			System.out.print("Equal, they are twins");
		} else {
			System.out.println("They are false prophets");
		}
	}
}
