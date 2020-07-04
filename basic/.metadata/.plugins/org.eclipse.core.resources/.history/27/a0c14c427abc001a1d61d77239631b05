package org.opentutorials.javatutorials.objects;

class Calculator {
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left+right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
}

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
	}
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) + " 입니다.");
	}
	public void substract() {
		System.out.println(left-right);
	}
	public void avg() {
		super.avg();
	}
}

public class Calculator2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(1, 2);
		c.sum(); c.avg();
		
		SubstractionableCalculator c2 = new SubstractionableCalculator(10, 20);
		c2.substract();
		c2.sum();
		c2.avg();
	}

}
