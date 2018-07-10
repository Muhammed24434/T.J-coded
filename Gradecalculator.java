/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;
import java.util.*;

/**
 *
 * @author ONIKAN YOUTH CENTRE2
 */
public class Gradecalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input=new Scanner(System.in);
        System.out.println("What is your score");
        int score=Input.nextInt();
        //System.out.println(score);
        if (score>=70 && score<=100){
            System.out.println("A - Excellent");}
        else if (score>=60 && score<=69){
              System.out.println("B - VeryGood");}
        else if (score>=50 && score<=59){
              System.out.println("C - Credit");}
        else if (score>=40 && score<=49){
              System.out.println("D - Pass");}
        else if (score>=30 && score<=39){
              System.out.println("E - Fair ");}
        else if (score>=0 && score<=29){
              System.out.println("F - Fail "); }
              
        
        }
    }
    
}
