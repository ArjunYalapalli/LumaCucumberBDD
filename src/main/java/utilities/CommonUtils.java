package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

public class CommonUtils {

	// Method to get random string
	public String randomeString() {

		String generatedstring = RandomStringUtils.randomAlphabetic(10);
		return generatedstring;

	}

	// Method to get random number
	public String randomeNumber(int count) {

		String generatednumber = RandomStringUtils.randomNumeric(count);
		return generatednumber;

	}

	// Method to get random Email ID
	public String emailGenarator() {

		String generatedstring = RandomStringUtils.randomAlphabetic(4);
		String generatednumber = RandomStringUtils.randomNumeric(3);
		return (generatedstring + generatednumber + "@" + "gmail.com");

	}

	// Method to get random Alphanumaric
	public String alphaNumaric() {

		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		String generatednumber = RandomStringUtils.randomNumeric(3);
		return (generatedstring + "@" + generatednumber);

	}

	// Method to get Date and Time
	public String getCurrentDateTime() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());

	}

	// Method to generate test data
	public static String generateTestData(String fieldName) {
		switch (fieldName) {
		case "username":
			return "testUser" + System.currentTimeMillis();
		case "password":
			return "password" + Math.random();
		default:
			return "testData";
		}
	}

}
