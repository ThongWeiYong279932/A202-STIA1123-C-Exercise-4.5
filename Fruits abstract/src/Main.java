
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits a = new Apple(1.0);
		
		System.out.println();
		
		Fruits b = new RedApple(1.2, "Red");
		System.out.println(b);
		
		System.out.println();
		
		Fruits c = new GreenApple(0.9, "Green", "Sour");
		System.out.println(c);
		
		System.out.println();
		
		Fruits d = new Banana(1.5, 0.75);
		System.out.println(d);
		
		System.out.println();
		
		Fruits e = new Grape(1.75, 0.35);
		System.out.println(e);
	}

}
