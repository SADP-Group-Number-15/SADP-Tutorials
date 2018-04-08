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
public class Product implements Expression{

	private final Expression leftExp;
	private final Expression rightExp;

	public Product(Expression leftExpression,Expression rightExpression ){
		this.leftExp = leftExpression;
		this.rightExp = rightExpression;
	}
	@Override
	public double interpret() {
		return leftExp.interpret() * rightExp.interpret();
	}
}