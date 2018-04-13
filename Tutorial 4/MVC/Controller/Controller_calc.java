/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_calc;
import View.View_calc;
import calculator.*;
import java.util.Scanner;
/*
 * @author Jatin
 */
    public class Controller_calc extends Thread {
    
    private Model_calc m;
    private View_calc v;
    private Calculator c;
    private volatile String c_input = "";
    private Scanner scn = new Scanner(System.in);
    
    public Controller_calc(Model_calc m, View_calc v){
     this.m = m;
     this.v = v;
     c = new Calculator();
    }
    
    public String get_input(){
        while(v.a!=true)
        { 
            if(!"".equals(c_input)){
                String to_send = c_input;
                c_input="";
                return to_send;
           }   
        }
        
        if(v.a==true){
            v.a = false;
            return v.s1;
        }
        return null; //will never execute
        
    }
    
    public void update_model(String st, String ans){
      m.update_data(st,ans);
    }
    
    public String calculate_result(){
        return c.evaluate(m.export_data()); 
    }
    
    public void display_result(){
        v.view_jframe(m.export_result());
        v.view_cmdline(m.export_data(),m.export_result());
    }
    
       @Override
    public void run() {
        c_input = scn.next();
        v.b=true;
    }
}
