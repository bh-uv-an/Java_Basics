/*
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
 

Example 1:

Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".
Example 2:

Input: s = "erase*****"
Output: ""
Explanation: The entire string is removed, so we return an empty string.
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters and stars *.
The operation above can be performed on s. */

import java.util.Scanner;
public class Removing_stars_from_string {
    public static String removeStars(String s){
        int n = s.length();
        StringBuilder strb = new StringBuilder();
        int i =0;
        int counter = 0;
        if(n==1){
            return s;
        }
        while(i<n){

            if(s.charAt(i)=='*'){
                strb.deleteCharAt(counter-1);
                counter--;
            }
            else{
                strb.append(s.charAt(i));
                counter++;
            }
            i++;
        }
        return strb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        System.out.println(removeStars(s));
        sc.close();
    }
}

Output:

Enter the string 
leet**cod*e  
lecoe
PS D:\Interview Coding Questions> 
