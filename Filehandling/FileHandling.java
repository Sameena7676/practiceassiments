package file;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandling {

	public static List<String> readFile(String NewFile) {

		List<String> list = Collections.emptyList();
		try {

			list = Files.readAllLines(Paths.get(NewFile), StandardCharsets.UTF_8);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice;

		System.out.println("File Handling");
		System.out.println("1.Read");
		System.out.println("2.Write");
		System.out.println("3.Append");

		System.out.println("Enter your choice: ");
		choice = sc.nextLine();
		

		if (choice.equals("1")){
		
			System.out.println("Enter file name");
			String fname=sc.next();
			List result=readFile("D:\\mphasis\\NewFile\\"+fname);
			Iterator<String> it = result.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			
			}}
	
		 else if (choice.equals("2")) {
			try {
				FileWriter fw = new FileWriter("C:\\Users\\ACER\\workspace\\mphasis java pgm\\fileheandling\\sameena.txt");
				fw.write("SAMEENA BANU");
				fw.close();
				System.out.println("File write done");
			} catch (Exception e) {
				System.out.println("There are some Exc eption");
			}
		} else if (choice.equals("3")) {
			
			String filename = ("C:\\Users\\ACER\\workspace\\mphasis java pgm\\fileheandling\\key.txt");
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(choice));
				bw.write("Mphasis Pvt. Ltd.");
				bw.close();
				System.out.println("Done");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	}
	}



