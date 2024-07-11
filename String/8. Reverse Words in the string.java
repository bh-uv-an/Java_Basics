import java.util.Scanner;
public class Rever_word_in_sentence {
    public static String ReverseWords(String str){
        String temp;
        String strarr[] = str.split(" +");
        StringBuilder strb = new StringBuilder();
        for(String strg:strarr){
            temp = new StringBuilder(strg).reverse().toString();
            strb.append(temp);
            strb.append(" ");
        }
        return strb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence ");
        String str = sc.nextLine();
        System.out.println(ReverseWords(str));
        sc.close();
    }
}


Output 1:
  Enter the Sentence 
  my name is bhuvan
  Reversed String = ym eman si navuhb

Output 2: 
  Hello world
  Reversed String = olleH dlrow
  
  
