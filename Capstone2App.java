import java.util.LinkedList;
import java.util.Scanner;

public class Capstone2App {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Task Manager");
		System.out.println(
				"Please choose: \n1. List Task \n2. Add Task \n3. Delete Task \n4. Mark task complete \n5. Quit");
		System.out.println("What would you like to do?");
		int choice = scan.nextInt();
		LinkedList<String> membersName = new LinkedList<>();
		LinkedList<String> description = new LinkedList<>();
		LinkedList<String> dueDate = new LinkedList<>();
		boolean done;
		
		if (choice == 1) {
			System.out.println("List Task");
		} else
		if (choice == 2) {
			System.out.println("Add Task");
		} else if (choice == 3) {
			System.out.println("Delete Task");
		} else if (choice == 4) {
			System.out.println("Mark Task Complete");
		} else if (choice == 5) {
			System.out.println("Quit");
		}
	
	}	
	
}

