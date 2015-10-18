package ee.ttu.solution;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class SimpleTestingTest {

	SimpleTesting simpleTesting;
	
	//Methods marked with the @Before annotation
	//are run before tests
	//They can be used to initialize stuff
	@Before
	public void setUp(){
		simpleTesting = new SimpleTesting();
	}
	
	@Test
	public void testGetIntegerFromString() {
		int result = simpleTesting.getIntegerFromString("42");
		assertEquals(42, result);
	}
	
	@Test
	public void testGetContentFromFile(){
		String content = simpleTesting.getContentFromFile(new File("testFile.txt"));
		assertEquals("Hello!", content);
	}
	
	@Test
	public void testGetRandomNumber(){
		//Is testing this even possible?
		int result = simpleTesting.getRandomNumber();
	}

}
