package jdbc.Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * お寿司の一覧表
 *
 * サーブレットP200
 * @author 21002S
 *
 */
public class All {

	public static void main(String[] args) {

		try {

			//データベースへ接続します。
			Class.forName(DBInfo.DRIVER_NAME);
			Connection conn = DriverManager.getConnection(DBInfo.URL, DBInfo.USER_NAME, DBInfo.PASSWORD);
			System.out.println("データベースに接続しました。");

			//SQL文を作成して、実行します。
			String sql = "SELECT * FROM product;";
			PreparedStatement pst = conn.prepareStatement(sql);   		//先に受け渡してコンパイル済みにする
			ResultSet rs = pst.executeQuery();
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery(sql);
			System.out.println("SELECT文を実行しました。");

			//検索結果（ResultSet）を処理して「商品一覧」を出力します。
			while(rs.next()) {
				//結果セットをシーケンシャルアクセスします。
				System.out.printf("No.%2d : %s : %3d円\n", rs.getInt("id"),  paddingName(rs.getString("name")), rs.getInt("price"));
			}

			// MySQL用JDBCドライバの「実装クラス名」を確認します。
			System.out.println(conn.getClass());
			System.out.println(pst.getClass());
			System.out.println(rs.getClass());


			//リソースを解放して、データベースから切断します。
			rs.close();
			pst.close();
			conn.close();
			System.out.println("データベースから切断しました。");

		} catch (Exception e) {
			//例外発生の「経緯」情報をコンソールに表示します。
			e.printStackTrace();
		}
	}//main()

	//商品名が全角10文字になるよう、スペースを補充して返します。
	private static String paddingName(String name) {

		String result = name;

		for(int i = 0; i < 10 - name.length(); i++) {
			result += "　";
		}

		return result;
	}

}
