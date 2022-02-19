import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SecondaryMenu {
	/*The operation to be done in secondary menu are:
	 * 1. Add files to the user-specified folder
	 * 2. Deleted files from the user specified folder
	 * 3. Search for specific file
	 * 4. Return to the primary menu 
	 */
	File foldername = PrimaryMenu.foldername;
	
	void addFiles() {
		try {
			System.out.println("******************************************************");
			System.out.println("Enter the file name that you want to add ");
			Scanner scan = new Scanner(System.in);
			String filename = scan.nextLine();
			File filepath = new File(foldername +"\\"+filename);
			String[] list = foldername.list();
			for (String file: list) {
				if (filename.equalsIgnoreCase(file)) {
					System.out.println("File " + filename + " already exists at " + foldername);
					return;
				}
			}
			filepath.createNewFile();
			System.out.println("File "+filename+" added to "+ foldername);
		}
		catch (IOException e) {
			System.out.println("******************************************************");
			System.out.println("Please enter valid option from 1 to 4");
		}
    }
	
	//To delete the file entered by the user
	public void deleteFile() {
		System.out.println("******************************************************");
		System.out.println("Please enter the file name that needs to be deleted from the list : ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		File filepath = new File(foldername +"/"+filename);
		String[] list = foldername.list();
	        for (String file: list) {
	            if (filename.equalsIgnoreCase(file) && filepath.delete()) {
	                System.out.println("File " + filename + " deleted from " + foldername);
	                return;
	            }
	        }
	        System.out.println("FILE NOT FOUND");
	}		
		
	

	void searchFile()  {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("******************************************************");
		System.out.println("Enter the file name which you wish to search:");
		String fileName=scan.nextLine();
		File[] files=foldername.listFiles();
		int flag = 0;
		for (File file : files) {
			String name = file.getName();
			if (name.equalsIgnoreCase(fileName)) {
				System.out.println("The filename "+fileName+" is found in the directory");
				flag = 1;
			}	
		}
		if(flag == 0) {
			System.out.println("File Not Found");
		}
		
	}
		    
}
		
	

	

	
	
