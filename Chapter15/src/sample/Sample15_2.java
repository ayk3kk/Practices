package sample;

import lib.Input;

/**
 * クラスMyToolsをテストする、ドライバクラス
 *
 * @author AKAKE
 *
 */


public class Sample15_2 {

	public static void main(String[] args) {

		double a = Input.getDouble("体重 kg");
		double b = Input.getDouble("身長 m");

		double mybmi = MyTools.bmi(a, b);
		System.out.println("BMI = " + mybmi);
	}

}
