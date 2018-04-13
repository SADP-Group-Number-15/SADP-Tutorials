/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Model.Model_calc;
import View.View_calc;
import Controller.Controller_calc;
/**
 *
 * @author Jatin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller_calc c = new Controller_calc(new Model_calc(), new View_calc());
        c.start();
        String st ="";
        st = c.get_input();       
        while(true){
            String re = "0";
            c.update_model(st, re);            
            re = c.calculate_result();           
            c.update_model(st, re);
            c.display_result();
            st = c.get_input();
     } 
    }
}
    

