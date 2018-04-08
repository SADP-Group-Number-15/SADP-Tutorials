/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadp_interpreter;

import java.util.Stack;

/**
 *
 * @author ROHIT NAVNATH JATHOT
 */
public class Sadp_interpreter {

    /**
     * @param args the command line arguments
     */
    private static String input = "";
    private static Stack<Expression> stack;
    private static String[] token;
    
    public Sadp_interpreter(String input){
        this.input = input;
        stack = new Stack<>();
        token = input.split(" ");
    }
        
    public double calculate() {
        for (String s : token) {
                if (Exp_helper.isOperator(s)) {
                        Expression rightExpression = stack.pop();
                        Expression leftExpression = stack.pop();
                        Expression operator = Exp_helper.getOperator(s, leftExpression,rightExpression);
                        double result = operator.interpret();
                        stack.push(new num_val(result));
                } else {
                        Expression i = new num_val(Double.parseDouble(s));
                        stack.push(i);
                }
        }
        return stack.pop().interpret();
    }
}
