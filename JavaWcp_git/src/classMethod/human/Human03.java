package classMethod.human;

//Human03というクラス　これがオブジェクト(インスタンス)の設計図になる
public class Human03 {
	//メンバー作成
	public String name;
    public int age;
    public String profession;

    //コンストラクタ作成
    public Human03() {
    	this.name= "山田";
    	this.age=20;
    	this.profession="プログラマー";
    }
    
  //String型の戻り値を返す引数なしのメソッドを定義
  //メンバメソッド
    public String getProfile() {
        return "年齢は" + this.age + "、職業は" + this.profession;
    }

    //戻り値を返さない、String型の引数を1つとるメソッドを定義
    //メンバメソッド
    public void greet(String friend) {
        if (friend == null) { //String型の値はnullの可能性があるのでチェック
            System.out.println("挨拶する友達がわかりません！");
            return;
        }
        System.out.println(friend + "さん、こんにちは！");
    }
    
    //上の戻り値ありver 　voidを戻り値の型（String）に変える
    //メンバメソッド	
    public String greet2(String friend) {
        if (friend == null) { //String型の値はnullの可能性があるのでチェック
        	return "挨拶する友達がわかりません！";           
        }
        return friend + "さん、こんにちは！";
    }
    
}
