/* We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 

Constraints:

2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0
  */

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class aestroid_collision {
    public static int[] aestroidCollision(int[] asteroids){
       Stack<Integer> stk = new Stack<>();
       int i = 0;
       while(i<asteroids.length){
            if(i==0 || asteroids[i]>0 || stk.size()==0){
                stk.push(asteroids[i]);
                i++;
            }
            else{
                    if(asteroids[i]+stk.peek() == 0){
                        stk.pop();
                        i++;
                    }
                    else if(asteroids[i] + stk.peek() > 0){
                        i++;
                    }
                    else if(stk.peek()<0 && asteroids[i]<0){
                        stk.push(asteroids[i]);
                        i++;
                    }
                    else{
                        stk.pop();
                    }
            }
       }
       int ans[] = new int[stk.size()];
       for(int j = stk.size()-1;j>=0;j--){
            ans[j] = stk.pop();
       }
       return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for array ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = aestroidCollision(arr);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
