import java.util.Random;

/**
 * Генератор работников
*/

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

    public static Others generateOthers(){
        String[] names = new String[] { "Адам", "Валентин", "Георгий", "Денис", "Иван", "Лев", "Марк", "Прохор", "Руслан", "Степан" };
        String[] surnames = new String[] { "Соболев", "Карпов", "Фомин", "Рожков", "Авдеев", "Белоусов", "Емельянов", "Ларионов", "Зайцев", "Смирнов" };
        int age = random.nextInt(20, 50);
        int salary = random.nextInt(2000, 3000);
        return Others.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }

    /**
     * Генерирует рабочих разных типов (Worker, Freelancer, и т.п)
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] workersList = new Employee[count];

        for (int i = 0; i < count; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    workersList[i] = generateWorker();
                    break;
                case 1:
                    workersList[i] = generateFreelancer();
                    break;
                case 2:
                    workersList[i] = generateOthers();
                    break;
                default:
                    break;
            }
        }               
        return workersList;
    }
}
