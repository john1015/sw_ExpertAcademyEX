package sw;

import java.util.Scanner;

class holjjak {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();

		for (int i = 1; i <= A; i++) {
			int sum = 0;
			for (int t = 0; t < 10; t++) {
				int data = scanner.nextInt();
				if (data % 2 == 1)
					sum += data;
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
