package Resources;

import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void handleAssertions(String actual, String expected, String message) {

		SoftAssert a = new SoftAssert();
		String ac = actual;
		String exp = expected;
		a.assertEquals(ac, exp, message);
		a.assertAll();

	}

}
