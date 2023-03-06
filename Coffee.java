package ProjectCoffee;

public class Coffee {
	private String brand;		// declare brand & price
	private Double price;
	public Coffee(String brand, Double price) {			//create constructor
		super();							//create super()
		this.brand = brand;
		this.price = price;
	}

	public Coffee() {
		super();
		
	}

	public String getBrand() {  //creating getter and setter method
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override					//using @Override for elements are override declare in superclass
	public String toString() {
		return "Coffee [brand=" + brand + ", price=" + price + "]";
	   }

}
