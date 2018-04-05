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
public class Expr_Composite implements Expr_Component{
    
    private char op;
    private Expr_Component a;
    private Expr_Component b;
    
    public Expr_Composite( char op, Expr_Component b, Expr_Component a){
       this.a=a;
       this.b=b;
       this.op=op;
   }
    
    @Override
    public double calculate(){
        switch (op)
        {
            case '+':
                return Add(a,b);
            case '-':
                return Sub(a,b);
            case '*':
                return Mul(a,b);
            case '/':
                return Div(a,b);
        }
        return 0;
    }

    public double Add(Expr_Component left, Expr_Component right){
        return left.calculate() + right.calculate();
    }
    
    public double Sub(Expr_Component left, Expr_Component right){
        return left.calculate() - right.calculate();
    }
    public double Mul(Expr_Component left, Expr_Component right){
        return left.calculate() * right.calculate();
    }
    
    public double Div(Expr_Component left, Expr_Component right){
        if (right.calculate() == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
        return left.calculate() / right.calculate();
    }
    
}



