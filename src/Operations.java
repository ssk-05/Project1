import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Operations {
	String DIR;
	File foldername;
	
	public Operations() {
	DIR = System.getProperty("user.dir");
	foldername = new File(DIR+"/files");
	}
	
	public void FirstMenu() {
		    if (foldername.exists()) {
		    	System.out.println("The folder already exists");	
		    }	
		    else {
		    	foldername.mkdirs();
	    		System.out.println("Directory not exists, creating now");
	    		System.out.println("The directory has been created");
	    		System.out.println(foldername);
	    		}
		  
		 }
		  
	    
	  public void listAllFiles() {
		    	if(foldername.list().length==0) {
		    		System.out.println("The folder is empty");	
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
	    	
	   public void addFiles() {
		   try {	
		        System.out.println("Enter the file name that you want to add in : ");
	    		Scanner scan = new Scanner(System.in);
	    		String filename = scan.nextLine();
	    		File filepath = new File(foldername +"/"+filename);
	    		String[] list = foldername.list();
	            for (String file: list) {
	                if (filename.equalsIgnoreCase(file)) {
	                    System.out.println("File " + filename + " already exists at " + foldername);
	                    return;
	                }
	            }
	           
					filepath.createNewFile();
					System.out.println("File "+filename+" added to "+ foldername);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
	     }
	    	
	    	//To delete the file entered by the user
	   public void deleteFile() {
		      
	    		System.out.println("Please enter the file name that needs to be deleted from the list : ");
	    		Scanner scan = new Scanner(System.in);
	    		String filename = scan.nextLine();
	    		File filepath = new File(foldername +"/"+filename);
	    		String[] list = foldername.list();
	    	        for (String file: list) {
	    	            if (filename.equals(file) && filepath.delete()) {
	    	                System.out.println("File " + filename + " deleted from " + foldername);
	    	                return;
	    	            }
	    	        }
	    	        System.out.println("Delete Operation failed. FILE NOT FOUND");
	    }		
	    	
		public void searchFile(String filename) {
			String[] list = foldername.list();
	        for (String file: list) {
	            if (filename.equalsIgnoreCase(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + foldername);
	                return;
	            }
	        }
	        System.out.println("File NOT found (FNF)");
	    }
			
		}

	    	
	
	    	
	    	



		
	
	
	    
	
	
	

