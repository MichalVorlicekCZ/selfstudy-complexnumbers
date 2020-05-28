import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Zadejte prvni komplexni cislo (zadavejte ve tvaru 'a + bi' samozrejeme pred 'a' a pred 'b' muzes umistit znamenko minus):");
			System.out.println("Zadejte prvni komplexni cislo:");
			String number1 = sc.nextLine();

			System.out.println("Zadejte druhe komplexni cislo:");
			String number2 = sc.nextLine();

			SplitNumber splitNum = new SplitNumber(number1, number2);

			System.out.println("Vyberte si pocetni operaci:");
			System.out.println("Scitani");
			System.out.println("Odecitani");
			System.out.println("Nasobeni");
			System.out.println("Deleni");

			String operation = sc.nextLine();

			switch (operation) {
			case "scitani":
				Summation sum = new Summation(splitNum);
				System.out.println(sum.toString());
				break;

			case "odecitani":
				Subtraction subtrac = new Subtraction(splitNum);
				System.out.println(subtrac.toString());
				break;

			case "nasobeni":
				Multiplication multi = new Multiplication(splitNum);
				System.out.println(multi.toString());
				break;

			case "deleni":
				Division divis = new Division(splitNum);
				System.out.println(divis.toString());
				break;
				
			default:
				break;
			}

			sc.close();
			
		} catch (PatternSyntaxException e) {
			System.out.println(e.getMessage());
			System.out.println("Spatny format zadni");
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
			System.out.println("Spatna hodnota zadani");
		}

	}

}
