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
/*10개의 수를 받아 그중 홀수만 더한값을 출력하는 프로그램 
  각수는 0 이상 10000이하의 정수이
  가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다
  각 테스트 케이스의 첫번째 줄에는 10개의 수가 주어진다.
  출력: #t 로 시작하고, 공백을 한 칸 둔 다음 출력
  입력: 3
		3 17 1 39 8 41 2 32 99 2
		22 8 5 123 7 2 63 7 3 46
		6 63 2 3 58 76 21 33 8 1 
		
   출력:#1 200
	   #2 208
	   #3 121*/
