package jdbc.Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lib.Input;

/**
 * 指定されたキーワードを商品名に含むお寿司の検索
 *
 * @author 21002S
 *
 */
public class SearchProductByName {

	public static void main(String[] args) {

		final String MSG_NOT_FOUND = "該当する商品は登録されていません。";

		//検索成功フラグ(失敗フラグ-true;でもOK）
		boolean flagSuccess = false;

		//検索キーワードを入力します。
		String keyword = Input.getString("検索キーワード");

		try {
			//データベースへ接続します。
			Class.forName(DBInfo.DRIVER_NAME);
			Connection cn = DriverManager.getConnection(DBInfo.URL, DBInfo.USER_NAME, DBInfo.PASSWORD);

			//SQL文を作成し、実行します。
			String sql = "SELECT * FROM product WHERE name like ?;";
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, "%" + keyword + "%");					//こちら側に％付けるｓ
			ResultSet rs = pst.executeQuery();

//			String sql = "SELECT * FROM product WHERE name = '" + keyword + "';";
//			String sql = "SELECT * FROM product WHERE name like '%" + keyword + "%';";
//			Statement st = cn.createStatement();
//			ResultSet rs = st.executeQuery(sql);  //SELECT文の実行はex～Query→データベースサーバーに送る

			//実行結果を利用し、必要な処理を実行します。
			System.out.println("■検索結果");
			while(rs.next()) {
				System.out.printf("%d : %s : %d\n", rs.getInt("id"), rs.getString("name"), rs.getInt("price"));
				flagSuccess = true; //検索成功！
			}

			if(!flagSuccess) {						//(flagSuccess == false)でもいいが、実務的には!～で書くことが多い
				System.out.println(MSG_NOT_FOUND);
			}

			//データベースから切断します。
			cn.close();

		}catch (Exception e) {

			e.printStackTrace();
		}
	}

}
