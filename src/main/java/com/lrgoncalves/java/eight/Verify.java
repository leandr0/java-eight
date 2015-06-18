/**
 * 
 */
package com.lrgoncalves.java.eight;

/**
 * @author lrgoncalves
 *
 */
public class Verify implements Testable {

	/* (non-Javadoc)
	 * @see com.lrgoncalves.java.eight.Testable#test(int, int)
	 */
	@Override
	public boolean test(int a, int b) {

		if(a == b){
			return true;
		}
		
		return false;
	}

}
