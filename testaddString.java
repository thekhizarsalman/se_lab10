package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		JunitFunction junitstring = new JunitFunction();
		String result = junitstring.addStrings("He was", " fabolous");
		assertEquals("He was fabolous",result);
		
	}

}