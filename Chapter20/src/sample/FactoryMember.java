package sample;

/**
 * Memberの実装サブクラスをインスタンス生成し、
 * アプリケーションに提供するファクトリークラス
 *
 * @author 21002S
 *
 */
public class FactoryMember {

	//ファクトリーメソッド
	public static Member createMember() {

		switch (Member.CURRENT_TYPE) {
		case Member.STUDENT:
			//Member型にアップキャストして、返します。
			return new StudentMember(100, "磯野カツオ", "2010-10-18");
		case Member.CORPORATE:
			return new CorporateMember(123, "株式会社ワールド", 5000);
			default:
				return null;
		}
	}
}
