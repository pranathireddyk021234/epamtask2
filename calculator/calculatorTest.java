package epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void test() {
		calculator c = new calculator();
		assertEquals(5,c.addition(2, 3));
		assertEquals(3,c.addition(5,-2));
		assertEquals(4,c.addition(2, 2));
		assertEquals(6,c.multiplication(2,3));
		assertEquals(-1,c.multiplication(1, -1));
		assertEquals(2,c.division(4, 2));
	}

}
