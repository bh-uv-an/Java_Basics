/*Given an array arr of n elements and a integer k. Your task is to return the position of first occurence of k in the given 
array and if element k is not present in the array then return -1 .
Note: Position of first element is considered as 1.

Example 1:

Input:
n = 5
k = 16
arr = {9, 7, 2, 16, 4}
Output: 4
Explanation: k = 16 is found in the given array at position 4.
Example 2:

Input:
n = 7
k = 98
arr = {1, 22, 57, 47, 34, 18, 66}
Output: -1
Explanation: k = 98 isn't found in the given array.
Your Task:
Complete the function search() which takes two integers n , k and an array arr, as input parameters and returns an integer 
denoting the answer. Return -1 if the number is not found in the array. You don't have to print answers or take inputs.
  */

Code: 
import java.util.Scanner;

public class Searching_a_number {
    public static int search(int n, int k, int[] arr){
        for(int i =0;i<n;i++){
            if(arr[i]==k){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n = sc.nextInt();
        System.out.println("Enter the search element ");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(n,k,arr));
    }
}

/*

Output: 
"C:\Program Files\Microsoft\jdk-17.0.11.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 
Community Edition 2024.1.2\lib\idea_rt.jar=64352:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\bin" 
-Dfile.encoding=UTF-8 -classpath "C:\Users\LENOVO\IdeaProjects\Print The Pattern\out\production\Print The Pattern" 
  Searching_a_number
  
Enter the array size 
5
Enter the search element 
16
Enter the array elements 
9
7
2
16
4
4

Process finished with exit code 0
*/
