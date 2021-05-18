
public class Banana extends Fruits{
	private int number;											//Variables privatized to prevent usage and access from other class.
	private double weight,price, totalprice, discountrate;
	Banana(double price, double weight){						//Constructor with 2 arguments
			this.price = price;
			this.weight = weight;
			System.out.println("Fruits constructor invoked");
			System.out.println("Banana is constructed");
			System.out.println("The average weight of banana is " + this.weight + "kg");
			System.out.println("The price per kg of banana is RM" + this.price);
			System.out.print("Please enter the number of banana you want: ");
			this.number = scan.nextInt();
			determinePriceFormula();
	}
		
		public void determinePriceFormula() {						//Overriding method
			if (this.number*this.weight < 10 ) {
				totalprice = CalculatePrice();
			}
			else if (this.number*this.weight > 10  && this.number*this.weight < 100) {
				price = 1.25;
				System.out.println("Since you buy more than 10kg and less than 100kg of bananas, price per kg of banana is calculated in RM1.25");
				totalprice = CalculatePrice(price);
			}
			else {
				BananaDiscount b = new BananaDiscount();
				discountrate = b.determineDiscountRate();
				weight = 100;
				System.out.println("Since you buy bananas of 100kg or more, you have 15% discount and the price is always calculated using 100kg of bananas");
				totalprice = CalculatePrice(discountrate, weight);
			}
		}
		
		public double CalculatePrice() {											//Overloading with no argument
			return this.number * this.weight * this.price;
		}
		
		public double CalculatePrice(double price) {							//Overloading with 1 argument
			return this.number * this.weight * price;
		}
		
		public double CalculatePrice(double discountrate, double weight) {			//Overloading with 2 argument
			return weight * this.price * discountrate;
		}
		
		public String toString() {
			return ("Total Price = RM" + totalprice);
		}
}
