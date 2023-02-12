package hello;



//Question number 4: -
class pwskill {
	public void call_P(int num) {
		System.out.println("P");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || j == 0 || i == ((num / 2) - 1) || j == num - 1 && i <= (num / 2) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("W");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 && j == 0 && j == num - 1 || j == 0 || j == 1 && i == num - 2 || j == 2 && i == num - 3
						|| j == 3 && i == num - 4 || j == 4 && i == num - 3 || j == 5 && i == num - 2 || j == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("S");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || j == 0 && i < ((num - 1) / 2) || i == ((num / 2)) || j == num - 1 && i > (num / 2) - 1
						|| i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("K");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 && j == ((num - 1) / 2 + 1) || j == 0 || i == 1 && j == ((num - 1) / 2 + 1) - 1
						|| i == num - 2 && j == ((num - 1) / 2 + 1) - 1 || i == (num - 1) / 2 && j == 1
						|| i == (num - 1) / 2 + 1 && j == 2 || i == (num - 1) / 2 - 1 && j == 2

						|| j == (num - 1) / 2 && i == 0 && i == num - 1 || i == num - 1 && j == ((num - 1) / 2 + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("I");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || j == (num - 1) / 2 || i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("L");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j == 0 || i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("L");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j == 0 || i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("S");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || j == 0 && i < ((num - 1) / 2) || i == ((num / 2)) || j == num - 1 && i > (num / 2) - 1
						|| i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}

public class pwSkill_pattern {
	public static void main(String[] args) {
		pwskill ps = new pwskill();
		ps.call_P(7);
	}

}
