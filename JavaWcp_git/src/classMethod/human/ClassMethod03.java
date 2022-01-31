package classMethod.human;

import classMethod.human.Human03;

public class ClassMethod03 {

	public static void main(String[] args) {
		
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
