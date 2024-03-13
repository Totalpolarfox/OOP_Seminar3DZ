
public abstract class Employee implements Comparable<Employee> {  //Comparable наделяет объект свойством быть сортируемым

    // переопределяет метод сортировки от Comparable (для строковых данных)
    @Override 
    public int compareTo(Employee o) {
        // surName - объект, на котором вызывается метод compareTo, (o.surName) - передаваемый объект
        int surNameRes = surName.compareTo(o.surName); 
        // если surName и (o.surName) равны
        if (surNameRes == 0){  
            // то сортируем по name
            return name.compareTo(o.name);  
        }
        return surNameRes;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Возраст
     */
    protected int age;

    public int getAge() {
        return age;
    }

    /**
     * Ставка заработной платы
     */
    protected double salary;

    public Employee(String surName, String name, int age, double salary) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

}
