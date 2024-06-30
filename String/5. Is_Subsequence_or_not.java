/*

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
*/
import java.util.Scanner;
public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int front1 = 0;
        int front2 = 0;
        if(t.length()==0 && s.length()>0){
             return false;
        }
        if(t.length()==0 && s.length()==0){
         return true;
        }
 
         while(front1<s.length() && front2<t.length()){          
             if(s.charAt(front1) == t.charAt(front2)){
                 front1++;
                 front2++;
             }
             else{
                 front2++;  
             }
         } 
        if(front1==s.length()){
         return true;
        }
        else{
         return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1 ");
        String str1 = sc.next();
        System.out.println("Enter the String 2 ");
        String str2 = sc.next();
        System.out.println(isSubsequence(str1 , str2));
        sc.close();
    }
}
