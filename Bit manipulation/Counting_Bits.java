/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i. 

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 

Constraints:

0 <= n <= 105
 

Follow up:

It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?

*/
import java.util.Scanner;
import java.util.Arrays;
public class counting_bits {
    public static int[] checkBits(int n){
        int ans[] = new int[n+1];
        int i=0;
        while(i<n+1){
            if(i==0){
                ans[i] = 0;
                i++;
            }
            else if(i%2==0){
                ans[i] = ans[i/2];
                i++;
            }
            else{
                ans[i] = ans[i/2] + 1;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int arr[] = checkBits(n);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
Output: 
Enter the number 
9
[0, 1, 1, 2, 1, 2, 2, 3, 1, 2]
