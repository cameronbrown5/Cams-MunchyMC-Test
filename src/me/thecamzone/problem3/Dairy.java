package me.thecamzone.problem3;

class Dairy implements Food {
	protected String type = "Dairy";

	public String getType() {
		return this.type;
	}
}

class Milk extends Dairy {
	private final String NAME = "Milk";

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

class Cheese extends Dairy {
	private final String NAME = "Cheese";

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
