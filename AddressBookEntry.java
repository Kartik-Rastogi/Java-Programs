import java.util.*;

public class AddressBookEntry implements Comparable<AddressBookEntry> {
    private String name;
    private int phone;
    private String address;

    AddressBookEntry(String name, String address, int phone) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    private String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    private String getAddress() {
        return address;
    }

    /*
     * overriding compareTo() method.
     * if the object has same phoneno then it is considered as a
     * duplicate entry, else, the entry is sorted on the
     * basis of the Person name.
     */
    @Override
    public int compareTo(AddressBookEntry o) {
        if (phone == o.getPhone()) {
            return 0;
        } else if (name.compareTo(o.getName()) < 0) {
            return -1;
        } else
            return 1;
    }

    // overriding toString() to print the Person detail
    @Override
    public String toString() {
        return name + " (" + phone + ")" + " , " + address;
    }

    public static void main(String[] args) {
        Set<AddressBookEntry> persons = new HashSet<AddressBookEntry>();

        // add objects to the HashSet
        persons.add(new AddressBookEntry("Kartik", "Delhi", 22));
        persons.add(new AddressBookEntry("Jayesh", "Gujarat", 32));

        // adding an object with same age
        persons.add(new AddressBookEntry("Charanpreet", "Punjab", 22));

        // adding an object with same name but different
        // age
        persons.add(new AddressBookEntry("Manish", "Jaipur", 40));

        // print the HashSet
        for (AddressBookEntry s : persons) {
            System.out.println(s);
        }
        // Adding elements to List to sort via Collections.sort()
        System.out.println("Sorted List:");
        ArrayList<AddressBookEntry> list = new ArrayList<AddressBookEntry>();
        list.addAll(persons);
        Collections.sort(list);
        for (AddressBookEntry s : list) {
            System.out.println(s);
        }
    }
}