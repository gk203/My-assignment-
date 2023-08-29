package Week4.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Babu";

        char[] characters = name.toCharArray();
        Set<Character> uniqueChars = new HashSet<Character>();

        for (char c : characters) {
            if (!uniqueChars.add(c)) {
                uniqueChars.remove(c);
            }
        }

        System.out.println("Unique characters: " + uniqueChars);
	}

}
