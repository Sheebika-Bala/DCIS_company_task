import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DCIS company = new DCIS("DCIS");

        System.out.println("Welcome to " + company.getCompanyName());

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sheebika", "Engineering", "Junior Engineer"));
        employeeList.add(new Employee("Sarah", "QA", "Tester"));
        employeeList.add(new Employee("Varshini","Engineering","Junior engineer"));
        employeeList.add(new Employee("Hemanthini","QA","Quality Analyst"));
        employeeList.add(new Employee("Dayana","Engineering","Junior engineer"));
        employeeList.add(new Employee("Ashwin","Engineering","Junior engineer"));
        employeeList.add(new Employee("Shilton","Engineering","Junior engineer"));
        employeeList.add(new Employee("Joel","QA","Quality Analyst"));
        employeeList.add(new Employee("Riyazz","Engineering","Junior engineer"));
        employeeList.add(new Employee("Noel","QA","Quality Analyst"));

        System.out.println("Total employees: " + employeeList.size());

        String filterDept = "QA";
        System.out.println("\nEmployees in department: " + filterDept);
        for (Employee s : employeeList) {
            if (s.getDepartment().equals(filterDept)) {
                System.out.println(s.getName());
            }
        }

        String filterDeptnt = "Engineering";
        System.out.println("\nEmployees in department: " + filterDeptnt);
        for (Employee s : employeeList) {
            if (s.getDepartment().equals(filterDeptnt)) {
                System.out.println(s.getName());
            }
        }

        ArrayList<Employeer> employerList = new ArrayList<>();
        employerList.add(new Employeer("Venky", "HR Manager"));

        ArrayList<Rooms> roomList = new ArrayList<>();
        roomList.add(new Rooms(101, "Working Room", 25, 30 , 0,0,1,2,1,1,1,1,0,1));
        roomList.add(new Rooms(102, "Manager Room", 2, 5,1,0,1,0,0,0,1,0,1,1));
        roomList.add(new Rooms(103, "Cafeteria", 0, 30,1,0,1,1,1,1,0,0,1,0));
        roomList.add(new Rooms(104, "Conference Room", 0, 25,1,0,0,1,0,1,0,1,1,1));
        roomList.add(new Rooms(105, "Reception", 1, 5,0,1,1,1,0,1,0,0,0,0));

        Resources res = new Resources(28, 100,10,1,4,5,2,4,2,2,3,3);

        System.out.println("\nEmployees List:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nEmployers:");
        for (Employeer m : employerList) {
            System.out.println(m);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nTOTAL COMPANY RESOURCES:");
        System.out.println(res);
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nRoom Details:");
        for (Rooms r : roomList) {
            System.out.println(r);
            System.out.println("*************************");
        }
    }
}
