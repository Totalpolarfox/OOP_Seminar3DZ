// 1.Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника. 
// Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
// 2.Переработать метод generateEmployees, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
// 3.Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
// 4.Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(15);
        
        for (Object worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        // дефолтный метод сортировки из Employee (по surName и name)
        Arrays.sort(workers);

        // метод сортировки по зарплате
        // Arrays.sort(workers, new SalaryComparator());  

        // метод сортировки по возрасту
        Arrays.sort(workers, new AgeComparator());  

        for (Object worker : workers) {
            System.out.println(worker);
        }
        
    }


}
