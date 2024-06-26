/*Given the first 2 terms a1 and a2 of an Arithmetic Series.Find the nth term of the series. 

Example 1:

Input:
a1 = 2
a2 = 3
n = 4
Output: 5
Explanation:
The series is: 2,3,4,5,6....
Thus,4th term is 5.

Example 2:

Input:
a1 = 1
a2 = 3
n = 10
Output: 19
Explanation:
The series is: 1,3,5,7,9,11,13,15,17,19,21..
Thus,10th term is 19.

Your Task:
You don't need to read input or print anything.Your Task is to complete the function nthTermOfAP() which takes three integers a1, a2 and n as input parameters and returns 
the nth term of the AP that has a1 and a2 as the first and second terms respectively.
*/

import java.util.Scanner;
public class Set_2_Series_AP {
    public static int nthTermOfAP(int a1,int a2,int n){
        int diff = a2 - a1;
        int res = a1;
        for(int i=1;i<n;i++){
            res+= diff;
        }
        return res;
    }
    public static void main(String[] args){
        int a1, a2, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term ");
        a1 = sc.nextInt();
        System.out.println("Enter the second term ");
        a2 = sc.nextInt();
        System.out.println("Enter the position in the series ");
        n = sc.nextInt();
        System.out.println(nthTermOfAP(a1,a2,n));
        sc.close();
    }
}
/*
Output:

"C:\Program Files\Microsoft\jdk-17.0.11.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\lib\idea_rt.jar=64750:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\LENOVO\IdeaProjects\Print The Pattern\out\production\Print The Pattern" Set_2_Series_AP
Enter the first term 
1
Enter the second term 
3
Enter the position in the series 
10

19

Process finished with exit code 0
*/
