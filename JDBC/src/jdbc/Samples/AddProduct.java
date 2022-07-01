package jdbc.Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import lib.Input;

/**
 * JDBC練習問題「新しいお寿司の追加」
 *
 * @author 21002S
 *
 */
public class AddProduct {

	public static void main(String[] args) {

		//コンソールから「商品名」「単価」を入力します。
		String name = Input.getString("商品名");
		int price = Input.getInt("単　価");

		try {
			//データベースへ接続します。
			Class.forName(DBInfo.DRIVER_NAME);
			Connection cn = DriverManager.getConnection(DBInfo.URL, DBInfo.USER_NAME, DBInfo.PASSWORD);

			//SQL文を作成し、実行します。
			String sql = "INSERT INTO product VALUES(null, ?, ?);";
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, price);
			int cnt = pst.executeUpdate();

//			String sql = "INSERT INTO product VALUES(null, 'かっぱ巻', 100);";
//			Statement st = cn.createStatement();
//			int cnt = st.executeUpdate(sql);			//cntには変更されたレコード件数を返す

			//実行結果を利用し、必要な処理を実行します。
			System.out.println(cnt + "件の商品を追加しました。");

			//リソースを解放し、データベースから切断します。
			pst.close();
			cn.close();

		}catch (Exception e) {

			e.printStackTrace();
		}
		}

}
