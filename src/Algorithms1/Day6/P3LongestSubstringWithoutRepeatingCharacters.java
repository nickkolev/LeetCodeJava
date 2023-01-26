package Algorithms1.Day6;

import java.util.HashSet;

public class P3LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int pointerA = 0;
        int pointerB = 0;
        int max = 0;

        HashSet<Character> charSet = new HashSet();

        while(pointerB < s.length()) {
            if(!charSet.contains(s.charAt(pointerB))){
                charSet.add(s.charAt(pointerB));
                pointerB++;
                max = Math.max(max, charSet.size());
            } else {
                charSet.remove(s.charAt(pointerA));
                pointerA++;
            }
        }

        return max;
    }
}
