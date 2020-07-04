
public class Main {
	
	public static void main(String[] args) {
		
		int a = 50;
		int b = 50;
		
		System.out.println(MAX(a, b));

	}
	
	static int MAX(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}

}
