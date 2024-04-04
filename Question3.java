import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java Program to count the number of words in a string using HashMap";
        Map<String, Integer> wordCountMap = new HashMap<>();
        int start = 0;
        for (int end = 0; end <= str.length(); end++) {
            if (end == str.length() || str.charAt(end) == ' ') {
                String word = str.substring(start, end).toLowerCase();
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
                start = end + 1;
            }
        }

        System.out.println("Word count:");
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
