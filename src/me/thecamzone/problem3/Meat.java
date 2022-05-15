package me.thecamzone.problem3;

class Meat implements Food {
	protected String type = "Meat";

	public String getType() {
		return this.type;
	}
}

class Bacon extends Meat {
	private final String NAME = "Bacon";

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

class Ham extends Meat {
	private final String NAME = "Ham";

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
