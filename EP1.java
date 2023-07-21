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

public class EP1 {
    public static void main(String[] args) {
        Set<person> personSet = new HashSet<>();
        personSet.add(new person("Kartik", 22));
        personSet.add(new person("Vijay", 43));
        personSet.add(new person("Murali", 75));
        System.out.println("Elements of set are : " + personSet);
        // unlike set, a set is not ordered
        for (person p : personSet) {
            p.sayHello();
        }
        System.out.println("Duplicate element added/not added? : " + (personSet.add(new person("Peter", 21))));
        Scanner s = new Scanner(System.in);
        System.out.println("Hello , What is your name : ");
        String name = s.nextLine();
        System.out.println("Hello " + name + " What is your age : ");
        int age = s.nextInt();
        personSet.add(new person(name, age));
        System.out.println(personSet);
        s.close();
    }
}
