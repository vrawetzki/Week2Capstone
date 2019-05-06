import java.util.LinkedList;
import java.util.Scanner;

public class Capstone2 { 
	
	private String membersName;
	private String description;
	private int dueDate;
	public boolean changed;
	
	
		
	public static intro{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Task Manager");
		}
	
	public static menuOptions{
		System.out.println(
				"Please choose: \n1. List Task \n2. Add Task \n3. Delete Task \n4. Mark task complete \n5. Quit");
	}
	
	public static void membersName(Scanner sc) {
		Scanner choice = new Scanner(System.in);
		LinkedList<String> membersName = new LinkedList<>();
		System.out.println();
		}
	
	public static void description() {
		Scanner choice = new Scanner(System.in);
		LinkedList<String> description = new LinkedList<>();
		System.out.println();
		}
	
	public static void dueDate() {
		Scanner choice = new Scanner(System.in);
		LinkedList<Integer> dueDate = new LinkedList<>();
		System.out.println();
		}
	
}
