// 151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        // split s in array of strings
        String[] words = s.trim().split("\\s+");
        // loop to store in reverse order
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.substring(0, result.length() - 1);
    }
}