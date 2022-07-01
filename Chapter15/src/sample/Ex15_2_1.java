package sample;

import lib.Input;

/**
 * MyTools#stdWeight()をテストするためのドライバクラス
 *
 * @author 21002S
 *
 */
public class Ex15_2_1 {

	public static void main(String[] args) {

		//コンソールから「身長」を入力します。
		double height = Input.getDouble("身長cm");

		//[標準体重」を表示します。
		MyTools.stdWeight(height);
	}

}
