public class Main {
    private static final Employee[] employees = new Employee[10];

    public static double calculateSumOfSalary() {
        double sum = 0;
        for (double i = 0; i < employees.length; i++) {
            sum = sum + employees[(int) i].getSalary();
        }
        return sum;
    }

    public static double calculateAverageOfSalary() {
        double sum = calculateSumOfSalary();
        double averageSum = calculateSumOfSalary() / employees.length;
        return averageSum;
    }

    private static Employee getEmployeeWithMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee getEmployeeWithMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");

        employees[0] = new Employee("Иванов Иван Иванович", "1", 45_653);
        employees[1] = new Employee("Петров Петр Петрович", "2", 56_453);
        employees[2] = new Employee("Васечкин Василий Васильевич", "3", 76_234);
        employees[3] = new Employee("Серов Михаил Ильич", "4", 54_567);
        employees[4] = new Employee("Лосева Ирина Геннадьевна", "5", 76_847);
        employees[5] = new Employee("Калинина Марина Владимировна", "1", 65_664);
        employees[6] = new Employee("Соболеваа Валентина Ильнична", "2", 76_637);
        employees[7] = new Employee("Канева Кристина Николаевна", "3", 64_738);
        employees[8] = new Employee("Игнатов Игорь Дмитриевич", "4", 87_758);
        employees[9] = new Employee("Сидорова Любовь Алексеевна", "5", 85_757);

        System.out.println("Сумма всех затрат в месяц составляет " + calculateSumOfSalary() + " рублей.");
        System.out.println("Средняя зарабатная плата равна " + calculateAverageOfSalary() + " рублей.");
        System.out.println("Работник с минимальной заработной платой " + getEmployeeWithMinSalary());
        System.out.println("Работник с максимальной заработной платой " + getEmployeeWithMaxSalary());
        printAll();
    }
}


