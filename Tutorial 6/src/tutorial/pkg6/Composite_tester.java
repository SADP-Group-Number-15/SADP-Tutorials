/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg6;

import java.util.Stack;

/**
 *
 * @author Jatin
 */
public class Composite_tester {
 
 private Stack<Expr_Component> values = null;
 private Stack<Character> ops = null;
 private char[] tokens = null;
 private String s="";
    
 public Composite_tester(String s){
    this.s=s;   
 }
 

 public double calculate(){
   
    tokens = s.toCharArray();
    values = new Stack<>();
    ops = new Stack<>();
    
    for (int i = 0; i < tokens.length; i++){
        if (tokens[i] == ' ')
            continue;

        if ((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i]=='.')){
            StringBuffer sbuf = new StringBuffer();
            while (i < tokens.length &&((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i]=='.')))
                sbuf.append(tokens[i++]);
            i--;
            values.push(new Expr_leaf(Double.parseDouble(sbuf.toString())));
        }

        else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){
            
            while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
              values.push(new Expr_leaf((new Expr_Composite(ops.pop(), values.pop(), values.pop())).calculate()));

            ops.push(tokens[i]);
        }
    }
    
    while (!ops.empty())
    values.push(new Expr_leaf((new Expr_Composite(ops.pop(), values.pop(), values.pop())).calculate()));
    return (values.pop()).calculate();
    
}
 
public static boolean hasPrecedence(char op1, char op2)
    {
        return !((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'));
    }  
}
