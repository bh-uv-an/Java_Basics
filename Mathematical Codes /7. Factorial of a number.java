/* Given a positive integer, N. Find the factorial of N.

Example 1:

Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120

Example 2:

Input:
N = 4
Output:
24
Explanation:
4*3*2*1 = 24

Your Task:
You don't need to read input or print anything. Your task is to complete the function factorial() which takes an integer N 
as input parameters and returns an integer, the factorial of N.
*/

import java.util.Scanner;

public class Factorial {
    public static long Fac(int N){
        if(N==0){
            return 1;
        }
        if(N==1){
            return 1;
        }
        return(N * Fac(N-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int N = sc.nextInt();
        System.out.println(Fac(N));
    }
}

/*

Output: 

Enter the number 
5
120

*/
