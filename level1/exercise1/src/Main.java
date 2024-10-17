import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Month august = new Month("Agosto");
        ArrayList<Month> months = new ArrayList<Month>();
        String[] monthNames = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (String monthName : monthNames) {
            months.add(new Month(monthName));
        }

        System.out.println("ArrayList of months initialization: ");
        for(Month m : months) {
            System.out.println(m.getName());
        }

        months.add(7, august);
        System.out.println("\nArrayList of months after insertion: ");
        for(Month m : months) {
            System.out.println(m.getName());
        }

        HashSet<Month> montshHashSet = new HashSet<>(months);
        montshHashSet.add(august); // This is not effective since HashSet does not allow duplicates

        System.out.println("\nHashset of months using for loop: ");
        for(Month m : montshHashSet) {
            System.out.println(m.getName());
        }

        System.out.println("\nHashSet iteration using Iterator: ");
        Iterator<Month> iterator = montshHashSet.iterator();
        while(iterator.hasNext()) {
            Month m = iterator.next();
            System.out.println(m.getName());
        }
    }
}