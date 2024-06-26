import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
