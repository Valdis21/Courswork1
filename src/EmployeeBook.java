public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public boolean add(String name, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, department, salary);
                return true;
            }
        }
        return false;
    }

    public void delete(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public double calculateSumOfSalary() {
        double sum = 0;
        for (double i = 0; i < employees.length; i++) {
            sum = sum + employees[(int) i].getSalary();
        }
        return sum;
    }

    public double calculateAverageOfSalary() {
        double sum = calculateSumOfSalary();
        double averageSum = calculateSumOfSalary() / employees.length;
        return averageSum;
    }

    public Employee getEmployeeWithMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public void printAll() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void changeSalaryByPercent(int percent) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + employee.getSalary() / 100.0 * percent;
            employee.setSalary(newSalary);
        }
    }

    public double calculateSumOfSalary(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (department != employee.getDepartment) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    public double calculateAverageOfSalary(int department) {
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

    public Employee getEmployeeWithMinSalary(int department) {
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

    public Employee getEmployeeWithMaxSalary(int department) {
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

    public void changeSalaryByPercent(int percent, int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            double newSalary = employee.getSalary() + employee.getSalary() / 100.0 * percent;
            employee.setSalary(newSalary);
        }
    }

    public void printAll(int department) {
        for (Employee employee : employees) {
            if (department != employee.getDepartment()) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void printAllSalaryWithMore(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s",
                        employee.getName(), employee.getId(), employee.getSalary()));
            }
        }
    }

    public void printAllSalaryWithLess(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(String.format("Сотрудник: %s, id = %s, ЗП = %s",
                        employee.getName(), employee.getId(), employee.getSalary()));
            }
        }
    }
}