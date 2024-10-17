import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Person> personas = new ArrayList<>();
        for (int i=0; i < 5; i++) {
            personas.add(new Person("persona"+i));
        }

        System.out.println("LIST 1 personas: ");
        for (Person person : personas) {
            System.out.println(person.getName());
        }

        // add using for
        List<Person> copyPersonas1 = new ArrayList<>();
        for (int i=personas.size(); i>0 ;i--) {
            copyPersonas1.add(personas.get(i-1));
        }

        System.out.println("\nLIST 2 copy personas using for: ");
        for (Person person : copyPersonas1) {
            System.out.println(person.getName());
        }

        // add using list iterator
        List<Person> copyPersonas2 = new ArrayList<>();
        ListIterator<Person> listIterator = personas.listIterator(personas.size());
        while (listIterator.hasPrevious()) {
            copyPersonas2.add(listIterator.previous());
        }

        System.out.println("\nLIST 3 copy personas using iterator: ");
        for (Person person : copyPersonas2) {
            System.out.println(person.getName());
        }

    }
}