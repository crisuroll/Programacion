package main;

//Creating a text File using FileWriter 
import java.io.FileWriter; 
import java.io.IOException; 
class Main { 
	 public static void main(String[] args) throws IOException { 
	     // accept a string  
	     String str = "\n uwuwuwuwuuwuwu"; 
	
	     // attach a file to FileWriter  
	     FileWriter fw = new FileWriter("./src/data/output.txt", true); 
	
	     // read character wise from string and write into FileWriter  
	     for (int i = 0; i < str.length(); i++) 
	         fw.write(str.charAt(i)); 
	
	     System.out.println("Writing successful"); 
	     //close the file  
	     fw.close(); 
	 } 
}