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
public class Add implements Expression{
	
	private final Expression leftExp;
	private final Expression rightExp;

	public Add(Expression leftExpression,Expression rightExpression ){
		this.leftExp = leftExpression;
		this.rightExp = rightExpression;
	}
	@Override
	public double interpret() {
		return leftExp.interpret() + rightExp.interpret();
	}

}