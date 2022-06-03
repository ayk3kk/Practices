package sample;

/**
 * P377 練習17-8
 * @author 21002S
 *
 */
public class AdderMix {

	private int number;



	public AdderMix(int number) {
		super();
		this.number = number;
	}

	public void add () {
		this.number++;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {

		AdderMix am = new AdderMix(10);
		for(int i = 0; i < 100; i++) {
		am.add();
		}

		System.out.println("number = " + am.getNumber());
	}

}
