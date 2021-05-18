
public class RedApple extends Apple{
	private double totalprice;
	private String color;
	RedApple(double price, String color){
		super(price);
		this.color = color;
	}
	
	
	public String toString() {
		return ("The color of apple is " + this.color);
	}
}
