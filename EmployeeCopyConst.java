public class EmployeeCopyConst {
    int id;
    String name;

    // Normal Constructor
    EmployeeCopyConst(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Shallow Copy Constructor
    EmployeeCopyConst(EmployeeCopyConst e) {
        this.id = e.id;
        this.name = e.name; 
    }

    // Deep Copy Constructor
    EmployeeCopyConst(EmployeeCopyConst e, boolean deepCopy) {
        this.id = e.id;
        this.name = new String(e.name); 
    }

    void show(String msg) {
        System.out.println(msg + " -> ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        EmployeeCopyConst e1 = new EmployeeCopyConst(101, "Laxmi");

        EmployeeCopyConst e2 = new EmployeeCopyConst(e1);         
        EmployeeCopyConst e3 = new EmployeeCopyConst(e1, true);    

        System.out.println("Before Changes:");
        e1.show("Original");
        e2.show("Shallow Copy");
        e3.show("Deep Copy");

       
        e1.id = 999;
        e1.name = "Shubhi";

        System.out.println("\nAfter Changes in Original:");
        e1.show("Original");
        e2.show("Shallow Copy"); 
        e3.show("Deep Copy");   
    }
}













