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
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    // === Setters ===
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // === Εκτύπωση πληροφοριών παραρτήματος ===
    public void printDetails() {
        // TODO: Εκτυπώστε τις πληροφορίες του παραρτήματος:
        int schoolSize = schools.size();
       System.out.println(
               "Name: " + name
       + "\nAddress: " + address
       + "\nSchools: " + schoolSize);
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