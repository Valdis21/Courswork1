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

    private static void changeSalaryByPercent(int percent) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + employee.getSalary() / 100.0 * percent;
            employee.setSalary(newSalary);
        }
    }

    public static double calculateSumOfSalary(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (department != employee.getDepartment) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    public static double calculateAverageOfSalary(int department) {
        int quantity = 0;
        double salarySum = 0;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            quantity++;
            salarySum += employee.getSalary();
        }
        return salarySum / quantity;
    }

    private static Employee getEmployeeWithMinSalary(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee getEmployeeWithMaxSalary(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static void changeSalaryByPercent(int percent, int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            double newSalary = employee.getSalary() + employee.getSalary() / 100.0 * percent;
            employee.setSalary(newSalary);
        }
    }

    private static void printAll(int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            System.out.println(employee);
        }
    }

    private static void printAllSalaryWithMore(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s",
                        employee.getName(), employee.getId(), employee.getSalary()));
            }
        }
    }

    private static void printAllSalaryWithLess(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s",
                        employee.getName(), employee.getId(), employee.getSalary()));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        employees[0] = new Employee("Иванов Иван Иванович", 1, 45_653);
        employees[1] = new Employee("Петров Петр Петрович", 2, 56_453);
        employees[2] = new Employee("Васечкин Василий Васильевич", 3, 76_234);
        employees[3] = new Employee("Серов Михаил Ильич", 4, 54_567);
        employees[4] = new Employee("Лосева Ирина Геннадьевна", 5, 76_847);
        employees[5] = new Employee("Калинина Марина Владимировна", 1, 65_664);
        employees[6] = new Employee("Соболеваа Валентина Ильнична", 2, 76_637);
        employees[7] = new Employee("Канева Кристина Николаевна", 3, 64_738);
        employees[8] = new Employee("Игнатов Игорь Дмитриевич", 4, 87_758);
        employees[9] = new Employee("Сидорова Любовь Алексеевна", 5, 85_757);

        printAllSalaryWithLess(60_000);

    }
}


