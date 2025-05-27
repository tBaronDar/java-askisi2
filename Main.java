import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Φροντίστε να κατασκευάζετε αντικείμενα από κάτω προς τα πάνω:
 *      Πρώτα φοιτητές → μετά τμήματα → μετά σχολές → μετά το παράρτημα
 * 
 * Βεβαιωθείτε ότι καλείτε τις printDetails() στο σωστό σημείο
 */
public class Main {
    public static void main(String[] args) {
        // === Δημιουργία Παραρτήματος ΠΑΜΑΚ στην Κύπρο ===
        // TODO: Χρησιμοποιήστε είτε new UniversityBranch(...) είτε getInstance(...) αν κάνατε Singleton
        UniversityBranch pamakCyprus = null;

        // === Δημιουργία Τμημάτων για τη Σχολή Πληροφορικής ===
        // TODO: Δημιουργήστε 2 τμήματα (π.χ. Πληροφορικής και Εφαρμοσμένης Πληροφορικής)
        Department d1 = null;
        Department d2 = null;

        // === Δημιουργία φοιτητών για κάθε τμήμα ===
        // TODO: Δημιουργήστε μερικούς φοιτητές για κάθε τμήμα
        // Θυμηθείτε: περνάμε Ονοματεπώνυμο, Έτος, Κωδικό Τμήματος, Αύξοντα Αριθμό
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Maria Papadopoulou", "Nikos Evagelou", "Thodoros Andreadis Sigelakis", "Pagona Oustabasidou", "Ifaistinas Papapolihroniadis","Pinelopi Delta", "Konstantinos Kavafis"));
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 29; i++) {
            int randomNameIndex = (int) (Math.random() * names.size());
            int randomYear = ThreadLocalRandom.current().nextInt(2000, 2026);
        Student s =new Student(names.get(randomNameIndex), randomYear,200,i);
        }


        // TODO: Προσθέστε τους φοιτητές στα αντίστοιχα Τμήματα
        // π.χ. d1.addStudent(...)

        // === Δημιουργία Σχολής και προσθήκη Τμημάτων ===
        // TODO: Η πρώτη σχολή δημιουργείται με 1 τμήμα, τα υπόλοιπα προστίθενται με addDepartment()
        School informaticsSchool = null;

        // === Δημιουργία δεύτερης Σχολής με 1 τμήμα χωρίς φοιτητές ===
        Department d3 = null;
        School economicsSchool = null;

        // === Προσθήκη Σχολών στο Παράρτημα ===
        // TODO: Χρησιμοποιήστε pamakCyprus.addSchool(...) για κάθε σχολή

        // === Εκτύπωση συνολικών στοιχείων ===
        System.out.println("\n--- ΠΑΜΑΚ Κύπρου ---");
        pamakCyprus.printDetails();

        // TODO: Εκτυπώστε ξεχωριστά τα στοιχεία κάθε σχολής
        for (School s : pamakCyprus.getSchools()) {
            System.out.println();
            s.printDetails();
        }

        // === Σύγκριση με το μητρικό ΠΑΜΑΚ ===
        int pamakSchools = 4;
        int pamakDepartments = 10;
        int pamakStudents = 3500;

        System.out.println("\n--- Σύνολα ΠΑΜΑΚ (Μητρικό + Παράρτημα) ---");
        System.out.println("Συνολικές Σχολές: " + (pamakSchools + UniversityBranch.getTotalSchools()));
        System.out.println("Συνολικά Τμήματα: " + (pamakDepartments + UniversityBranch.getTotalDepartments()));
        System.out.println("Συνολικοί Φοιτητές: " + (pamakStudents + UniversityBranch.getTotalStudents()));
    }
}
