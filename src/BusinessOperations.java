import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class BusinessOperations {
	    String DIR;
	    File foldername;

	    public BusinessOperations() {
	        DIR = System.getProperty("user.dir");
	        System.out.println("Enter the folder name: ");
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        foldername = new File(DIR+"\\"+input);
	        if (!foldername.exists())
	            foldername.mkdirs();
	        System.out.println("The folder has been created and the path is : "+ foldername);
	        
	    }
	
	//To list all the files in the directory
	 void showFiles() {
	       if (foldername.list().length==0) {
	            System.out.println("The folder is empty");
	       		System.out.println("Please have a look at below options");
	       		secondMenu();
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
	//Secondary Menu
	void secondMenu() {
		    try {
		    	
		    }
		    catch(InputMismatchException ex) {
		    	System.out.println("Please select any number between 1 to 41");
		    }
			
	}
	 
	//To add the files in the directory
	public void addFile()
	{   
		
		//Input from the user
		System.out.println("Enter the file name that you want to add : ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		File F = new File(filename);
		try {
			if(F.createNewFile())
				System.out.println(filename+ " has been added");
			else 
				System.out.println(filename+ " already exists"); 
		}	
		catch (IOException ex) {
			System.out.println(ex);	
		}
		secondMenu();
	}	
	
	public void deleteFile() {
		//To delete the file entered by the user
		System.out.println("Please enter the file name that needs to be deleted from the list : ");
		Scanner scan = new Scanner(System.in);
		String filename = scan.nextLine();
		File F = new File(filename);
		if(F.delete()) {
			System.out.println(filename+ " file has been deleted from the folder ");
		}
		else{
			System.out.println("File not found. Please enter the correct file name to delete");
		}
		
	}
	
	public void searchFile() {
		try {	
			Scanner scan = new Scanner(System.in);
			String fileName=scan .nextLine();
			String[] list = foldername.list();
			System.out.println("Enter the file name that you want to search:");
            int flag=0;
            for (String f : list) {
                if (fileName.equals(f)) {
                       System.out.println("The filename " +f+ " as found in the directory" +foldername);
                       System.out.println(" The file details are below");
                       System.out.println("******************************************************");
        			   File f1= new File(fileName);
        			   Scanner scan1 = new Scanner(f1);
        			   while(scan1.hasNextLine()) {
        			   System.out.println(scan1.nextLine());
        			}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		}catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}
	}

	
	

}
