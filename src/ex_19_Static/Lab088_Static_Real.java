package ex_19_Static;

public class Lab088_Static_Real {
    public static void main(String[] args) {

        // ✅ Access static variables and static methods using class name (no object needed)
        System.out.println("Mentor: " + ATB.getMentorName());
        System.out.println("Course: " + ATB.getCourseName());

        ATB.doAssignment();
        ATB.joinZoomClass();

        System.out.println("-----------");

        // ✅ Create student object and set values using setter methods
        ATB akaal = new ATB();
        akaal.setName("Akaal");
        akaal.setPhone("958465123");
        ATB.incrementStudentCount();
        akaal.printStudentDetails();

        // ✅ Create another student
        ATB lucky = new ATB();
        lucky.setName("Lucky");
        lucky.setPhone("988765456");
        ATB.incrementStudentCount();
        lucky.printStudentDetails();

        // ✅ Static variable - total shared across all objects
        System.out.println("Total Students Enrolled: " + ATB.getTotalStudents());
    }
}

class ATB {

    // 🧱 Static block runs only once when the class is loaded into memory
    static {
        System.out.println("SIB: Static Initialization Block - Class Loaded");
    }

    // 🧱 Instance block runs every time an object is created
    {
        System.out.println("IIB: Instance Initialization Block - Object Created");
    }

    // ✅ Static (class-level) variables
    private static String courseName = "ATB11x";
    private static String mentorName = "Pramod";
    private static int totalStudents = 0;

    // ✅ Instance (object-level) variables
    private String name;
    private String phone;

    // ✅ Getter & Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // ✅ Getter & Setter for phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // ✅ Static Getters
    public static String getCourseName() {
        return courseName;
    }
    public static String getMentorName() {
        return mentorName;
    }

    // ✅ Static method to increase student count
    public static void incrementStudentCount() {
        totalStudents++;
    }

    // ✅ Getter for student count
    public static int getTotalStudents() {
        return totalStudents;
    }

    // ✅ Static methods (shared behavior)
    public static void doAssignment() {
        System.out.println("All students must complete the assignment!");
    }

    public static void joinZoomClass() {
        System.out.println("Zoom class started!");
    }

    // ✅ Instance method (unique behavior)
    void printStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("Enrolled in Course: " + courseName);
        System.out.println("Mentor Assigned: " + mentorName);
        System.out.println("-----------------------------");
    }
}
