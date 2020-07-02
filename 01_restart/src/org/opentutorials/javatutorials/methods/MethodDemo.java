package org.opentutorials.javatutorials.methods;

public class MethodDemo {
	
	public static void numbering(int limit) {
		for (int i=0; i<limit; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
			numbering(i);
		}
	}

}
