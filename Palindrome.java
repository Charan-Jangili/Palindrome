 import java.util.Scanner;
public class Palindrome{
 public static void main(String[] args){
    Scanner ab= new Scanner(System.in);
    System.out.println("ENTER A STRING :");
    String c = ab.next();
    String rev="";
    for(int i=c.length()-1;i>=0;i--){
         rev= rev+c.charAt(i);
    }
        if(c.equals(rev))
        System.out.println("given string is a palindrome");
        else
        System.out.println("not a palindrome");
    
    ab.close();



 }

}

    

