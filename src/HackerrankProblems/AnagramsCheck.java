package HackerrankProblems;

import java.util.Scanner;

/*
Problem:
    Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
    For this challenge, the test is not case-sensitive.
    For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description:
    Complete the isAnagram function in the editor.

    isAnagram has the following parameters:
    string a: the first string
    string b: the second string

Returns:
    boolean: If a and b are case-insensitive anagrams, return true.
    Otherwise, return false.

Input Format:
    The first line contains a string a.
    The second line contains a string b.

Constraints:
    1 < length(a), length(b) < 50
    Strings a and b consist of English alphabetic characters.
    The comparison should NOT be case-sensitive.

     */

public class AnagramsCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        int max = 256;
        a = a.toUpperCase();
        b = b.toUpperCase();

        if(a.length() == b.length()){
            int[] a1 = new int[max];
            int[] b2 = new int[max];

            for(int i=0; i<a.length(); i++){
                a1[(int) a.charAt(i)] += 1;
                b2[(int) b.charAt(i)] += 1;
            }

            for(int i = 0; i<max; i++){
                if(a1[i] != b2[i])
                    return false;
            }
            return true;
        }
        else
            return false;
    }

}

