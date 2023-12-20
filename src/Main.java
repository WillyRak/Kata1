import Kata1.Person;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Willy", LocalDate.of(2001, 01, 13));
        String name = person1.getName();
        int age = person1.getAge();

        System.out.println(name + " tiene " + age + " años.");
    }
}