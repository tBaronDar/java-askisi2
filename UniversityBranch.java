import java.util.ArrayList;

public class UniversityBranch {

    // === Ιδιωτικά πεδία ===
    private String name;
    private String address;
    private ArrayList<School> schools;

    // === Στατικά πεδία για μετρήσεις ===
    private static int totalSchools = 0;
    private static int totalDepartments = 0;
    private static int totalStudents = 0;

    // === Constructor ===
    public UniversityBranch(String name, String address) {
        this.name = name;
        this.address = address;
        this.schools = new ArrayList<>();
    }

    // === Μέθοδος προσθήκης σχολής ===
    public void addSchool(School school) {
        // TODO: Προσθέστε το αντικείμενο school στη λίστα schools
        // και ενημερώστε τα static counters ανάλογα (totalSchools, totalDepartments, totalStudents)

        // π.χ. schools.add(...);
        // totalSchools++;
        // totalDepartments += ...
        // totalStudents += ...
    }

    // === Getters ===
    public String getName() {
        // TODO: Επιστρέψτε το όνομα του παραρτήματος
        return null;
    }

    public String getAddress() {
        // TODO: Επιστρέψτε τη διεύθυνση του παραρτήματος
        return null;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    // === Setters ===
    public void setName(String name) {
        // TODO: Αποθηκεύστε το νέο όνομα
    }

    public void setAddress(String address) {
        // TODO: Αποθηκεύστε τη νέα διεύθυνση
    }

    // === Εκτύπωση πληροφοριών παραρτήματος ===
    public void printDetails() {
        // TODO: Εκτυπώστε τις πληροφορίες του παραρτήματος:
        // Όνομα, διεύθυνση, πλήθος σχολών, τμημάτων και φοιτητών
        // Χρήση System.out.println(...)
    }

    // === Στατικές μέθοδοι πρόσβασης σε counters ===
    public static int getTotalSchools() {
        return totalSchools;
    }

    public static int getTotalDepartments() {
        return totalDepartments;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}