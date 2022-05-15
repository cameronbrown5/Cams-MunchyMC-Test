package me.thecamzone.problem3;

public class Problem3 {
	
	private final Corn CORN = new Corn();

	private final Cucumber CUCUMBER = new Cucumber();

	private final Milk MILK = new Milk();

	private final Cheese CHEESE = new Cheese();

	private final Bacon BACON = new Bacon();

	private final Ham HAM = new Ham();

	public static void main(String[] args) {

		Problem3 problem3 = new Problem3();
		
		// Input values for amount of food made
		// Input order: Corn, Cucumber, Milk, Cheese, Bacon, Ham
		problem3.setAmountMade(20, 23, 19, 15, 19, 26);
		
		// Input values for amount of food consumed
		// Input order: Corn, Cucumber, Milk, Cheese, Bacon, Ham
		problem3.setAmountConsumed(10, 13, 15, 12, 16, 20);
		
		// Get amount left over (difference)
		problem3.getAmountsLeftOver();
		
		// Generate report for easy reading at the end of the day.
		problem3.generateReport();
	}

	public void setAmountMade(int cornAmount, int cucumberAmount, int milkAmount, int cheeseAmount, int baconAmount,
			int hamAmount) {
		this.CORN.setAmountMade(cornAmount);
		this.CUCUMBER.setAmountMade(cucumberAmount);
		this.MILK.setAmountMade(milkAmount);
		this.CHEESE.setAmountMade(cheeseAmount);
		this.BACON.setAmountMade(baconAmount);
		this.HAM.setAmountMade(hamAmount);
		System.out.println("Set corn amount to: " + cornAmount);
		System.out.println("Set cucumber amount to: " + cucumberAmount);
		System.out.println("Set milk amount to: " + milkAmount);
		System.out.println("Set cheese amount to: " + cheeseAmount);
		System.out.println("Set bacon amount to: " + baconAmount);
		System.out.println("Set ham amount to: " + hamAmount);
		System.out.println();
	}

	public void setAmountConsumed(int cornAmount, int cucumberAmount, int milkAmount, int cheeseAmount, int baconAmount,
			int hamAmount) {
		this.CORN.setAmountConsumed(cornAmount);
		this.CUCUMBER.setAmountConsumed(cucumberAmount);
		this.MILK.setAmountConsumed(milkAmount);
		this.CHEESE.setAmountConsumed(cheeseAmount);
		this.BACON.setAmountConsumed(baconAmount);
		this.HAM.setAmountConsumed(hamAmount);
		System.out.println("Set corn consumed to: " + cornAmount);
		System.out.println("Set cucumber consumed to: " + cucumberAmount);
		System.out.println("Set milk consumed to: " + milkAmount);
		System.out.println("Set cheese consumed to: " + cheeseAmount);
		System.out.println("Set bacon consumed to: " + baconAmount);
		System.out.println("Set ham consumed to: " + hamAmount);
		System.out.println();
	}

	public void getAmountsLeftOver() {
		System.out.println("Corn left over: " + this.CORN.getAmountLeftOver());
		System.out.println("Cucumber left over: " + this.CUCUMBER.getAmountLeftOver());
		System.out.println("Milk left over: " + this.MILK.getAmountLeftOver());
		System.out.println("Cheese left over: " + this.CHEESE.getAmountLeftOver());
		System.out.println("Bacon left over: " + this.BACON.getAmountLeftOver());
		System.out.println("Ham left over: " + this.HAM.getAmountLeftOver());
		System.out.println();
	}

	public void generateReport() {
		System.out.println(String.valueOf(this.CORN.getName()) + ":");
		System.out.println("Type: " + this.CORN.getType());
		System.out.println(String.valueOf(this.CORN.getName()) + " produced: " + this.CORN.getAmountMade());
		System.out.println(String.valueOf(this.CORN.getName()) + " consumed: " + this.CORN.getAmountConsumed());
		System.out.println(String.valueOf(this.CORN.getName()) + " left over: " + this.CORN.getAmountLeftOver());
		System.out.println();
		System.out.println(String.valueOf(this.CUCUMBER.getName()) + ":");
		System.out.println("Type: " + this.CUCUMBER.getType());
		System.out.println(String.valueOf(this.CUCUMBER.getName()) + " produced: " + this.CUCUMBER.getAmountMade());
		System.out.println(String.valueOf(this.CUCUMBER.getName()) + " consumed: " + this.CUCUMBER.getAmountConsumed());
		System.out
				.println(String.valueOf(this.CUCUMBER.getName()) + " left over: " + this.CUCUMBER.getAmountLeftOver());
		System.out.println();
		System.out.println(String.valueOf(this.MILK.getName()) + ":");
		System.out.println("Type: " + this.MILK.getType());
		System.out.println(String.valueOf(this.MILK.getName()) + " produced: " + this.MILK.getAmountMade());
		System.out.println(String.valueOf(this.MILK.getName()) + " consumed: " + this.MILK.getAmountConsumed());
		System.out.println(String.valueOf(this.MILK.getName()) + " left over: " + this.MILK.getAmountLeftOver());
		System.out.println();
		System.out.println(String.valueOf(this.CHEESE.getName()) + ":");
		System.out.println("Type: " + this.CHEESE.getType());
		System.out.println(String.valueOf(this.CHEESE.getName()) + " produced: " + this.CHEESE.getAmountMade());
		System.out.println(String.valueOf(this.CHEESE.getName()) + " consumed: " + this.CHEESE.getAmountConsumed());
		System.out.println(String.valueOf(this.CHEESE.getName()) + " left over: " + this.CHEESE.getAmountLeftOver());
		System.out.println();
		System.out.println(String.valueOf(this.BACON.getName()) + ":");
		System.out.println("Type: " + this.BACON.getType());
		System.out.println(String.valueOf(this.BACON.getName()) + " produced: " + this.BACON.getAmountMade());
		System.out.println(String.valueOf(this.BACON.getName()) + " consumed: " + this.BACON.getAmountConsumed());
		System.out.println(String.valueOf(this.BACON.getName()) + " left over: " + this.BACON.getAmountLeftOver());
		System.out.println();
		System.out.println(String.valueOf(this.HAM.getName()) + ":");
		System.out.println("Type: " + this.HAM.getType());
		System.out.println(String.valueOf(this.HAM.getName()) + " produced: " + this.HAM.getAmountMade());
		System.out.println(String.valueOf(this.HAM.getName()) + " consumed: " + this.HAM.getAmountConsumed());
		System.out.println(String.valueOf(this.HAM.getName()) + " left over: " + this.HAM.getAmountLeftOver());
		System.out.println();
	}
}
