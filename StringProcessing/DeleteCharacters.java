import acm.program.*;

public class DeleteCharacters extends ConsoleProgram {

	public void run() {
		println(removeAllOccurrences("Dore", 'D'));
		println(removeAllOccurrences("antelope", 'e'));
		println(removeAllOccurrences("frog", 'g'));
	}

	public String removeAllOccurrences(String str, char ch) {
		String done = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				done += str.charAt(i);
			}

		}

		return done;

	}
}