package week4;

public class labeledLoops {

	public static void main(String[] args) {
		// loops();
		//normalBreak();
		//labeledBreak();
		//normalContinue();
		labelledContinue();
	}

	public static void loops() {
		// tab achieved by inserting “\t”
		// System.out.println(“\tj==”+j)
		for (int i = 1; i < 4; i++) {
			System.out.println("i == " + i);
			for (int j = 1; j < 6; j++) {
				System.out.println("\tj == " + j);
			}
		}
	}

	public static void normalBreak() {
		for (int i = 1; i < 4; i++) {
			System.out.println("i == " + i);
			for (int j = 1; j < 6; j++) {

				System.out.println("\tj == " + j);
				if (j == 2) {
					break;
				}
			}
		}
	}

	public static void labeledBreak() {
		outerLoop: for (int i = 1; i < 4; i++) {
			System.out.println("i == " + i);
			for (int j = 1; j < 6; j++) {

				System.out.println("\tj == " + j);
				if (j == 2) {
					break;
				}
			} break outerLoop ;
		}
	}

	//(note: “j == 3” is missing):
	public static void normalContinue() {
		for (int i = 1; i < 4; i++) {
			System.out.println("i == " + i);
			for (int j = 1; j < 6; j++) {
				if(j==3) {
					continue;
				}
				System.out.println("\tj == " + j);
			}
		}
	}

	public static void labelledContinue() {
		for (int i = 1; i < 4; i++) {
			System.out.println("i == " + i);
			innerLoop: for (int j = 1; j < 6; j++) {
				if(j>2) {
					continue innerLoop;
				}
				System.out.println("\tj == " + j);
			}
		}
	}

}
