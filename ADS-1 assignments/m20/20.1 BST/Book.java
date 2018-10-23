class Book<Key extends Comparable<Key>,Value> {
	String author;
	String name;
	Float price;

	Book(String name, String author, Float price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getName() {
		return this.name;
	}
	public Float getPrice() {
		return this.price;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setName(String name) {
		this.author = author;
	}
	public void setPrice(Float price) {
		this.author = author;
	}
	public String toString() {
		return this.getName() + ", " + this.getAuthor() + ", " + this.getPrice();
	}
	public int compareTo(Book that) {
		if (this.getName().compareTo(that.getName()) > 0) {
			return 1;
		} else if (this.getName().compareTo(that.getName()) < 0) {
			return -1;
		} else {
			if (this.getAuthor().compareTo(that.getAuthor()) > 0) {
				return 1;
			} else if (this.getAuthor().compareTo(that.getAuthor()) < 0) {
				return -1;
			} else {
				if (this.getPrice() > that.getPrice()) {
					return 1;
				} else if (this.getPrice() < that.getPrice()) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
}