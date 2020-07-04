package org.opentutorials.javatutorials.inputOutput;

import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
