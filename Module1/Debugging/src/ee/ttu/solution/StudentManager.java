package ee.ttu.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;


// Using suppressed annotations is usually not a 
// good idea. It prevents eclipse from letting you
// know when it spots a something that could be a problem

//@SuppressWarnings("unused")
public class StudentManager {

	private Student studentOfTheDay;
	int luckyNumber = getRandomNumber();
	
	
    //When giving path to files, if you do not provide
	//a path starting from the root of your hard drive
	//it assumes it starts from the root of the project folder. 
	//always double check that your path is accurate
	String fileLocation = "src/student_list_fixed.txt"; // In the original text file, line two had an extra comma
	
	public StudentManager() {
//		int luckyNumber = 0; // this overrides the field variable with the same name
		Student[] students = new Student[10];

		// Try with resources statement
		// Read more here
		// https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		try (BufferedReader myReader = new BufferedReader(new FileReader(new File(fileLocation )))) {

			String lineOfText;
			int count = 0;
			while ((lineOfText = myReader.readLine()) != null) {
//				int count = 0;    -- Your counter should never be inside
//                                -- the while loop 	
				String[] rawStudentInfo = lineOfText.split(",");
				students[count] = new Student(rawStudentInfo[0], Integer.valueOf(rawStudentInfo[1]));
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Pick a student to be studentOfTheDay
		studentOfTheDay = students[luckyNumber];

	}

	public static void main(String[] args) {
		new StudentManager();
	}

	public int getRandomNumber() {
		return ThreadLocalRandom.current().nextInt(0, 5);
	}
}
