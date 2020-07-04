package org.opentutorials.javatutorials.objects;

class Calculator {
	int[] oprands;
	int total;
	
	public Calculator(int[] oprands) {
		this.oprands = oprands;
		for (int e: this.oprands) {
			this.total += e;
		}
	}
	
	public void sum() {
		System.out.println(this.total);
	}
	
	public void avg() {
		System.out.println(this.total/oprands.length);
	}
}

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int[] oprands) {
		super(oprands);
	}
	public void sum() {
		System.out.println("실행 결과는 " + this.total + " 입니다.");
	}
	public void avg() {
		super.avg();
	}
}

public class Calculator2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(new int[] {1, 2, 3, 4, 5,});
		c.sum(); c.avg();
	}

}
