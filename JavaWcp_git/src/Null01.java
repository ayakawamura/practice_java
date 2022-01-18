
public class Null01 {
	public static void main(String[] args) {
		String string1;
		// ”あいう”の文字数を出力
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());

		// ””（空文字）の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());

//		// 参照型にnullの変数を参照するとNullPointerExceptionのエラーが出る
//		string1 = null;
//		System.out.println(string1 + "の文字数：" + string1.length());

		Integer integer1 = 5; // オートボクシング
		Integer integer2 = Integer.valueOf(5); // 明示的なボクシング
		System.out.println(integer1);
		System.out.println(integer2);

		int int1 = integer1; // アンボクシング
		int int2 = integer2.intValue(); // 明示的なアンボクシング
		System.out.println(int1);
		System.out.println(int2);

		int[] array1 = new int[3]; // 配列の宣言と生成
		array1[0] = 60; // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20; // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20; // ３番目と同じ値を２番目の要素に代入
		int int3 = array1[2]; // インデックス番号「2」を指定して３番目の要素を取得

		System.out.println(int3);
		System.out.println(array1[2]);
		System.out.println(array1);

		int array2[] = null; // []は変数名の後ろでも可 intはプリミティブ型なのでnullでもOK
		System.out.println(array2);

		// 宣言と同時に初期化することもできる
		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 15, 25, 55 };
		System.out.println(array3);
		System.out.println(array3[1]);
		System.out.println(array4);
		System.out.println(array4[2]);

		// プリミティブ型で代入
		long long1 = 10000000000L;
		System.out.println(long1);

		double double1 = 20.45;
		System.out.println(double1);

		boolean boolen1 = true;
		System.out.println(boolen1);

		// ラッパークラスに代入
		Float float1 = 0.111f;
		System.out.println(float1);

		Integer int4 = 255;
		System.out.println(int4);

		Character c = 'あ';
		System.out.println(c);

		// 配列を作成
		int[] array5 = { 1, 2, 3, 4, 5 };
		System.out.println(array5[3]);
	}
}
