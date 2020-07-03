package org.opentutorials.javatutorials.Abstract;

abstract class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left; this.right = right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum(); avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum : " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("+ avg : " + (this.left + this.right) / 2);
	}
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum : " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("- avg : " + (this.left + this.right) / 2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDecoPlus cPlus = new CalculatorDecoPlus();
		cPlus.setOprands(10, 20);
		cPlus.run();
		
		CalculatorDecoMinus cMinus = new CalculatorDecoMinus();
		cMinus.setOprands(10, 20);
		cMinus.run();
	}

}
