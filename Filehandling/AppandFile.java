package file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AppandFile {

	    public static List<String>readFile(String fileName)
	    {
	    	List<String>list=Collections.emptyList();
	    	try{
	    		list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
	    	}
	    	catch(Exception e){
	    		e.printStackTrace();
	    		
	    	}
	    	return list;
	    }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int choice;
	    	
	    	System.out.println("enter 1 to read");
	    	System.out.println("enter 2 to write");
	    	System.out.println("enter 3 to Appand");
	    	
	    	System.out.println(" enter your choice");
	    	choice=sc.nextInt();
	    	
	    	if(choice==1){
	    		
	    		System.out.println("enter file name");
	    		String fname=sc.next();
	    		List<String>result=readFile("D:\\TestFile\\"+fname);
	    		Iterator<String>it=result.iterator();
	    		while(it.hasNext()){
	    			System.out.println(it.next());
	    		}
	    		
	    	}
	    	else if(choice==2){
	    		try{
	    			FileWriter fw=new FileWriter("D:\\TestFile\\NewFile.txt");
	    			fw.write("File weiter has written this file");
	    			fw.close();
	    			System.out.println("down with tha writting");
	    		}
	    		catch(Exception e){
	    			System.out.println("exception");
	    			
	    		}
	    		
	    	}
	    	else if(choice==3){
	    			String filename=("D:\\TestFile\\NewFile.txt");
	    			try{
	    				BufferedWriter bw= new BufferedWriter(new FileWriter(filename));
	    				bw.write("this file has been Appended");
	    				bw.close();
	    			   System.out.println("Appended");
	    			}catch(Exception e){
	    				e.printStackTrace();
	    			}
	    		}
	    }
	}
	    		
	