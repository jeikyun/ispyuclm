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
public class Challenge3 {
    
    public static void main(String[] args)
    {
       double count = coinCombination8() + coinCombination7() + coinCombination6() + coinCombination5()+coinCombination4()+ coinCombination3()+ coinCombination2() + coinCombination1() ;
       System.out.print(count);
    }
    
    public static double coinCombination8()
    {
        double count = Math.pow(1, 8);
        return count;
    }
    
    public static double coinCombination7()
    {
        double count = Math.pow(2, 8);
        return count;
    }
    
    public static double coinCombination6()
    {
        double count = Math.pow(3, 8);
        return count;
    }
    
    public static double coinCombination5()
    {
        double count = Math.pow(4, 8);
        return count;
    }
    
    public static double coinCombination4()
    {
        double count = Math.pow(5, 8);
        return count;
    }
    
    public static double coinCombination3()
    {
        double count = Math.pow(6, 8);
        return count;
    }
    public static double coinCombination2()
    {
        double count = Math.pow(7, 8);
        return count;
    }
    
    public static double coinCombination1()
    {
        double count = Math.pow(8, 8);
        return count;
    }
    
    
    
    
     
    
}
