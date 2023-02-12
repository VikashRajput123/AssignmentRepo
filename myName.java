package hello;
//Question number 5: -
class print_myName {
	public void print_name(int num) {
		System.out.println("V");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 && j == 0 && j == num - 1 || j == 0 && i <= (num - 1) / 2
						|| j == num - 1 && i <= (num - 1) / 2 || i == (num - 1) / 2 + 1 && j == 1
						|| i == (num - 1) / 2 + 2 && j == 2 || i == (num - 1) / 2 + 3 && j == 3
						|| i == (num - 1) / 2 + 1 && j == (num - 2) || i == (num - 1) / 2 + 2 && j == (num - 2)
						|| i == (num - 1) / 2 + 3 && j == (num - 3) || i == num - 1 && j == (num - 1) / 2) {
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
		System.out.println("A");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 && j > 0 && j < ((num - 1) / 2) || j == 0 && i > 0
						|| i == ((num - 1) / 2) && j <= ((num - 1) / 2) || j == (num - 1) / 2 && i > 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
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
		System.out.println("H");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (		j == 0 
						
						|| i == (num - 1)/2
						|| j == (num - 1)) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	}


public class myName {
	public static void main(String[] args) {
		print_myName pm = new print_myName();
		pm.print_name(10);
	}

}
