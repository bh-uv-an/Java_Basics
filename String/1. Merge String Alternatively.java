/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d

*/


import java.util.Scanner;
public class Merge_String_Alternatively{
    public static String MergeString(String str1,String str2){
        StringBuilder strb = new StringBuilder();
        int l1 = str1.length();
        int l2 = str2.length();
        int i = 0;
        while(i<l1 || i<l2){
            if(i<l1){
                strb.append(str1.charAt(i));
            }
            if(i<l2){
                strb.append(str2.charAt(i));
            }
            i++;
        }
        return strb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the two String ");
        str1 = sc.next();
        str2 = sc.next();
        System.out.println(MergeString(str1,str2));
        sc.close();
    }
}
