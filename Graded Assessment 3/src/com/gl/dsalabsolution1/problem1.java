package com.gl.dsalabsolution1;

public class problem1 {
	public static void main(String[] args)
	{
		String expr = "(((}])";
		if (ckeckBalancingBrackets.areBracketsBalanced(expr))
			System.out.println("The entered string has balanced brackets");
		else
			System.out.println("The entered string do not contain balanced brackets");
	}
}
