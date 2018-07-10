/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

/**
 *
 * @author ONIKAN YOUTH CENTRE2
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // = is equal to
        // != not equal to
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to
        // % modules 
        // && and 
        // || or 
        
        int num = 5;
        int num1 = 3 ;
        if ((num1>num) && (num <10) ) {
            System.out.println("3 is greater than 5") ;
        }else if ( (num1<=num) && (5<20) ) {
            System.out.println("both are right") ;
        }else if (num != 3) {
            System.out.println("hheehhee 5 ") ;
        }else if (num==5) {
            System.out.println("is equal to 5 ") ;
        }else{ System.out.println ("the condition is not met") ;

        }

                
    }
    
}
