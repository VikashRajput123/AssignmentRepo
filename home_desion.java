package hello;
//Question number 3:  -
public class home_desion {
	public static void main(String[] args) {
		int num;
		num = 14;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == 1 || i == 2 && j > num / 2 && j < ((num / 2))

						|| j == 2 && i < num / 2 || j == 3 && i < num / 2 - 1 || j == 4 && i < num / 2 - 2
						|| j == 5 && i < num / 2 - 3 || j == 6 && i < num / 2 - 4 || j == 7 && i < num / 2 - 5
						|| j == 7 && i < num / 2 - 6 || j == num - 1 && i <= num / 2 || j == num - 2 && i < num / 2 
						|| j == num - 3 && i < num / 2 - 1 || j == num - 4 && i < num / 2 - 2
						|| j == num - 5 && i < num / 2 - 3 || j == num - 6 && i < num / 2 - 4 
								||j==num-7&&i<num/2-5|| i == num || j == num)

				{
					System.out.print("*");
				

				} else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}
		

	}
}
