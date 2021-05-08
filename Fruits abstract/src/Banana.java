
public class Banana extends Fruits implements determinePriceFormula{
	private int number;
	private double weight,price, totalprice, discountrate;
	public void PrintDetails() {
		System.out.println("Fruits constructor invoked");
		System.out.println("Banana is constructed");
		System.out.print("Please enter the average weight of banana(in kg): ");
		this.weight = scan.nextDouble();
		System.out.print("Please enter the price per kg of banana: RM");
		this.price = scan.nextDouble();
		System.out.print("Please enter the number of banana you want: ");
		this.number = scan.nextInt();
		determinePriceFormula();
	}
	
	public void determinePriceFormula() {						//Overriding method
		if (this.number*this.weight < 10 ) {
			totalprice = CalculatePrice();
		}
		else if (this.number*this.weight > 10  && this.number*this.weight < 100) {
			discountrate = 0.85;
			System.out.println("Since you buy more than 10kg and less than 100kg of bananas, you have 15% discount");
			totalprice = CalculatePrice(discountrate);
		}
		else {
			discountrate = 0.80;
			weight = 100;
			System.out.println("Since you buy bananas of 100kg or more, you have 20% discount and the price is always calculated using 100kg of bananas");
			totalprice = CalculatePrice(discountrate, weight);
		}
	}
	
	public double CalculatePrice() {											//Overloading with no argument
		return this.number * this.weight * this.price;
	}
	
	public double CalculatePrice(double discountrate) {							//Overloading with 1 argument
		return this.number * this.weight * this.price * discountrate;
	}
	
	public double CalculatePrice(double discountrate, double weight) {			//Overloading with 2 argument
		return weight * this.price * discountrate;
	}
	
	public String toString() {
		return ("Total Price = RM" + totalprice);
	}
}
