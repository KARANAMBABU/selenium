package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class basics {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void hai() {
		softassert.assertTrue(true);
		softassert.assertEquals("seshu", "Seshu");// false fail 
		softassert.assertEquals("babu", "babu");//true pass
		System.out.println("OK");
		softassert.assertAll();

	}

}
