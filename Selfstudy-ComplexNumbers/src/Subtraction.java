
public class Subtraction {
	SplitNumber splitNum;

	public Subtraction(SplitNumber splitNum) {
		super();
		this.splitNum = splitNum;
	}

	public String subtract() {
		int a1 = splitNum.splitNumber1()[0];
		int b1 = splitNum.splitNumber1()[1];
		int a2 = splitNum.splitNumber2()[0];
		int b2 = splitNum.splitNumber2()[1];

		int real = a1 - a2;
		int imaginary = b1 - b2;

		String complexN = "";

		if (real == 0 && imaginary == 0) {
			complexN = "0";
		} else if (real == 0 && imaginary < 0) {
			complexN = "- " + Math.abs(imaginary) + "i";
		} else if (real == 0 && imaginary > 0) {
			complexN = imaginary + "i";
		} else if ((real < 0 || real > 0) && imaginary == 0) {
			complexN = real + "";
		} else if ((real < 0 || real > 0) && imaginary < 0) {
			complexN = real + " - " + Math.abs(imaginary) + "i";
		} else {
			complexN = real + " + " + imaginary + "i";
		}

		return complexN;
	}

	@Override
	public String toString() {
		return "Subtraction " + subtract();
	}

}
