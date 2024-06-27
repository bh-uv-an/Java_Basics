/*There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Greatest_number_of_candies {
    public List<Boolean> kidsWithCandies(int candies[], int extraCandies){
        int max = Integer.MIN_VALUE;
        for(int temp:candies){
            if(temp>max){
                max = temp;
            }
        }
        List<Boolean> li = new ArrayList<>();
        for(int temp:candies){
            if( temp+extraCandies >= max){
                li.add(true);
            }
            else{
                li.add(false);
            }
        }
        return li;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of childrens ");
        int n = sc.nextInt();
        int candies[] = new int[n];
        System.out.println("Enter the number of Choclates for each children ");
        for(int i=0;i<n;i++){
            candies[i] = sc.nextInt();
        }
        int extraCandies = 0;
        System.out.println("Enter the number of Extra Candies ");
        extraCandies = sc.nextInt();
        Greatest_number_of_candies ki = new Greatest_number_of_candies();
        List<Boolean> candie = ki.kidsWithCandies(candies,extraCandies);    
        System.out.println("List = "+candie);
        sc.close();    
    }
}
