/*
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.
*/

package org.studyeasy;
import java.util.Scanner;

public class String_Pallindrome {
    public static void palli(String str){
        int chk = 0;
        int l = str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(l-1-i)){
                chk = 1;
                break;
            }
        }
        if(chk==0){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        palli(str);
        sc.close();
    }
}

/*
Output:
"C:\Program Files\Microsoft\jdk-17.0.11.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\lib\idea_rt.jar=55205:
C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\LENOVO\IdeaProjects\Hello_World\target\classes 
org.studyeasy.String_Pallindrome

Enter the String 
nan
Pallindrome

Process finished with exit code 0

*/
