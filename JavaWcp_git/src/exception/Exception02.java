package exception;

public class Exception02 {
	
	public static void main(String[] args) {
		//tryブロック（例外が発生する可能性のある処理）
        try {
            System.out.println("100 ÷ 0 は？");
            int result = 100 / 0;
            System.out.println("計算結果" + result);
        } catch (ArithmeticException e) {
            System.out.println("例外が発生"); //例外が発生した場合の処理
        } finally {
            System.out.println("プログラム終了"); //例外が発生してもしなくても実行する
        }
    }

}
