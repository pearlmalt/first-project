package ep;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ProjectSectionOne {

    public static void main(String[] args) {
        String userInput;
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		
		while(true){
			System.out.println("Application Name is LockedMe.com developed by Pearl Malt");
			System.out.println("*. Press 1 for Current file names in application");
			System.out.println("*. Press 2 for Performing actions on the application");
			System.out.println("*. Press 3 to Close the application");

			System.out.println("Enter your choice:");
			
			userInput = sn.next();
			
			switch(userInput){
			case "1":
                                String[] pathnames;
                                File allfile = new File("D:\\application");
                                pathnames = allfile.list();
				System.out.println("All Files : ");
                                for (String pathname : pathnames) {
                                    System.out.println(pathname);
                                }
				break;
			case "2":
                            boolean flag = true;
                            while(flag){
			    String userInputAction;
			    System.out.println("*. Press 1 for Adding file");
                            System.out.println("*. Press 2 for Delete a user specified file");
                            System.out.println("*. Press 3 to Search a file");
                            System.out.println("*. Press 4 to Navigate back to main");
    
			    System.out.println("Enter your choice:");
			    userInputAction = sn.next();
			    switch(userInputAction){
			        case "1":
                                    String userInputAddFile;
                                    System.out.println("Enter file name : ");
                                    userInputAddFile = sn.next();
                                    try {                                   
                                        File file = new File("D:\\application");
                                        boolean bool = file.mkdir();
                                        if(bool){
                                            System.out.println("Directory created successfully");
                                         }else{
                                            System.out.println("Specified directory already exists");
                                         }
                                        File myObj = new File("D:\\application\\"+userInputAddFile+".txt");
                                        if (myObj.createNewFile()) {
                                          System.out.println("File created: " + myObj.getName());
                                        } else {
                                          System.out.println("File already exists.");
                                    }
                                    } catch (IOException e) {
                                        System.out.println("An error occurred.");
                                        e.printStackTrace();
                                    }
			            System.out.println("done with creating new file");
			            break;
			        case "2":
                                    String userInputDelFile;
                                    System.out.println("Enter file name to be deleted : ");
                                    userInputDelFile = sn.next();
                                    try{
                                        File fdel = new File("D:\\application\\"+userInputDelFile+".txt");
                                        if(fdel.delete())   
                                        {  
                                            System.out.println(fdel.getName() + " deleted"); 
                                        }  
                                        else  
                                        {  
                                            System.out.println("deletion failed");  
                                        }  
                                    }catch(Exception e){
                                        System.out.println("An error occurred.");
                                        e.printStackTrace();
                                    }
			            break;
			        case "3": 
                                    String userInputSearchFile;
                                    System.out.println("Enter file name to be searched : ");
                                    userInputSearchFile = sn.next();
                                    File directory = new File("D:\\application"); 
                                    String[] flist = directory.list(); 
                                    int searchflag = 0; 
                                    if (flist == null) { 
                                        System.out.println("Empty directory."); 
                                    } 
                                    else { 
                                        for (int i = 0; i < flist.length; i++) { 
                                            String filename = flist[i]; 
                                            if (filename.equalsIgnoreCase(userInputSearchFile+".txt")) { 
                                                System.out.println(filename + " found"); 
                                                searchflag = 1; 
                                            } 
                                        } 
                                    } 
                                    if (searchflag == 0) { 
                                        System.out.println("File Not Found"); 
                                    } 
			            System.out.println("done with searching a file");
			            break;
			        case "4":
			            System.out.println("Navigating back to main menu");
                                    flag = false;
			            break;
                                default:
                                    System.out.println("Invalid choice. Read the options carefully...");
			    }
                            }
                            break;
					
			case "3":
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Read the options carefully...");
			}
		}
    }
    
}


