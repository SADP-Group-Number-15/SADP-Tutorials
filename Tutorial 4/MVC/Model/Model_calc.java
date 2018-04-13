/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jatin
 */
public class Model_calc {
    private static String expr;
    private static String ans;
    public void update_data(String st, String result){
       expr = st;
       ans = result;
    }
    public String export_data(){
     return expr;   
    }
    public String export_result(){
        return ans;
    }
}
