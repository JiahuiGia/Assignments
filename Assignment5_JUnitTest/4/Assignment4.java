/**
 * Finish all the assignments. Try Bonus.
 * 
 * @author Yang
 */

public class Assignment4 {
	// Assignments
	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {

		if (str == null || str.length() == 0)
			return 0;

		int i;
		int count = 0;
		for (i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				count++;
			}
			if (str.charAt(i) == ' ' && count != 0) {
				return count;
			}
		}
		return count;
	}

	/**
	 * Reverse a string by letters. Do not use 'split' function. e.g.
	 * "I like soccer" --> "reccos ekil I"
	 */
	public String reverseString1(String str) {

		int i;
		char[] reversedStr1 = new char[str.length()];

		for (i = 0; i < str.length(); i++) {
			reversedStr1[i] = str.charAt(str.length() - 1 - i);
		}
		String finalStr1 = new String(reversedStr1);

		return finalStr1;
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g.
	 * "I like soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {

		String reversedStr2 = "";
		int tempEnd = str.length();

		for (int i = str.length() - 1; i > 0; i--) {
			if (str.charAt(i) == ' ') {
				int tempStart = i;
				for (int n = tempStart + 1; n < tempEnd; n++) {
					reversedStr2 += str.charAt(n);
				}
				reversedStr2 += " ";
				tempEnd = tempStart;
			}

		}

		int l = 0;
		if (str.charAt(l) != ' ')
			reversedStr2 += str.charAt(l);

		return reversedStr2;
	}

	/**
	 * Count how many words in a string. Numbers are regarded as a word. Do not
	 * use 'split' function. e.g. "I like soccer" --> 3. "I have 15 dollars" -->
	 * 4
	 */
	public int countWords(String str) {

		if (str != "") {
			int i;
			int n = str.charAt(0) == ' ' ? 0 : 1;
			for (i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
					n++;
			}
			return n;
		} else
			return 0;
	}

	/**
	 * Capitalize the first letters of words in a String. Do not use 'split'
	 * function. e.g. "I like soccer" --> "I Like Soccer".
	 */
	public String capitalizeLetters(String str) {

		char[] capitalized = new char[str.length()];

		capitalized[0] = Character.toUpperCase(str.charAt(0));

		String result = capitalized[0] + "";

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ')
				capitalized[i] = Character.toUpperCase(str.charAt(i));
			else
				capitalized[i] = str.charAt(i);

			result += capitalized[i];
		}

		return result;

	}

	/**
	 * Use enum to represent the type of vehicles, like Bus, Motorcycle, Sedan,
	 * SUV, Truck...
	 */
	enum typesOfVehicles {
		Bus, Motorcycle, Sedan, SUV, Truck, Car;
	}

	/**
	 * Define a vehicle class. Use suitable encapsulation. Use the enum you
	 * defined to represent the types. There is no standard answer for this
	 * question, but you need create necessary attributes for this class, and
	 * methods if needed.
	 */
	public class vehicle {

		class EncapsulatedVehicle {

			typesOfVehicles type;
			String name;

			private int amountOfRemainingGas;

			public int getAmountOfRemainingGas() {
				return amountOfRemainingGas;
			}

			public void setAmountOfRemainingGas(int amountOfRemainingGas) {
				this.amountOfRemainingGas = amountOfRemainingGas;
			}

			public int isDriving(Driver driver, int miles) {
				if (miles <= amountOfRemainingGas) {
					amountOfRemainingGas = amountOfRemainingGas - miles;
					return amountOfRemainingGas;
				} else {
					System.out.println("There is not enough gas for " + type + " " + name + " " + " driving " + miles
							+ " miles, please refuel.");
					return 0;
				}
			}
		}

		class Driver {
			String name;

			int drive(EncapsulatedVehicle v) {
				int x = (int) (Math.random() * 20);
				int y = v.isDriving(this, x);
				System.out.println(name + " wants to drive " + x + " miles, the vehicle has drived " + y
						+ " miles, now " + v.getAmountOfRemainingGas() + " remained.");
				return x;
			}

		}
	}

	// Bonus
	/**
	 * Count and Say. Count each character. e.g. "aabacbaa" --> "5a2b1c"
	 */
	public String countAndSay(String str) {

		int[] amount = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int letterIndex = c - 'a';
			amount[letterIndex] += 1;
		}

		StringBuilder result = new StringBuilder(52);

		for (int n = 0; n < 52; n++) {
			if (n % 2 == 0 && amount[n / 2] != 0)
				result.append(amount[n / 2]);
			char ch = (char) ('a' + (n - 1) / 2);
			if (n % 2 == 1 && amount[(n - 1) / 2] != 0)
				result.append(ch);
		}

		return result.toString();
	}

	/**
	 * Compare version number. If equal, return 0. if larger, return 1. if
	 * smaller, return -1. You could use library functions of Integer and
	 * String, like parseInt, split. e.g. "1.2.3" VS "1.2.0" --> 1. "1.2" VS
	 * "1.2.0" --> 0. "100.200" VS "200.100" --> -1.
	 */
	public int compareVersion(String v1, String v2) {

		String[] version1 = v1.split("\\.");
		String[] version2 = v2.split("\\.");

		int i = 0;
		while (i < version1.length || i < version2.length) {
			if (i < version1.length && i < version2.length) {
				if (Integer.parseInt(version1[i]) > Integer.parseInt(version2[i])) {
					return 1;
				} else if (Integer.parseInt(version1[i]) < Integer.parseInt(version2[i])) {
					return -1;
				}
			} else if (i < version1.length) {
				if (Integer.parseInt(version1[i]) != 0) {
					return 1;
				}
			} else if (i < version2.length) {
				if (Integer.parseInt(version2[i]) != 0) {
					return -1;
				}
			}

			i++;
		}

		return 0;

	}
}