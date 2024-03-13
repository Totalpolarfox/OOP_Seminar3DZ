import java.util.Random;

/**
 * Генератор работников
*/
import java.util.Random;

public class EmployeeFabric {

        private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 55);
        int salary = random.nextInt(4500, 8200);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Афанасий", "Владимир", "Егор", "Сергей", "Игорь", "Алексей", "Никита", "Борис", "Виктор", "Павел" };
        String[] surnames = new String[] { "Арбатов", "Беликов", "Воронцов", "Голубев", "Корнеев", "Логинов", "Маслов", "Рублев", "Сотников", "Туманов" };
        int age = random.nextInt(25, 45);
        int salary = random.nextInt(800, 1200);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }

}
