/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg6;

/**
 *
 * @author Jatin
 */
public class Expr_leaf implements Expr_Component{
    

    double value;

    public Expr_leaf(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
