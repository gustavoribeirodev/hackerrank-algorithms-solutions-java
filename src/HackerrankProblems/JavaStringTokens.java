package HackerrankProblems;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
Problem:

Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.

Input Format

A single string, s.

Constraints
s is composed of any of the following:
English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?),
periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer,n, denoting the number of tokens in string s (they do not need to be unique).
Next, print each of the n tokens on a new line in the same order as they appear in input string s.
 */

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer str_token = new StringTokenizer(s, "[! ,?._'@]+");
        System.out.println(str_token.countTokens());
        while(str_token.hasMoreTokens())
            System.out.println(str_token.nextToken());

        scan.close();
    }
}
