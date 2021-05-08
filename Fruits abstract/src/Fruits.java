import java.util.Scanner;

public abstract class Fruits {
	Scanner scan = new Scanner(System.in);
	
	public abstract void PrintDetails();
	
	public abstract double CalculatePrice();
	
	public abstract String toString();
}
