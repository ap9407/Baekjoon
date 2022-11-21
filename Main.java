package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int answer = 0;
		sc.close();

		
		// 1.
		if(A == B && B == C) {
			answer = 10000 + (A * 1000);
		}
		// 2.
		else if(A == B || A == C) {
			answer = 1000 + (A * 100);
		}
		else if(B == C || B == A) {
			answer = 1000 + (B * 100);
		}
		else if(C == A || C == B) {
			answer = 1000 + (C * 100);
		}
		// 3.
		else {
			int max = A;
			if(max < B) max = B;
			if(max < C) max = C;
			answer = max * 100;
		}
		System.out.println(answer);
		

	}
}
