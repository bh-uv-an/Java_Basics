/*You are given a number N. You need to print the pattern for the given value of N.

For N = 4 the pattern will be 
1 
1 1 2 2 
1 1 1 2 2 2 3 3 3 
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 

  */

import java.util.Scanner;

public class Set_6_Print_Pattern {
    public static void pattern(int n){
        int temp1 = 1;
        int temp2 = n;
        while(temp1<=temp2){
            for(int i=1;i<=temp1;i++){
                for(int j=1;j<=temp1;j++) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            temp1++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        pattern(n);
    }
}

/*

Output 1: 
Enter the number 
4
1 
1 1 2 2 
1 1 1 2 2 2 3 3 3 
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 

Output 2:
Enter the number 
5
1 
1 1 2 2 
1 1 1 2 2 2 3 3 3 
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 
1 1 1 1 1 2 2 2 2 2 3 3 3 3 3 4 4 4 4 4 5 5 5 5 5 
*/
