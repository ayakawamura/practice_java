
public class Variable01 {
	public static void main(String[] args) {
		int num1;
		String str1;
		num1 = 10;
		str1 = "Hello World!";
		System.out.println(num1);
		System.out.println(str1);

		num1 = 20;
		System.out.println(num1);

		int num2 = 30;
		System.out.println(num2);

		// 定数の宣言
		final int MIN_NUMBER = 10;
		System.out.println(MIN_NUMBER);

		// 再代入しようとするとエラー
		// MIN_NUMBER = 20;
	}
}
