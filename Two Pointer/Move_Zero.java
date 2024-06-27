/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done? */

class Solution {
    public void moveZeroes(int[] nums) {
        int nz = 0;
        int z = 0;
        aa:
        while(nz<nums.length){
            while(nums[nz]==0){
                if(nz<nums.length){
                    nz++;
                    if(nz==nums.length){
                        break aa;
                    }
                }
                else{
                    break;
                }
            }
            while(nums[z]>0 || nums[z]<0){
                if(z<nums.length){
                    z++;
                    if(z==nums.length){
                        break aa;
                    }
                }
                else{
                    break;
                }
            }
            if(nz>=z){
                nums[z] = nums[nz];
                nums[nz] = 0;
                z++;
                nz++;
            }
            else{
                nz++;
            }
        }
    }
}

/*
Accepted
Runtime: 0 ms
Case 1
Input
nums =
[0,1,0,3,12]
Output
[1,3,12,0,0]
Expected
[1,3,12,0,0]

Case 2
Input
nums =
[0]
Output
[0]
Expected
[0]

Case 3
Input
nums =
[0,0]
Output
[0,0]
Expected
[0,0]

Case 4
  Input
nums =
[73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0]
Output
[73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0]
Expected
[73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0]
*/
