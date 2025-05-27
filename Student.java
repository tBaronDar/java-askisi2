/*
 * Η μέθοδος generateStudentId() μπορεί να μοιάζει με:
 *      return departmentCode + "-" + entryYear + "-" + String.format("%05d", serialNumber);
 * 
 * Ο αριθμός μητρώου πρέπει να παράγεται αυτόματα, όχι να δίνεται εξωτερικά.
 * 
 */
public class Student {

    // === Ιδιωτικά πεδία ===
    private String fullName;
    private int entryYear;
    private int departmentCode;
    private int serialNumber;
    private String studentId;

    // === Constructor ===
    public Student(String fullName, int entryYear, int departmentCode, int serialNumber) {
        this.fullName = fullName;
        this.entryYear = entryYear;
        this.departmentCode = departmentCode;
        this.serialNumber = serialNumber;

        // Καλέστε τη μέθοδο generateStudentId() για να δημιουργήσετε το ΑΜ
        // και αποθηκεύστε το στο πεδίο studentId
        this.studentId = generateStudentId();
    }

    // === Δημιουργία Αριθμού Μητρώου ===
    private String generateStudentId() {
        // Επιστρέψτε μια συμβολοσειρά που αποτελείται από:
        // τον κωδικό του τμήματος, το έτος εισαγωγής, και τον σειριακό αριθμό
        // με μορφή: "DEPT-YEAR-XXXXX", π.χ. "1115-2023-00042"
        String result = String.format("%04d-%04d-%05d", getDepartmentCode(), getEntryYear(), getSerialNumber());


        // Χρησιμοποιήστε String.format() για το zero-padding του serial number
        return result;
    }

    // === Εκτύπωση στοιχείων φοιτητή ===
    public void printDetails() {
        //  Εκτυπώστε το ονοματεπώνυμο και τον αριθμό μητρώου του φοιτητή
        System.out.println("Student: " + getFullName() + " has AM "+getStudentId());
    }

    // === Getters ===
    public String getFullName() {
        return fullName;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}