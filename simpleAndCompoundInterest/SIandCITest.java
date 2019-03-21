package epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SIandCITest {

	@Test
	void test() {
		SIandCI s=new SIandCI();
		assertEquals(1515.1500244140625,s.simpleInterest(20202, 3, 2.5f));
		assertEquals(2525.25,s.simpleInterest(20202, 5, 2.5f));
		assertEquals(21755.342888139312,s.compoundInterest(20202, 3, 2.5f));
		assertEquals(22856.7060585414,s.compoundInterest(20202, 5, 2.5f));
	}

}
