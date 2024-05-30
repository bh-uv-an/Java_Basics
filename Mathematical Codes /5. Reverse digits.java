/*You are given an integer N, reverse the digits of given number N, ensuring that the reversed number has no leading zeroes. 
Return the resulting reversed number.

Example 1:

Input: 200
Output: 2
Explanation: By reversing the digts of 
number, number will change into 2.
Example 2:

Input : 122
Output: 221
Explanation: By reversing the digits of 
number, number will change into 221.


Your Task:
You don't need to read or print anything. Your task is to complete the function reverse_digit() which takes N as input 
parameter and returns the reversed number.
  */
import java.util.Scanner;

public class Set_5_Reverse_digit {
    public static void rev(int n){
        int digit = 0,rev = 0;
        while(n>0){
            digit = n % 10;
            rev = rev*10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit ");
        int n = sc.nextInt();
        rev(n);
        sc.close();
    }
}
/*
Output:
"C:\Program Files\Microsoft\jdk-17.0.11.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\lib\idea_rt.jar=54048:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\LENOVO\IdeaProjects\Print The Pattern\out\production\Print The Pattern" Set_5_Reverse_digit
Enter the digit 
45
54

Process finished with exit code 0
*/
