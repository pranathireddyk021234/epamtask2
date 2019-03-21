package epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class costTest {

	@Test
	void test() {
		cost c=new cost();
		assertEquals(2500,c.costEstimation(2,true,1));
		assertEquals(1800,c.costEstimation(2, false, 1));
	}

}
