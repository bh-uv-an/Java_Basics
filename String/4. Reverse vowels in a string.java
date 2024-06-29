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
public class Reverse_vowels_in_String {
    public static Boolean isvowel(char c){
        if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s){
       char arr[] = s.toCharArray();
       int start = 0;
       int end = s.length()-1;
        while(start<end){
            if(!isvowel(arr[start])){
                start++;
            }
            else if(!isvowel(arr[end])){
                end--;
            }
            else{
                char temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Reverse_vowels_in_String rvins = new Reverse_vowels_in_String();
        System.out.println("Enter the String ");
        String str = sc.next();
        System.out.println("After reversing vowel = "+rvins.reverseVowels(str));
        sc.close();
    }
}
