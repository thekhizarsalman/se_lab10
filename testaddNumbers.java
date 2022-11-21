package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() {
		JunitFunction junit = new JunitFunction();
		int result = junit.addNumbers(105, 115);
		assertEquals(220,result);
		
	}

}