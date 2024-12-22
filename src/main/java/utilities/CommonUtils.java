package utilities;

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
		return (generatedstring + "@"+ generatednumber);

	}

}
