import java.util.Comparator;

/**
 * Сортировка по уровню зарплаты
 */
public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.calculateSalary(), o1.calculateSalary()); // сравнивает 2 значения типа Double
    }
}
