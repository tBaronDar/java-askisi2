/*
 * Υπενθύμιση:
 * Μπορείτε παρακατω να χρησιμοποιήσετε:
 *    departments.add(initialDepartment);
 *    departments.size();
 *    for (Department d : departments) { ... }
 * Προσοχή:
 * Η κλήση d.getStudentCount() απαιτεί να έχει υλοποιηθεί η αντίστοιχη μέθοδος στην κλάση Department.
 */
import java.util.ArrayList;

public class School {

    // === Ιδιωτικά πεδία ===
    private String name;
    private ArrayList<Department> departments;

    // === Constructor ===
    public School(String name, Department initialDepartment) {
        this.name = name;
        this.departments = new ArrayList<>();

        // Προσθέστε το αρχικό τμήμα στη λίστα departments
        this.departments.add(initialDepartment);
    }

    // === Προσθήκη Τμήματος ===
    public void addDepartment(Department dept) {
        // Προσθέστε το αντικείμενο dept στη λίστα departments
        this.departments.add(dept);
    }

    // === Πλήθος Τμημάτων ===
    public int getDepartmentCount() {
        //  Επιστρέψτε το μέγεθος της λίστας departments
        return departments.size();
    }

    // === Πλήθος Φοιτητών σε όλα τα Τμήματα ===
    public int getStudentCount() {
        // Για κάθε Department, προσθέστε το πλήθος των φοιτητών
        // Χρησιμοποιήστε επανάληψη (π.χ. for-each)
        int studentCountTotal = 0;
        for (Department department : departments) {
            studentCountTotal =department.getStudentCount()+studentCountTotal;
        }
        return studentCountTotal;
    }

    // === Εκτύπωση πληροφοριών σχολής ===
    public void printDetails() {
        // Εκτυπώστε το όνομα της σχολής και το πλήθος των τμημάτων
        // Στη συνέχεια καλέστε printDetails() για κάθε Department
        System.out.println("The school of" + this.name + " has the following Deps: \n");
        for (Department department : departments) {
            System.out.println(department.getName());
        }

    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    // === Setter ===
    public void setName(String name) {
        // Ορίστε νέο όνομα για τη σχολή
        this.name = name;
    }
}