import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class PrimaryMenu {
	/*The properties of primary Menu are:
	 * 1. It should ask the user for specifying the folder name
	 * 2. Once the user enters the folder name, all the files should be added to it(Secondary Menu class will be used)
	 * 3. Then it should list all the files in the folder, if no files it should throw no files in the DIR
	 * 4. There should be secondary Menu which has option to add, delete, search a file
	 * 5. Should gracefully exit from the application
	 */
	static File foldername;
	static String DIR;
	
	public static void createDir() {
	        DIR = System.getProperty("user.dir");
	        System.out.println("******************************************************");
	        System.out.println("The path where you will be creating files is : "+ DIR);
			System.out.println("Enter the folder name to create the files: ");
			System.out.println("******************************************************");
			Scanner reader = new Scanner(System.in);
			String dir = reader.nextLine();	
			foldername = new File(DIR+"\\"+dir);
		    if (foldername.exists()) {
		    	System.out.println("Directory exists");
		    }	
		    else {
		    	foldername.mkdirs();
	    		System.out.println("Directory doesn't exist,creating now");
	    		System.out.println("The directory has been created");
	    		System.out.println(foldername);
	    		System.out.println("******************************************************");
	    		}
		  
	     }
		  
	    
	   public static void listAllFiles() {
		    try {
		    	if(foldername.list().length==0) {
		    		System.out.println("The folder is empty");	
		    		MainMenu.SecondScreen();
		         }
		    	else {
		    		String[] list = foldername.list();
		    		System.out.println("The files in "+ foldername +" are :");
		    		Arrays.sort(list);
		    		for (String s:list) {
		               System.out.println(s);
		    		}     
		    	}
		    }
		    catch(NullPointerException ex) {
		    	System.out.println("Folder is empty\nPlease select option 2 to add files to empty folder");
		    	MainMenu.SecondScreen();
		    }
		    
	    	
	     }
	
	 


		
	
	
	    
	
	
	
}
