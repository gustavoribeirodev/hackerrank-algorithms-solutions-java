package HackerrankProblems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/*
Write a class called MyRegex which will contain a string pattern.
You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.
Use the following definition of an IP address:

"IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3."

In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String . The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)
 */

public class ValidateIPAddressRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
            // retorna true se for valido, depois eu coloco uma mensagem bonitinha
        }

    }
}

class MyRegex{
    String pattern = "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
            + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
            + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])."
            + "([1][\\d][\\d]|[0][0][0]|([0][0]|)[\\d]|([0]|)[\\d][\\d]|[2][0-4][\\d]|[2][5][0-5])";

}

