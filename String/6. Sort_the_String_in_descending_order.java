/*
Given a string str containing only lower case alphabets, the task is to sort it in lexicographically-descending order.

Example 1:

Input: str = "geeks"
Output: "skgee"
Explanation: It's the lexicographically-
descending order.
Example 2:

Input: str = "for"
Output: "rof"
Explanation: "rof" is in
lexicographically-descending order.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function ReverseSort() which takes the string str as inputs and returns the modified string.

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(1)
  */
import java.util.Scanner;
import java.util.Arrays;
public class Sort_the_String_in_descending {
    public static String ReverseSort(String str){
        StringBuilder strb = new StringBuilder();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            strb.append(arr[i]);
        }
        return strb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        System.out.println(ReverseSort(str));
        sc.close();
    }
}
