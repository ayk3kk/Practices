package sample;

//Member is a Versionable.  ←Memberは、バージョン管理可能なクラスの一種である。

public class Sample21_6 {

	public static void main(String[] args) {

//		Member m = new Member(200, "田中宏");
//		Versionable ver = new Member(200, "田中宏");
//		Employee ver = new Employee(123,"山田孝雄");
		Versionable ver = new Employee(123,"山田孝雄");

		if(ver instanceof Member) {
			System.out.println("Member型オブジェクトです。");
		}
		if(ver instanceof Versionable) {
			System.out.println("Versionable型オブジェクトです。");
		}
	}

}
