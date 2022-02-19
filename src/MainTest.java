import java.io.File;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		PrimaryDetails();
		Operations menu = new Operations();
        PrimaryScreen();
		
	}
	 

	//To display the opening screen
	public static void PrimaryDetails() {
		System.out.println("**********Welcome to Locked.Me Application***********\n************Developer : Sweta SK***********");
	}
	
	//To display the  primary contents of primary Screen
	static void PrimaryScreen() {
		Operations menu = new Operations();
		int option;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please select any of the options below: ");
			System.out.println("\t1. List all the files in the folder in ascending order");
			System.out.println("\t2. Add, Delete or Search files");
			System.out.println("\t3. Exit");
			option = scan.nextInt();
			
			switch(option) {
			case 1:
				menu.listAllFiles();
				break;
			case 2:	
				SecondScreen();
				break;
			case 3:
				System.out.println("Thank you for using the Locked.Me application\nExiting....");
				System.exit(0);
			default:
				System.out.println("Please enter correct option from 1 to 3:");
				PrimaryScreen();
			}
		}catch(Exception ex) {
			System.out.println(ex);
			
		}PrimaryScreen();
		
	}


	//To display the second screen and it's contents 
	 static void SecondScreen() {
		
		System.out.println("Select any of the options from below");
    	System.out.println("\t1. Add a file");
    	System.out.println("\t2. Delete a file");
    	System.out.println("\t3. Search a file");
    	System.out.println("\t4. Return to Main Menu");	
		try {
			Operations menu = new Operations();
			Scanner scan = new Scanner(System.in);
			int opt = scan.nextInt();
			
			switch(opt) {
			case 1:
				menu.addFiles();
				break;
			case 2:
				menu.deleteFile();
				break;
			case 3:
				 System.out.print("Please Enter a File Name to search : ");
                 String filename = scan.next().trim();
                 menu.searchFile(filename);
				 break;
			case 4:
				System.out.println("Returning to Main Menu");
				PrimaryScreen();
				break;
			default:
				System.out.println("Please enter correct value from 1 to 4:");	
				
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		SecondScreen();
	}


}
