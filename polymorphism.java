// Parent Class
class EmployeePoly {
    String Emp_name;

    // Simple details method
    void details() {
        System.out.println("Name: " + Emp_name);
    }

    // Overloaded method 1
    void details(int salary) {
        System.out.println("Salary: " + salary);
    }

    // Overloaded method 2
    void details(String company) {
        System.out.println("Institute Name: " + company);
    }
}

// Child Class
class Faculty extends EmployeePoly {
    @Override
    void details() {
        super.details(); // calls parent class method
        System.out.println("Welcome Faculty");
    }
}

// Main Class
public class polymorphism {
    public static void main(String[] args) {
        EmployeePoly ep = new EmployeePoly();
        ep.Emp_name = "Arun";
        
        // Compile-time polymorphism (Overloading)
        ep.details(1000);      // salary
        ep.details("KIET");    // company

        // Runtime polymorphism (Overriding)
        Faculty f = new Faculty();
        f.Emp_name = "Arun";
        f.details(); // overridden method will be called
    }
}
