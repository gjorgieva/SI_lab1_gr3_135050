class Item {
	
	int id;
	String name;
	double price;
	
	char d;
	
	public Item(int id, String name, double price, char d) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.d = d;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public char getD() {
		return d;
	}
	
	public void setD(char d) {
		this.d = d;
	}
	
	//TODO add variable.
	
	//TODO constructor
	
	//TODO setters and getters
	
	double taxReturn() {
		double ddv = 0;
		if (d == 'A') {
			ddv = 18;
		} else if (d == 'B') {
			ddv = 5;
		}
		
		if (ddv = 0) {
			return 0;
		}
		
		double percent = price / 100.0;
		double tax = ddv * percent;
		return tax / 100.0 * 15.0;
	}
}