package sample;

/**
 * 練習問題⑨「月の和名検索」
 * オブジェクト指向改修版の検索結果
 *
 * @author 21002S
 *
 */
public class ResultSet {

	private String nameJpn;		//月の和名
	private String nameEng;		//月の英語名
	private int days;			//月の日数


	public ResultSet(String nameJpn, String nameEng, int days) {
		super();
		this.nameJpn = nameJpn;
		this.nameEng = nameEng;
		this.days = days;
	}


	public String getNameJpn() {
		return nameJpn;
	}


	public String getNameEng() {
		return nameEng;
	}


	public int getDays() {
		return days;
	}


}
