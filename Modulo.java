import java.util.Scanner;

class Modulo {
	public static void main(String args[]) {
		try (Scanner s = new Scanner(System.in)) {
			int t = s.nextInt();
			while (t-- > 0) {
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println(a % b);
			}
		}
	}
}
