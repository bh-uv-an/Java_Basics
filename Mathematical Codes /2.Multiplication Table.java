/*Create the multiplication table of a given number N and return the table as an array.


Example 1:

Input:
N = 9

Output:
9 18 27 36 45 54 63 72 81 90

Explanation:
The table of 9 is the output whose 1st term is 9 and the 10th term is 90.

Example 2:

Input:
N = 2

Output:
2 4 6 8 10 12 14 16 18 20

Your Task:  
You don't need to read input. Your task is to complete the function getTable() which takes an integer N as input parameter and returns a list of integers denoting the 
multiplication of table of N from 1 to 10. 
*/

import java.util.Scanner;
import java.util.ArrayList;
public class Multiplication_Table {
    public static ArrayList<Integer> Table(int n, ArrayList al){
        int temp = 0;
        for(int i=1;i<=10;i++) {
            temp = n * i;
            al.add(temp);
        }
        return al;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        al = Table(n,al);
        for(Integer ele:al){
            System.out.println(ele);
        }
        sc.close();
    }
}
/*
Output: 

"C:\Program Files\Microsoft\jdk-17.0.11.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\lib\idea_rt.jar=52269:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\LENOVO\IdeaProjects\Print The Pattern\out\production\Print The Pattern" Multiplication_Table
Enter the number 
5
5
10
15
20
25
30
35
40
45
50

Process finished with exit code 0
*/
