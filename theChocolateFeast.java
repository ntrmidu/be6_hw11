package be6_hw11;

public class theChocolateFeast {

	public static void main(String[] args) {

		int money = 15;
		int cost = 3;
		int wrapper = 2;
		
		int feast = chocoFeast(money, cost, wrapper);
		
		System.out.println(feast);
	}
		
		

	public static int chocoFeast(int money, int cost, int wrapper) {
		int chocolate = money / cost;
		int totalChocolate = 0;

		totalChocolate = totalChocolate + chocolate;

		while (chocolate >= wrapper) {
			totalChocolate = totalChocolate + chocolate / wrapper;
			chocolate = (chocolate / wrapper) + (chocolate % wrapper);
		}

		return totalChocolate;

	}

}
