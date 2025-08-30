class Employee {
    int empId;
    String empName;
    static String organisation = "KIET";
    
    void details() {
        System.out.println("  Emp ID: " + empId 
                         + "\n  Name: " + empName 
                         + "\n  Organisation: " + organisation);
    }
}

class Faculty extends Employee {
    String department;
    String subject;
    String designation;
    
    void facultyDetails() {
        System.out.println("  Department: " + department 
                         + "\n  Subject: " + subject 
                         + "\n  Designation: " + designation);
    }  
}

public class InheritanceSingle {
    public static void main(String[] args) {
        Faculty f = new Faculty();
        f.empId = 101;
        f.empName = "Deepak Kumar";
        f.department = "AIML";
        f.subject = "Maths";
        f.designation = "Assistant Professor";

        System.out.println("Details of the Employee are:");
        f.details();
        f.facultyDetails();
    }
}
