package formatirovanie.task3;

public class Employee {
    String fullname;
    double salary;
    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Ivanov Ivan Ivanovich", 10230.2411);
        arr[1] = new Employee("Olegov Oleg Olegovich", 25114.124);
        arr[2] = new Employee("Antonov Anton Antonovich", 75000.12);
        Report.generateReport(arr);
    }
}
