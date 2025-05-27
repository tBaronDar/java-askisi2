/*
 * 
 * Μπορείτε παρακατω να χρησιμοποιήσετε:
 * Για την αρχικοποίηση της λίστας:
 *      students = new ArrayList<>();
 * 
 * Για επανάληψη πάνω στους φοιτητές:
 *      for (Student s : students) {
 *          s.printDetails();
 *      }
 * 
 */

import java.util.ArrayList;

public class Department {

    // === Ιδιωτικά πεδία ===
    private String name;
    private int code;
    private ArrayList<Student> students;

    // === Constructor ===
    public Department(String name, int code) {
        this.name = name;
        this.code = code;

        // Αρχικοποιήστε τη λίστα students ως κενή ArrayList
        this.students = new ArrayList<>();
    }

    // === Προσθήκη Φοιτητή ===
    public void addStudent(Student s) {
        // Προσθέστε τον φοιτητή στη λίστα students
        students.add(s);
    }

    // === Πλήθος Φοιτητών ===
    public int getStudentCount() {
        //  Επιστρέψτε το μέγεθος της λίστας students
        return students.size();
    }

    // === Εκτύπωση πληροφοριών Τμήματος ===
    public void printDetails() {
        //  Εκτυπώστε το όνομα και τον κωδικό του Τμήματος
        // Εκτυπώστε και τον αριθμό των φοιτητών
        // Καλέστε printDetails() για κάθε φοιτητή της λίστας
        System.out.println("Department of " + name+ " has " + students.size() + " students.");
        for (Student s : students) {
            s.printDetails();
        }
    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}