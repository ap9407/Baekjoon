package baekjoon;

public class Test {
	public static long sum(int[] a) {
		long sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 3,4,5 };
		System.out.println(sum(arr));
	}
}
