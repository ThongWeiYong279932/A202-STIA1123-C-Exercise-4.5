
public class GreenApple extends Apple {
		private double totalprice;
		private String color, taste;
		GreenApple(double price, String color, String taste){
			super(price);
			this.color = color;
			this.taste = taste;
		}
		
		public String toString() {
			return ("The color of apple is " + this.color + "\n" + "The taste is " + this.taste);
		}
}
