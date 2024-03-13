import java.util.Comparator;

/**
 * Сортировка по возрасту
 */

public class AgeComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.getAge(), o1.getAge()); // сравнивает 2 значения типа Int

    }
}
