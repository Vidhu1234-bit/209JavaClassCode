abstract class College {
    abstract void Register();
    abstract void Infrastructure();
    abstract void Student();
    abstract void Staff();

    void medicalFaculty() {
        System.out.println("Medical Facilities are Optional:");
    }
}


class KIET extends College {
    void Register() {
        System.out.println("KIET is registered with AKTU");
    }

    void Infrastructure() {
        System.out.println("KIET has digital classrooms");
    }

    void Student() {
        System.out.println("Admissions through counselling");
    }

    void Staff() {
        System.out.println("KIET has well-qualified staff");
    }

    void medicalFaculty() {
        System.out.println("KIET has its own hospital");
    }
}

public class AbstractExamples {
    public static void main(String[] args) {
        College cg;    
        cg = new KIET();  

        cg.Infrastructure();
        cg.Register();
        cg.Student();
        cg.Staff();
        cg.medicalFaculty();
    }
}
