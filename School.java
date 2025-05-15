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

        // TODO: Προσθέστε το αρχικό τμήμα στη λίστα departments
    }

    // === Προσθήκη Τμήματος ===
    public void addDepartment(Department dept) {
        // TODO: Προσθέστε το αντικείμενο dept στη λίστα departments
    }

    // === Πλήθος Τμημάτων ===
    public int getDepartmentCount() {
        // TODO: Επιστρέψτε το μέγεθος της λίστας departments
        return 0;
    }

    // === Πλήθος Φοιτητών σε όλα τα Τμήματα ===
    public int getStudentCount() {
        // TODO: Για κάθε Department, προσθέστε το πλήθος των φοιτητών
        // Χρησιμοποιήστε επανάληψη (π.χ. for-each)
        return 0;
    }

    // === Εκτύπωση πληροφοριών σχολής ===
    public void printDetails() {
        // TODO: Εκτυπώστε το όνομα της σχολής και το πλήθος των τμημάτων
        // Στη συνέχεια καλέστε printDetails() για κάθε Department
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
        // TODO: Ορίστε νέο όνομα για τη σχολή
    }
}