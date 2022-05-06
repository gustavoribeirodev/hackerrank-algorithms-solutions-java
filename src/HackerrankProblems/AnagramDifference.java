package HackerrankProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AnagramDifference {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int aCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        String[] a = new String[aCount];
        for (int aItr = 0; aItr < aCount; aItr++) {
            String aItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            a[aItr] = aItem;
        }
        int bCount = scanner.nextInt();
        String[] b = new String[bCount];
        for (int bItr = 0; bItr < bCount; bItr++) {
            String bItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            b[bItr] = bItem;
        }


        int[] res = getMinimumDifference(a, b);
        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));
            if (resItr != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }


    private static int[] getMinimumDifference(String[] a, String[] b) {
        int n=a.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++) {
            String s1=a[i];
            String s2=b[i];
            int result=getAnagramDiff(s1,s2);
            ans[i]=result;
        }
        return ans;
    }


    static int getAnagramDiff(String s1, String s2)
    {
        int count = 0;
        int s1len=s1.length();
        int s2len=s2.length();
        if(s1len!=s2len)return-1;
        int char_count[] = new int[26];
        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - 'a']++;
        for (int i = 0; i < s2.length(); i++)
            if (char_count[s2.charAt(i) - 'a']-- <= 0)
                count++;
        return count;

    }
}
