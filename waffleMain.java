class Waffleclass {
	String flavor;
	int price;

	Waffleclass(String flvr, int pr) {
		flavor = flvr;
		price = pr;
	}

	public boolean equals(Waffleclass w) {
		return ((flavor.compareTo(w.flavor) == 0) && (Integer.compare(price, w.price) == 0));
	}

	public String toString() {
		return ("Your waffle flavour is " + flavor + " and it's price is " + price);
	}
}

public class waffleMain {
	public static void main(String args[]) {
		Waffleclass w1 = new Waffleclass("Chocochip", 50);
		Waffleclass w2 = new Waffleclass("Nutella", 60);
		Waffleclass w3 = new Waffleclass("Fruity-waffle", 40);
		Waffleclass w4 = new Waffleclass("Chocochip", 50);
		System.out.println("Displaying of object using .toString() and overrided .toString():");
		System.out.println("Object w1: " + w1);
		System.out.println("Object w2: " + w2.toString());
		System.out.println("Object w3: " + w3.toString());
		System.out.println("Object w4: " + w4);
		System.out.println("Comparsion of objects w1 and w4 using ==:-");
		if (w1 == w4) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		System.out.println("Comparison of objects w1 and w4 using .equals()");
		System.out.println(w1.equals(w4));
	}
}