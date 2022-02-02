package classMethod.human;

public class ClassMethod03 {

	public static void main(String[] args) {
		
		//yamadaという変数名のインスタンス（オブジェクト）を作る(クラス型変数ともいう)
		Human03 yamada = new Human03();
		
		System.out.println("私の名前は、" + yamada.name + "です。");
		
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");
        System.out.println(yamada.getProfile() + "です。");
        yamada.getProfile();  //これでは表示されない
        
        yamada.greet(null);
        yamada.greet("田辺");
        
        System.out.println(yamada.greet2(null));
        System.out.println(yamada.greet2("田辺"));
        		
	}
}
