
public class Main {
    public static void main(String[] args) {
        // --- TODO: Step 1 ---
        // Create your Student.java file in the src/ folder.
        // It should have private fields, a constructor, and getters/setters.
       

        // --- TODO: Step 2 ---
        // Instantiate your first student object here
        // Example: Student s1 = new Student("Abebe Kassa", 12345);
        Student student1 = new Student("Hamid",101);

        // --- TODO: Step 3 ---
        // Instantiate your second student object here
        Student student2 = new Student("Abdurahman", 102);
        
        // --- TODO: Step 4 ---
        // Print the details to the console using your getter methods
        System.out.println("--- Student Enrollment List ---");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Id: " + student1.getStudentId());
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Id: " + student2.getStudentId());

        System.out.println("\nAssignment Status: Check your Git commits before pushing!");
    }
}
