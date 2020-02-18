public class Testing {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();

        System.out.println(employee.salary);
        System.out.println(manager.salary);
        System.out.println(director.salary);

    }
}
