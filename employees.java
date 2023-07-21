public class employees {

    public void payGenerator(int hoursWork, float basePay) {
        double totalPays;
        if (hoursWork > 60)
            System.err.println("An employee should not work for more than 60 hours!");
        else if (basePay < 8)
            System.err.println("Base pay is less than minimum pay!");
        else if (hoursWork <= 40) {
            totalPays = basePay * hoursWork;
            System.out.println("Total Wages Of Employee:- " + totalPays);
        } else if (hoursWork > 40 && hoursWork <= 60) {
            int extraHours = hoursWork - 40;
            totalPays = (basePay * 40) + (basePay * extraHours * 1.5);
            System.out.println("Total Wages Of Employee:- " + totalPays);
        }
    }

    public static void main(String args[]) {
        employees obj = new employees();
        employees obj1 = new employees();
        employees obj2 = new employees();
        employees obj3 = new employees();
        obj.payGenerator(42, 9);
        obj1.payGenerator(62, 13);
        obj2.payGenerator(45, 7);
        obj3.payGenerator(55, 10);
    }
}
