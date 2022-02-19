import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		WelcomeScreen();
		MenuScreen();
	}
	
	public static void WelcomeScreen() {
		System.out.println("Welcome to the Locked.Me Application");
		System.out.println("Developer : Sweta K");
		
	}
	
	public static void MenuScreen() {
		BusinessOperations ops = new BusinessOperations();
		int option;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Please select any of the options below: ");
		System.out.println("\t1. List files in ascending order \n");
		System.out.println("\t2. Add, Delete or Search files \n");
		System.out.println("\t3. Exit \n");
		option = scan.nextInt();
		int input = 0;
			
			switch(option) {
			case 1:
				ops.showFiles();
				break;
			case 2:
				
				System.out.println("Select any of the options from below");
		    	System.out.println("\t1. Add a file");
		    	System.out.println("\t2. Delete a file");
		    	System.out.println("\t3. Search a file");
		    	System.out.println("\t4. Return to Main Menu");		
		    	input = scan.nextInt();
				switch(input) {
					case 1 : 
						ops.addFile();
						break;
		
					case 2:
						ops.deleteFile();
						break;
				
					case 3:
						ops.searchFile();
						break;
					case 4:
						System.out.println("Returning to Main Menu");
						MenuScreen();
						break;
					default:
						System.out.println("Invalid input\n Please select input between 1 and 4 :");
					}
			case 3:
				System.out.println("Exit");
				break;
			
			
		}	
		while(input!=4);
			MenuScreen();
		}while(option!=3);
			
	}		
		
}

		
	



