public class financialCalculator {
    double principalAmount, rate;
    int time;

    public double simpleInterest() {
        return (principalAmount * rate * time) / 100;
    }

    public double compoundInterest() {
        return (principalAmount * (Math.pow((1 + rate / 100), time)));
    }

    public double finalInvestment() {
        return (principalAmount * (Math.pow((1 + rate), time)));
    }

    public static void main(String args[]) {
        financialCalculator fc = new financialCalculator();
        fc.principalAmount = Double.parseDouble(args[0]);
        fc.rate = Double.parseDouble(args[1]);
        fc.time = Integer.parseInt(args[2]);
        System.out.println("Simple Interest:- " + fc.simpleInterest());
        System.out.println("Compound Interest:- " + fc.compoundInterest());
        System.out.println("Final Investment:- " + fc.finalInvestment());
    }
}
