package ee.ttu.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Nish This class is intended to process a list of students found in
 *         student_list.txt
 * 
 *         ========= Student list format - CSV ========= Name,id
 *         =======================================
 * 
 *         Things the application is supposed to do 
 *         1. Read a list of students from a file 
 *         2. Add them to an array 
 *         3. Pick a number at random between 1 and number of students
 *            available and set the student bearing that id
 *            number as student of the day
 */
@SuppressWarnings("unused")
public class StudentManager {

	private Student studentOfTheDay;
	int luckyNumber = getRandomNumber();

	public StudentManager() {
		int luckyNumber = 0;
		Student[] students = new Student[10];

		// Try with resources statement
		// Read more here
		// https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		try (BufferedReader myReader = new BufferedReader(new FileReader(
				new File("student_list.txt")));) {

			String lineOfText;
			while ((lineOfText = myReader.readLine()) != null) {
				int count = 0;
				String[] rawStudentInfo = lineOfText.split(",");
				students[count] = new Student(rawStudentInfo[0],
						Integer.valueOf(rawStudentInfo[1]));
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Pick a student to be studentOfTheDay
		studentOfTheDay = students[luckyNumber];

	}

	public static void main(String[] args) {
		new StudentManager();
	}

	public int getRandomNumber() {
		return ThreadLocalRandom.current().nextInt(0, 5);
	}
}
