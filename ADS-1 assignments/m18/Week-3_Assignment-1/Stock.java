class Stock {
	String name;
	Float value;
	Stock(String name, Float value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return this.name;
	}
	public Float getValue() {
		return this.value;
	}
	public int compareTo(Stock that) {
		if (this.getValue() > that.getValue()) {
			return 1;
		} else if (this.getValue() < that.getValue()) {
			return -1;
		} else if (this.getName().compareTo(that.getName()) > 0) {
			return 1;
		} else if (this.getName().compareTo(that.getName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	public String toString() {
		return this.getName() + " " + this.getValue();
	}
}