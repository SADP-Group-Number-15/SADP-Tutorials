/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadp_interpreter;

/**
 *
 * @author ROHIT NAVNATH JATHOT
 */
public class Exp_helper {

	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
			return true;
		else
			return false;
	}
	
	public static Expression getOperator(String s, Expression left,	Expression right) {
		switch (s) {
		case "+":
			return new Add(left, right);
		case "-":
			return new Substract(left, right);
		case "*":
			return new Product(left, right);
                case "/":
                        return new division(left,right);
		}
		return null;
	}

}