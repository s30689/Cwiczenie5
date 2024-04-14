import java.util.ArrayList;
public class Main {


    public class Program {
        public static void main(String[] args) {
            ArrayList<Employee> employees = new ArrayList<>();


        Developer dev = new Developer("John","Doe" , "New York", "john@doe.com","123456789",2020);

        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
    tester.addTestType("UI/UX");
    employees.add(tester);

        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g = new Goal(2010, 10, 15, "Implementing FB login", 1000);
    manager.addGoals(g);
    employees.add(manager);


        int totalAmount = 0;
     for(Employee:employees){
            totalAmount += employee.calculateSalary();
        }

    System.out.println("Total amount to be paid this month: "+totalAmount +"USD");

    }


}}
