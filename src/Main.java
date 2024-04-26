public class Main {
    private static final Employee[] employees = new Employee[10];


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

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.add("Соболев Иван Петрович", 3, 46_970);
        employeeBook.printAll();
        employeeBook.delete(1);
        employeeBook.printAll();
    }
}


