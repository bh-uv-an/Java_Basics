/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.*/

import java.util.Scanner;
public class Reverse_word_in_String {
    public String reverseWords(String s) {
        StringBuilder strb = new StringBuilder();
        String arr[] = s.split(" +");
        for(int i=arr.length-1;i>=0;i--){
            strb.append(arr[i]);
            strb.append(" ");
        }
        String res = strb.toString();
        res.trim();
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Reverse_word_in_String rvws = new Reverse_word_in_String();
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("Reverse Word = "+rvws.reverseWords(str) );  
        sc.close();
    }
}
