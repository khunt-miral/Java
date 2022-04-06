
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // string input
        System.out.println("Enter first string");
        String str1 = sc.next();
        System.out.println("Enter second string");
        String str2 = sc.next();

        // converting string to character array
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        // sorting character array
        Arrays.sort(s1);
        Arrays.sort(s2);

        // checking if both string is having same characters
        int flag = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (s1[i] == s2[i]) {
            } else {
                flag = 1;
                break;
            }
        }

        // output
        if (flag == 1) {
            System.out.println("Not Anagram");
        } else {
            System.out.println("Anagram");
        }
        sc.close();
    }

}
