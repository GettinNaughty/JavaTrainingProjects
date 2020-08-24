import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "A compiled high level, OOP, platform independent language");
		languages.put("Python", "An interpreted, OOP, high level programming language with dynamic semantics");
		System.out.println(languages.put("Algol", "An algorithmic language"));
		languages.put("BASIC", "Beginners all purpose");
		System.out.println(languages.get("Java"));

	}

}
