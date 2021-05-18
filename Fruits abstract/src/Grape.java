
public class Grape extends Fruits{
	private int number;											//Variables privatized to prevent usage and access from other class.
	private double weight,price, totalprice, discountrate;
	Grape(double price, double weight){							//Constructor with 2 arguments
			this.price = price;
			this.weight = weight;
			System.out.println("Fruits constructor invoked");
			System.out.println("Grape is constructed");
			System.out.println("The average weight of grapes is " + this.weight + "kg");
			System.out.println("The price per kg of grapes is RM" + this.price);
			System.out.print("Please enter the number of grapes you want: ");
			this.number = scan.nextInt();
			determinePriceFormula();
	}
		
		public void determinePriceFormula() {						//Overriding method
			if (this.number*this.weight < 10 ) {
				totalprice = CalculatePrice();
			}
			else if (this.number*this.weight > 10  && this.number*this.weight < 100) {
				price = 1.50;
				System.out.println("Since you buy more than 10kg and less than 100kg of grapes, the price per kg of grapes is calculated as RM1.50");
				totalprice = CalculatePrice(price);
			}
			else {
				GrapeDiscount c = new GrapeDiscount();
				discountrate = c.determineDiscountRate();
				weight = 100;
				System.out.println("Since you buy grapes of 100kg or more, you have 20% discount and the price is always calculated using 100kg of grapes");
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
