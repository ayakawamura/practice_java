package classMethod.human;
//パッケージ宣言

import classMethod.human.Human02;
//インポート文　Human02の決まりを参照する

public class ClassMethod02 {
	public static void main(String[] args) {

		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human02 sato = new Human02("佐藤", 30);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
