/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge;

/**
 *
 * @author Admin
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print(challenge1());
        
    }
    
    public static int challenge1()
    {
        int sum = 0;
        for (int x = 0 ; x < 1000; x++)
        {
            if( x % 3 == 0 || x % 5 == 0)
                sum += x;
        }
        return sum;
    }
    
    
}
