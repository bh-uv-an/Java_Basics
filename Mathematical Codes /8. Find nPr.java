/* 
Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

Example 1:

Input: n = 2, r = 1
Output: 2
Explaination: 2!/(2-1)! = 2!/1! = (2*1)/1 = 2.
Example 2:

Input: n = 3, r = 3
Output: 6
Explaination: 3!/(3-3)! = 3!/0! = 6/1 = 6.

  Your Task:
You do not need to read input or print anything. Your task is to complete the function nPr() which takes n and r as input 
  parameters and returns nPr .

  */

import java.util.Scanner;

public class n_p_r {
    static int Fac(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return(n * Fac(n-1));
    }
    public static int nPr(int n,int r){
        return (Fac(n)/(Fac(n-r)));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nPr p = new nPr();
        System.out.println("Enter the value for n ");
        int n = sc.nextInt();
        System.out.println("Enter the value for r ");
        int r = sc.nextInt();
        System.out.println(nPr(n,r));
    }
}

/*
Output 1: 
Enter the value for n 
3
Enter the value for r 
3
6

Output 2:
Enter the value for n 
5
Enter the value for r 
2
20
*/
