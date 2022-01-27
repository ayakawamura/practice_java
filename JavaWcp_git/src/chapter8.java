
public class chapter8 {
	public static void main(String[] args) {

		int number = 1;

		// while文
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}

//        do while文
		number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);

		// for文
		for (int number2 = 1; number2 <= 5; number2++) {
			System.out.println("For01 = " + number2);
		}

		// 拡張for文
		int[] array = { 1, 2, 3, 4, 5 };
		for (int num : array) {
			System.out.println("For02 = " + num);
		}

		// break文
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				// countが2の場合、for文を終了
				break;
			}
			System.out.println("Break01 = " + count);
		}

		// continue文
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				// countが2の場合、この後の処理をスキップ
				continue;
			}
			System.out.println("Continue01 = " + count);
		}

		// 確認問題
		System.out.println("確認問題");
		int a = 1;
		while (a < 5) {
			System.out.println(a * a);
			a++;
		}

		int[] array2 = { 1, 2, 3, 4 };
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		for (int num : array2) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}

		// 再起処理
		int number3 = 1;
		printNum(number3);
	}

	public static int printNum(int number3) {
		if (number3 < 50) {
			number3 *= 2;
			System.out.println("While01 = " + number3);
			// 条件にマッチしたら自分自身を再度呼び出す ifをもう一度する
			printNum(number3);
		}
		// returnで終了
		return number3;
	}
	
	

}
