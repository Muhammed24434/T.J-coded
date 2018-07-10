/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional1;
import java.util.*;

/**
 *
 * @author ONIKAN YOUTH CENTRE2
 */
public class Conditional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        System.out.println("what is your name");
        String name = inp.nextLine();
        //System.out.println(name);
        switch(name) {
            case "Muhammed":
                System.out.println("Good boy " + name);
                break;
            case "Abdullah":
                System.out.println("the python"+ name);
                break;
            case "Amoo Hotel":
                System.out.println("hello" + name);
                break;
            case "Oseunfunmi":
                System.out.println("maths teacher" + name);
                break;
            default:
                System.out.println("who are you");
                break;
                
                
       // int x = 2;
       // switch (x) {
          //  case 1: System.out.println("muhammedtwo");
          //  break;
          //  case 2: System.out.println("");
          //  break; 
           // default:
           //     System.out.println("gfhfjufthjuf");
        }
    }
    
}
