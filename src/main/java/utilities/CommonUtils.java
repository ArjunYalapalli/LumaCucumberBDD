package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

public class CommonUtils {

	// Method to get random string
	public String randomeString(int count) {

		String generatedstring = RandomStringUtils.randomAlphabetic(count); // a-z 24 A-Z 24
		return generatedstring;

	}

	// Method to get random number
	public String randomeNumber(int count) {

		String generatednumber = RandomStringUtils.randomNumeric(count); // 0-9
		return generatednumber;

	}

	// Method to get random Email ID
	public String emailGenarator(int scount, int icount) {

		String generatedstring = RandomStringUtils.randomAlphabetic(scount);
		String generatednumber = RandomStringUtils.randomNumeric(icount);
		return (generatedstring + generatednumber + "@" + "gmail.com");
		// dasd367@gmail.com

	}

	// Method to get random Alphanumaric
	public String alphaNumaric(int scount, int icount) {

		String generatedstring = RandomStringUtils.randomAlphabetic(scount);
		String generatednumber = RandomStringUtils.randomNumeric(icount);
		return (generatedstring + "@" + generatednumber);

	}

	// Method to get Date and Time
	public String getCurrentDateTime() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());

	}

	// Method to generate test data
	public String generateTestData(String fieldName) {

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
