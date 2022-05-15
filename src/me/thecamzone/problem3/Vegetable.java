package me.thecamzone.problem3;

class Vegetable implements Food {
	protected String type = "Vegetable";

	public String getType() {
		return this.type;
	}
}

class Corn extends Vegetable {
	private final String NAME = "Corn";

	private int amountMade = 0;

	private int consumed = 0;

	public String getName() {
		return NAME;
	}

	public void setAmountMade(int amountMade) {
		this.amountMade = amountMade;
	}

	public int getAmountMade() {
		return this.amountMade;
	}

	public int getAmountConsumed() {
		return this.consumed;
	}

	public void setAmountConsumed(int consumed) {
		this.consumed = consumed;
	}

	public int getAmountLeftOver() {
		return this.amountMade - this.consumed;
	}
}

class Cucumber extends Vegetable {
	private final String NAME = "Cucumber";

	private int amountMade = 0;

	private int consumed = 0;

	public String getName() {
		return NAME;
	}

	public void setAmountMade(int amountMade) {
		this.amountMade = amountMade;
	}

	public int getAmountMade() {
		return this.amountMade;
	}

	public int getAmountConsumed() {
		return this.consumed;
	}

	public void setAmountConsumed(int consumed) {
		this.consumed = consumed;
	}

	public int getAmountLeftOver() {
		return this.amountMade - this.consumed;
	}
}
