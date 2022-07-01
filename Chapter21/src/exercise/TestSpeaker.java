package exercise;

public class TestSpeaker {

	public static void main(String[] args) {

		Talkable t = new Speaker("フグ田マスオ");

		t.talk("こんにちは。");

		// 話し手の氏名を表示します。
		System.out.println(((Speaker)t).getName());

	}

}
