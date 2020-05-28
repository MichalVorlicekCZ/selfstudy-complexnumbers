import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitNumber {
	private String number1;
	private String number2;

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	public int[] splitNumber1() {
		String regexNumber = "((\\+|\\-|)[0-9]+[ ][+|-][ ][0-9]+[i])";
		Pattern paternNumber = Pattern.compile(regexNumber);
		Matcher matcherNumber1 = paternNumber.matcher(number1);
		matcherNumber1.find();
		String[] splitNumber1 = matcherNumber1.group().split(" ");

		String strSplitNum11 = splitNumber1[0];
		String strSplitNum12 = splitNumber1[1];
		String strSplitNum13 = splitNumber1[2];
		String[] splitStrSplitNum11 = strSplitNum11.split("");
		String[] splitStrSplitNum12 = strSplitNum12.split("");
		String[] splitStrSplitNum13 = strSplitNum13.split("");

		int[] arrInt1 = new int[2];

		int a1 = 0;
		if (splitStrSplitNum11[0].equals("+")) {
			String str = "";
			for (int i = 1; i < splitStrSplitNum11.length; i++) {
				str = str + splitStrSplitNum11[i];
			}
			a1 = Integer.parseInt(str);
		} else if (splitStrSplitNum11[0].equals("-")) {
			String str = "";
			for (int i = 1; i < splitStrSplitNum11.length; i++) {
				str = str + splitStrSplitNum11[i];
			}
			a1 = -Integer.parseInt(str);
		} else {
			String str = "";
			for (int i = 0; i < splitStrSplitNum11.length; i++) {
				str = str + splitStrSplitNum11[i];
			}
			a1 = Integer.parseInt(str);
		}
		arrInt1[0] = a1;

		int b1;
		if (splitStrSplitNum12[0].equals("+")) {
			String str = "";
			for (int i = 0; i < splitStrSplitNum13.length - 1; i++) {
				str = str + splitStrSplitNum13[i];
			}
			b1 = Integer.parseInt(str);
		} else if (splitStrSplitNum12[0].equals("-")) {
			String str = "";
			for (int i = 0; i < splitStrSplitNum13.length - 1; i++) {
				str = str + splitStrSplitNum13[i];
			}
			b1 = -Integer.parseInt(str);
		} else {
			String str = "";
			for (int i = 0; i < splitStrSplitNum13.length - 1; i++) {
				str = str + splitStrSplitNum13[i];
			}
			b1 = Integer.parseInt(str);
		}
		arrInt1[1] = b1;

		return arrInt1;
	}

	public int[] splitNumber2() {
		String regexNumber = "((\\+|\\-|)[0-9]+[ ][+|-][ ][0-9]+[i])";
		Pattern paternNumber = Pattern.compile(regexNumber);
		Matcher matcherNumber2 = paternNumber.matcher(number2);
		matcherNumber2.find();
		String[] splitNumber2 = matcherNumber2.group().split(" ");

		String strSplitNum21 = splitNumber2[0];
		String strSplitNum22 = splitNumber2[1];
		String strSplitNum23 = splitNumber2[2];
		String[] splitStrSplitNum21 = strSplitNum21.split("");
		String[] splitStrSplitNum22 = strSplitNum22.split("");
		String[] splitStrSplitNum23 = strSplitNum23.split("");

		int[] arrInt2 = new int[2];

		int a2;
		if (splitStrSplitNum21[0].equals("+")) {
			String str = "";
			for (int i = 1; i < splitStrSplitNum21.length; i++) {
				str = str + splitStrSplitNum21[i];
			}
			a2 = Integer.parseInt(str);
		} else if (splitStrSplitNum21[0].equals("-")) {
			String str = "";
			for (int i = 1; i < splitStrSplitNum21.length; i++) {
				str = str + splitStrSplitNum21[i];
			}
			a2 = -Integer.parseInt(str);
		} else {
			String str = "";
			for (int i = 0; i < splitStrSplitNum21.length; i++) {
				str = str + splitStrSplitNum21[i];
			}
			a2 = Integer.parseInt(str);
		}
		arrInt2[0] = a2;

		int b2;
		if (splitStrSplitNum22[0].equals("+")) {
			String str = "";
			for (int i = 0; i < splitStrSplitNum23.length - 1; i++) {
				str = str + splitStrSplitNum23[i];
			}
			b2 = Integer.parseInt(str);
		} else if (splitStrSplitNum22[0].equals("-")) {
			String str = "";
			for (int i = 0; i < splitStrSplitNum23.length - 1; i++) {
				str = str + splitStrSplitNum23[i];
			}
			b2 = -Integer.parseInt(str);
		} else {
			String str = "";
			for (int i = 0; i < splitStrSplitNum23.length - 1; i++) {
				str = str + splitStrSplitNum23[i];
			}
			b2 = Integer.parseInt(str);
		}
		arrInt2[1] = b2;

		return arrInt2;
	}

	public SplitNumber(String number1, String number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "SplitNumber " + splitNumber1().toString() + " " + splitNumber2().toString();
	}

}
