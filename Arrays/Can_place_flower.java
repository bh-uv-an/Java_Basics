/*You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
  */

import java.util.Scanner;
public class Can_place_flower {
    public Boolean canPlaceFlowers(int[] flowerbed,int n){
        int i = 0;
        int count = 0;
        while(i<flowerbed.length){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                System.out.println(i);
                flowerbed[i] = 1;
                count++;
            }
            i++;
        } 
        if(count>=n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Can_place_flower cpf = new Can_place_flower();
        System.out.println("Enter the size for flowerBed ");
        int s = sc.nextInt();
        System.out.println("Enter the Plants ");
        int flowerbed[]  = new int[s];
        for(int i=0;i<s;i++){
            flowerbed[i] = sc.nextInt();
        }
        System.out.println("Enter the number of plants to be added ");
        int n = sc.nextInt();
        Boolean res = cpf.canPlaceFlowers(flowerbed,n);
        System.out.println(res);
        sc.close();
    }
}
