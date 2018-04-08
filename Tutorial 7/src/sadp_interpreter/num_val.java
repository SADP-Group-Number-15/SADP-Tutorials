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
public class num_val implements Expression{

	private final double n;
	
	public num_val(double n){
		this.n = n;
	}
	@Override
	public double interpret() {
		return n;
	}

}