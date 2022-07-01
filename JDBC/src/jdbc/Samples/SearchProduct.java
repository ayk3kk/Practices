package jdbc.Samples;

import static jdbc.Samples.DBInfo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * JDBC練習問題「商品番号によるお寿司の検索」
 *
 * @author 21002S
 *
 */
public class SearchProduct {

	public static void main(String[] args) {

		final String MSG_NOT_FOUND = "\n該当する商品は、登録されていません。";

		try {
			//データベースへ接続します。//↓今回はこれ。調べるしかない(Driverクラスをインスタンス生成しているコード）
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			//コンソールから「商品番号」を入力します。
			int id = lib.Input.getInt("商品番号");

			//SQLを作成し、実行します。バインドパラメータを使用します。
			String sql = "SELECT * FROM product WHERE id = ?;";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);		//（何番目のパラメーターか（1から始まる）,設定する値）
			ResultSet rs = pst.executeQuery();

//			String sql = "SELECT * FROM product WHERE id =" + id + ";";
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery(sql);

			//実行結果を利用し、必要な処理を実行します。※re.next()→カーソルを次の処理にすすめるメソッド
			if(rs.next()) {
				//検索が成功した場合
				System.out.printf("%d : %s : %d\n", rs.getInt("id"), rs.getString("name"), rs.getInt("price"));
			}else {
				//検索が失敗した場合
				System.out.println(MSG_NOT_FOUND);
			}

			//データベースから切断します。
			rs.close();
			pst.close();
			conn.close();

		}catch (Exception e) {

			e.printStackTrace();
		}
	}

}
