import java.util.*;

class InvalidProductException extends Exception {
    InvalidProductException(String s) {
        super(s);
    }
}

public class invalidProduct {
    public static void main(String[] args) {
        String color;
        char type;
        int weight;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the color of Product:-");
            color = sc.next();
            System.out.println("Enter the Type of Product(A/B/C):-");
            type = sc.next().toUpperCase().charAt(0);
            System.out.println("Enter the Weight of Product(in grams):-");
            weight = sc.nextInt();

            checks(color, type, weight);
            sc.close();

        } catch (InputMismatchException | NumberFormatException ime) {
            System.out.println("Exception:- Input shouldn't be character or string");
        } catch (InvalidProductException ipe) {
            System.out.println(ipe);
        }
    }

    static void checks(String s, char c, double i) throws InvalidProductException {
        if (s.equals("blue") || c == 'B' || i <= 100) {
            throw new InvalidProductException("Invalid Product");
        }

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                throw new InvalidProductException("Invalid Color");
            }
        }

        if (!((c == 'A') || (c == 'B') || (c == 'C'))) {
            throw new InvalidProductException("Invalid Type");
        }

        else {
            System.out.println(
                    "Product Submitted Successfully" + "\nDetails:- " + "\nColor: " + s + "\nType: " + c + "\nWeight: "
                            + (i / 1000) + " kgs");
        }
    }
}