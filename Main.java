import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[5];
        
        int b = 10;

        Messenger messenger = new EmailMessenger();

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Harry Potter", 25);
            people[2] = new Person("Alice Wizard", 40);
            people[3] = new Person("Johny Bravo", 35);
            people[4] = new Person("Jan Bach", 50);


            for (Person person : people) {
                int age = person.getAge();
                int sum = MathUtils.add(age, b);

                messenger.sendMessage("Suma wieku " + person.getName() + " i wartości b: " + sum);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age detected: " + e.getMessage());
        }
    }
}
