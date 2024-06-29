/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
*/
import java.util.Arrays;
import java.util.Scanner;
public class Product_of_array_except_self {
    public static int[] productExceptSelf(int[] nums){
        int ans[] = new int[nums.length];
        int right[] = new int[nums.length];
        int left[] = new int[nums.length];
        int i = 0;
        int last = nums.length - 1;
        while(i<nums.length){
            if(i==0){
                left[i] = 1;
                right[last] = 1;
                i++;
                continue;
            }
            left[i] = nums[i-1] * left[i-1];
            right[last-i] = nums[last-i+1] * right[last-i+1];
            i++;
        }
        for(int j=0;j<nums.length;j++){
            ans[j] = left[j] * right[j];
        } 
        return ans;  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int arr[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

