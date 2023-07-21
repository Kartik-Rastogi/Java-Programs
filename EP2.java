import java.util.*;

class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }

    public void sayHello() {
        System.out.println(name + " says hello");
    }

    public boolean equals(Object o) {
        return o != null && o instanceof person && this.name.equalsIgnoreCase(((person) o).name);
    }

    public int hashCode() {
        return this.name.toLowerCase().hashCode();
    }

}

class comparablePerson extends person implements Comparable<person> {

    public comparablePerson(String name, int age) {
        super(name, age);
    }

    public int compareTo(person p) {
        return this.getName().compareToIgnoreCase(p.getName());
    }

}

public class EP2 {
    public static void main(String[] args) {
        List<comparablePerson> pLst = new ArrayList<>();
        pLst.add(new comparablePerson("Peter", 21));
        pLst.add(new comparablePerson("Paul", 18));
        pLst.add(new comparablePerson("John", 81));
        System.out.println("Elements of the list are: " + pLst);
        Collections.sort(pLst); // mutable
        System.out.println("Sorted list: " + pLst);
        System.out.println(Collections.binarySearch(pLst, new comparablePerson("Paul", 18)));
        System.out.println(Collections.binarySearch(pLst, new comparablePerson("Peter", 21)));
        System.out.println(Collections.binarySearch(pLst, new comparablePerson("Kelly", 18)));

    }

}
