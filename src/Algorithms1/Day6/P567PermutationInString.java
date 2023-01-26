package Algorithms1.Day6;

import java.util.Arrays;
import java.util.HashSet;

public class P567PermutationInString {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "ooolleoooleh";

        if(s1.length() > s2.length()) System.out.println("false");;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1, arr2)) System.out.println("true");

        int front = 0;
        int back = s1.length();
        while(back < s2.length()){
            arr2[s2.charAt(front) - 'a']--;
            arr2[s2.charAt(back) - 'a']++;

            if(Arrays.equals(arr1, arr2)) System.out.println("true");
            front++;
            back++;
        }
        System.out.println("false");
    }
}
