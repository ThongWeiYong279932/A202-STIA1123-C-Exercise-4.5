
public class Apple extends Fruits implements determinePriceFormula {
		private int number;
		private double price, totalprice, discountrate;
		public void PrintDetails() {
			System.out.println("Fruits constructor invoked");
			System.out.println("Apple is constructed");
			System.out.print("Please enter the price per apple: RM");
			this.price = scan.nextDouble();
			System.out.print("Please enter the number of apple you want: ");
			this.number = scan.nextInt();
			determinePriceFormula();
		}
		
		public void determinePriceFormula() {
			if (this.number <10 ) {
				totalprice = CalculatePrice();
			}
			else if (this.number > 10  && this.number < 100) {
				discountrate = 0.9;
				System.out.println("Since you buy more than 10 and less than 100 apples, you have 10% discount");
				totalprice = CalculatePrice(discountrate);
			}
			else {
				discountrate = 0.85;
				number = 100;
				System.out.println("Since you buy 100 or more apples, you have 15% discount and the price is always calculated using 100 apples");
				totalprice = CalculatePrice(discountrate, number);
			}
		}
		
		public double CalculatePrice() {										//Overloading with no argument
			return this.number * this.price;
		}
		
		public double CalculatePrice(double discountrate) {						//Overloading with 1 argument
			return this.number * this.price * discountrate;
		}
		
		public double CalculatePrice(double discountrate, int number) {			//Overloading with 2 argument
			return number * this.price * discountrate;
		}
		
		public String toString() {
			return ("Total Price = RM" + totalprice);
		}

}
