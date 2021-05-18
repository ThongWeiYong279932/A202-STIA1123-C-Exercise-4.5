
public class Apple extends Fruits{
		private int number;									//Variables privatized to prevent usage and access from other class.
		private double price, totalprice, discountrate;
		Apple (double price){								//Constructor with 1 argument
			this.price = price;
				System.out.println("Fruits constructor invoked");
				System.out.println("Apple is constructed");
				System.out.println("The price per apple is RM" + this.price);
				System.out.print("Please enter the number of apple you want: ");
				this.number = scan.nextInt();
				determinePriceFormula();
		}
		
			public void determinePriceFormula() {						//Overriding method
				if (this.number <10 ) {
					totalprice = CalculatePrice();
					System.out.println("Total Price = " + totalprice);
				}
				else if (this.number > 10  && this.number < 100) {
					price = 0.85;
					System.out.println("Since you buy more than 10 and less than 100 apples, the price will per apple will be RM0.85");
					totalprice = CalculatePrice(price);
					System.out.println("Total Price = " + totalprice);
				}
				else {
					AppleDiscount a = new AppleDiscount();
					discountrate = a.determineDiscountRate();
					number = 100;
					System.out.println("Since you buy 100 or more apples, you have 10% discount and the price is always calculated using 100 apples");
					totalprice = CalculatePrice(discountrate, number);
					System.out.println("Total Price = " + totalprice);
				}
			}
			
			public double CalculatePrice() {										//Overloading with no argument
				return this.number * this.price;
			}
			
			public double CalculatePrice(double price) {							//Overloading with 1 argument
				return this.number * price;
			}
			
			public double CalculatePrice(double discountrate, int number) {			//Overloading with 2 argument
				return number * this.price * discountrate;
			}
}
