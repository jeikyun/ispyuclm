/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Challenge2 {
   
    
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       String input = scan.nextLine();
       try
       {
           if(input.equals(reverse(input)))
           {
               System.out.print("Palindrome");
           }
           else
               System.out.print("Not a palindrome");
       }catch(Exception ex)
       {
           System.out.print(ex);
       }
    }
    
    public static String reverse(String input) throws Exception
    {
        int size = input.length()-1;
        String rev = "";
        for(int x = size ; x >= 0 ; x--)
        {
            rev = rev+""+input.charAt(x);
        }
        return rev;
    }
}
