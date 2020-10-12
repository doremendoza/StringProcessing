import acm.program.*;

public class commasString extends ConsoleProgram {
	public void run() {
		while (true) {
			String digits = readLine("Enter a number: ");
			if (digits.length() == 0)
				break;
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString(String digits) {
		String placeholder = "";
		int letterSelector = digits.length();
		try {
			int testing = Integer.parseInt(digits);
			for (int i = 0; i < digits.length(); i++) {
				letterSelector--;
				if (letterSelector < 0) {
					letterSelector = 0;
				}
				if (i % 3 == 0 && i != 0) {
					placeholder += ",";
				}
				placeholder += digits.charAt(letterSelector);
			}
			// reversing the string
			return (new StringBuilder(placeholder).reverse().toString());

		} catch (NumberFormatException e) {
			return "incorrect format please enter a number";
		}

	}

}