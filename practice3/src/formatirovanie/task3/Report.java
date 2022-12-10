package formatirovanie.task3;

public class Report {
    public static void generateReport(Employee[] arr){
        for (Employee el : arr){
            System.out.printf("%s\nSalary - %10.2f\n", el.fullname, el.salary);
        }
    }
}
