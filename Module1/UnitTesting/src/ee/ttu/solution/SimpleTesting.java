package ee.ttu.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Complete the methods and write Unit tests
 * to make sure that your code works correctly
 */
public class SimpleTesting {
	
	public SimpleTesting(){
		
	}

	public static void main(String[] args) {
		new SimpleTesting();
	}
	
	/**
	 * 
	 * @param value string representation of a number such as "42"
	 * @return integer value
	 */
	public int getIntegerFromString(String value){
		//Object classes of literal types often have
		//a valueOf method or parse[type] method that can
		//be used to convert one type to another
		return Integer.valueOf(value);
	}
	
	/**
	 * Read a file and return the content
	 * 
	 * @param file
	 * @return
	 */
	public String getContentFromFile(File file){
		String content = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine())!= null){
				content += line;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return content;
	}
	
	/**
	 * Return a number between 1 and 5
	 * @return
	 */
	public int getRandomNumber(){
		//There are several ways of doing this.
		//This is just one of many
		return ThreadLocalRandom.current().nextInt();
	}

}
