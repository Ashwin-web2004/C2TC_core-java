package day2;

public class NestedForLoop {

	public static void main(String[] args) {
		int start=1;
		int end=10;

		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();
}
	}

}
