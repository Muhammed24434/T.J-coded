/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdec1;

/**
 *
 * @author ONIKAN YOUTH CENTRE2
 */
class car{
    int wheels = 4; //attribute
    String color = "red";
    //Behaviour or methods
    public void Moving () {
        System.out.println("My car is moving");
    }
    public void Start () {
         System.out.println("loading");
    }
    }

}

public class Classdec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        car Toyota = new car ();
        Toyota.color = "white";
        
        car Camry = new car () ;
        
        Toyota.Moving(); //calling the method
        System.out.println("this is camry"  + Camry.wheels + Camry.color);
        System.out.println("this is brother Toyota" + Toyota.color);
       
    }
    
}
