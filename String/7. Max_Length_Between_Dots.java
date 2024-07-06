/*

You are given to count the number of letter between dots and then the display the number which has more letter between the dots 

Test case:
Example 1:
  Input: s = "abc.ab.a"
  Output: 3
  Here the output is 3 because abc is the largest one between the dots 
  That is 
  abc = 3
  ab = 2
  a = 1 
Example 2: 
  Input s = "a"
  Output: 1
  Here the output is 1 as the largest String is 1 itself therefore output is 1 

*/

import java.util.Scanner;
public class Max_length_between_dots {
    public static int Max_Length(String s){
        int count = 0;
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                count = 0;
            }
            else{
                count++;
            }
            Max = Math.max(count, Max);
        }
        return Max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        System.out.println("Max Length Between Dots = "+Max_Length(s));
        sc.close();
    }
}

