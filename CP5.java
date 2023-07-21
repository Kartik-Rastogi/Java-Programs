import java.util.*;

interface Account {
	public void openAccount(Long a);

	public void closeAccount(Long a);

	public void deposit();

	public void withdrawn(Long a);

	public void transfer(Long a1, Long a2);
}

class Savings implements Account {
	ArrayList<Long> ob = new ArrayList<Long>();
	ArrayList<Double> de = new ArrayList<Double>();
	Scanner sc = new Scanner(System.in);

	public void openAccount(Long a) {
		ob.add(a);
		de.add(0.0);
		System.out.println("Savings Account number: " + a + " Successfully opened");
	}

	public void closeAccount(Long a) {
		if (ob.contains(a)) {
			ob.remove(a);
			System.out.println("Savings Account no.:" + a + " Successfully closed");
		} else
			System.out.println("No such account number exits to remove");

	}

	public void deposit() {
		double amt;
		long a = 0;

		System.out.println("Enter the account no. in which you want to deposit");
		a = sc.nextLong();
		if (ob.contains(a)) {
			System.out.println("Enter the amount you want to deposit:");
			amt = sc.nextDouble();

			double q = de.get(ob.indexOf(a)) + amt;
			de.set(ob.indexOf(a), q);

			System.out.println(amt + " rupees successfully deposited in your account,your new balance is:"
					+ de.get(ob.indexOf(a)));
		}

		else
			System.out.println("No such account exits, Enter correct account number");
	}

	public void withdrawn(Long a) {
		double amt;

		if (ob.contains(a)) {
			System.out.println("Your current balance is:" + de.get(ob.indexOf(a)));
			System.out.println("Enter the amount you want to withdraw:");
			amt = sc.nextDouble();
			if (amt > de.get(ob.indexOf(a)))
				System.out.println("Insufficient balance");
			else {
				de.set(ob.indexOf(a), de.get(ob.indexOf(a)) - amt);
				System.out.println("Your new balance is:" + de.get(ob.indexOf(a)));
			}
		} else
			System.out.println("No such account exits, Enter correct account number");
	}

	public void transfer(Long a1, Long a2) {
		System.out.println("Enter the amount that want to transfer");
		double amt = sc.nextDouble();
		if (a1 == a2) {
			System.out.println("You cannot transfer to your own account");
		}
		if (ob.contains(a1) && ob.contains(a2)) {

			if (amt > de.get(ob.indexOf(a1)))
				System.out.println("Insufficient balance");

			else {
				System.out.println("Balance of account no. " + a1 + " and account no. " + a2 + " before transfer is:"
						+ de.get(ob.indexOf(a1)) + " and " + de.get(ob.indexOf(a2)));
				de.set(ob.indexOf(a1), de.get(ob.indexOf(a1)) - amt);
				de.set(ob.indexOf(a2), de.get(ob.indexOf(a2)) + amt);
				System.out.println("Transfer successful new balance of account number: " + a1 + " is "
						+ de.get(ob.indexOf(a1)) + " and of account number " + a2 + " is:" + de.get(ob.indexOf(a2)));
			}
		}

		else
			System.out.println("No such account exits, Enter correct account number");
	}

}

class Current implements Account {
	ArrayList<Long> ob = new ArrayList<Long>();
	ArrayList<Double> de = new ArrayList<Double>();
	Scanner sc = new Scanner(System.in);

	public void openAccount(Long a) {
		ob.add(a);
		de.add(0.0);
		System.out.println("Savings Account number: " + a + " Successfully opened");
	}

	public void closeAccount(Long a) {
		if (ob.contains(a)) {
			ob.remove(a);
			System.out.println("Savings Account no.:" + a + " Successfully closed");
		} else
			System.out.println("No such account number exits to remove");

	}

	public void deposit() {
		double amt;
		long a = 0;

		System.out.println("Enter the account no. in which you want to deposit");
		a = sc.nextLong();
		if (ob.contains(a)) {
			System.out.println("Enter the amount you want to deposit:");
			amt = sc.nextDouble();

			double q = de.get(ob.indexOf(a)) + amt;
			de.set(ob.indexOf(a), q);

			System.out.println(amt + " rupees successfully deposited in your account,your new balance is:"
					+ de.get(ob.indexOf(a)));
		}

		else
			System.out.println("No such account exits, Enter correct account number");
	}

	public void withdrawn(Long a) {
		double amt;

		if (ob.contains(a)) {
			System.out.println("Your current balance is:" + de.get(ob.indexOf(a)));
			System.out.println("Enter the amount you want to withdraw:");
			amt = sc.nextDouble();
			if (amt > de.get(ob.indexOf(a)))
				System.out.println("Insufficient balance");
			else {
				de.set(ob.indexOf(a), de.get(ob.indexOf(a)) - amt);
				System.out.println("Your new balance is:" + de.get(ob.indexOf(a)));
			}
		} else
			System.out.println("No such account exits, Enter correct account number");
	}

	public void transfer(Long a1, Long a2) {
		System.out.println("Enter the amount that want to transfer");
		double amt = sc.nextDouble();

		System.out.println("yes");
		if (a1 == a2) {
			System.out.println("You cannot transfer to your own account");
		}

		else if (ob.contains(a1) && ob.contains(a2)) {
			System.out.println("fg");
			if (amt > de.get(ob.indexOf(a1)))
				System.out.println("Insufficient balance");
			else {
				System.out.println("Balance of account no. " + a1 + " and account no. " + a2 + " before transfer is:"
						+ de.get(ob.indexOf(a1)) + " and " + de.get(ob.indexOf(a2)));
				de.set(ob.indexOf(a1), de.get(ob.indexOf(a1)) - amt);
				de.set(ob.indexOf(a2), de.get(ob.indexOf(a2)) + amt);
				System.out.println("Transfer successful new balance of account number: " + a1 + " is "
						+ de.get(ob.indexOf(a1)) + " and of account number " + a2 + " is:" + de.get(ob.indexOf(a2)));
			}
		} else
			System.out.println("No such account exits, Enter correct account number");

	}

}

public class CP5 {
	public static void main(String args[]) {
		Savings s = new Savings();
		Current c = new Current();
		int ch, x, x1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Enter 1 for savings account\nEnter 2 for Current account\nEnter 0 to exit\nEnter your choice:");
			ch = sc.nextInt();

			switch (ch) {
				case 0:
					System.exit(0);
					break;

				case 1:
					do {
						System.out.println(
								"Enter 1 to open new account\nEnter 2 to close an account\nEnter 3 to deposit money\nEnter 4 to withdraw money\nEnter 5 to transfer money\nEnter 0 to exit\n Enter your choice");
						x = sc.nextInt();
						if (x == 1) {
							System.out.println("Enter Account No:- ");
							Long a = sc.nextLong();
							if (Long.toString(a).length() < 16 || Long.toString(a).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							s.openAccount(a);
						} else if (x == 2) {
							System.out.println("Enter account no");
							Long a = sc.nextLong();
							if (Long.toString(a).length() < 16 || Long.toString(a).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							s.closeAccount(a);
						} else if (x == 3) {
							s.deposit();
						} else if (x == 4) {
							System.out.println("Enter account no");
							Long a = sc.nextLong();
							if (Long.toString(a).length() < 16 || Long.toString(a).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							s.withdrawn(a);
						} else if (x == 5) {
							System.out.println("Enter account no from which you want to transfer:");
							Long a1 = sc.nextLong();
							System.out.println("Enter account no to which you want to transfer:");
							Long a2 = sc.nextLong();
							if (Long.toString(a1).length() < 16 || Long.toString(a1).length() > 16
									|| Long.toString(a2).length() < 16 || Long.toString(a2).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							s.transfer(a1, a2);

						}
					} while (x != 0);
					break;

				case 2:
					do {
						System.out.println(
								"Enter 1 to open new account\nEnter 2 to close an account\nEnter 3 to deposit money\nEnter 4 to withdraw money\nEnter 5 to transfer money\nEnter 0 to exit\n Enter your choice");
						x1 = sc.nextInt();
						if (x1 == 1) {
							System.out.println("Enter account no");
							Long a = sc.nextLong();
							if (Long.toString(a).length() < 16 || Long.toString(a).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							c.openAccount(a);
						} else if (x1 == 2) {
							System.out.println("Enter account no");
							Long a = sc.nextLong();
							if (Long.toString(a).length() < 16 || Long.toString(a).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							c.closeAccount(a);
						} else if (x1 == 3) {
							c.deposit();
						} else if (x1 == 4) {
							System.out.println("Enter account no");
							Long a = sc.nextLong();
							if (Long.toString(a).length() < 16 || Long.toString(a).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							c.withdrawn(a);
						} else if (x1 == 5) {
							System.out.println("Enter account no from which you want to transfer:");
							Long a1 = sc.nextLong();
							System.out.println("Enter account no to which you want to transfer:");
							Long a2 = sc.nextLong();
							if (Long.toString(a1).length() < 16 || Long.toString(a1).length() > 16
									|| Long.toString(a2).length() < 16 || Long.toString(a2).length() > 16) {
								System.out.println("Account No is less than 16 digit");
							}
							c.transfer(a1, a2);
						}
					} while (x1 != 0);
					break;
			}
		} while (ch != 0);
		sc.close();
	}
}