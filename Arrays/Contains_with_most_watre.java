/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
*/


import java.util.Scanner;
public class Contain_with_most_Water {
    public static int maxArea(int[] hieght){
        int left = 0,hieghtLeft = 0,hieghtRight = 0,minHieght = 0,solution = 0;
        int right = hieght.length-1;
        while(left<right){
            hieghtLeft = hieght[left];
            hieghtRight = hieght[right];
            minHieght = Math.min(hieghtLeft,hieghtRight);
            //System.out.println("MinHieght = "+minHieght);
            solution = Math.max(((right - left)*minHieght),solution);
            //System.out.println("Solut = "+solution);      
            if(hieght[left]<hieght[right]){
                left++;
                //System.out.println("Left = "+left);
            }
            else{
                right--;
                //System.out.println("right = "+right);
            }
        }
        return solution;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Contains with most water = "+maxArea(arr));
        sc.close();
    }
}
