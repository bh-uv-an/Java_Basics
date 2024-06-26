/*You are given a number N. You need to print the pattern for the given value of N.

For N = 2 the pattern will be 
2 2 1 1
2 1

For N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Note: Instead of printing a new line print a "$" without quotes. After printing the total output, end of the line("$") is expected.

Example 1:

Input: 2
Output:
2 2 1 1 $2 1 $

Example 2:

Input: 3
Output:
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $

Your Task:
Since this is a function problem, you don't need to worry about the test cases. Your task is to complete the function printPat() which takes one argument 'N' denoting 
the length of the pattern.
*/

//Code: 

import java.util.Scanner;

public class Set_1 {
    public static void pattern(int n){
        int temp=n;
        while(temp!=0){
           for(int i=n;i>0;i--){
               for(int j=temp;j>0;j--){
                   System.out.printf("%d",i);
               }
           }
           System.out.print("&");
           temp--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}



/*Output:
Enter the number 
3
 3 3 3 2 2 2 1 1 1
 3 3 2 2 1 1
 3 2 1
*/
