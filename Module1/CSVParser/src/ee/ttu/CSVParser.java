package ee.ttu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
* Small program that takes in a CSV file as input
* prints out the contents to the console
*/
public class CSVParser {

	public static void main(String[] args) {
		try {
			//This is helps you open and read the file
			FileReader fileReader = new FileReader(new File("contacts.csv"));
			BufferedReader reader = new BufferedReader(fileReader);
			

			String line = "";
			while((line = reader.readLine()) != null){
				// Split breaks up a string into a string array
				// here we are telling it to break it up where ever
				// it finds a comma
				String[] content = line.split(",");
				System.out.println("name=" + content[0]);
				System.out.println("email=" + content[1]);
			}
			
			//catch blocks contain code that we want to run if there is an error
		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong... That's all i know.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
