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
        // Χρησιμοποιήστε είτε new UniversityBranch(...) είτε getInstance(...) αν κάνατε Singleton
        UniversityBranch pamakCyprus = new UniversityBranch("Pamak of Cyprus", "Lemessos, Kiprion 15");

        // === Δημιουργία Τμημάτων για τη Σχολή Πληροφορικής ===
        // Δημιουργήστε 2 τμήματα (π.χ. Πληροφορικής και Εφαρμοσμένης Πληροφορικής)
        Department d1 = new Department("Efarmosmeni pliroforiki",1617);
        Department d2 = new Department("Logistikis",9856);


        // === Δημιουργία φοιτητών για κάθε τμήμα ===
        //  Δημιουργήστε μερικούς φοιτητές για κάθε τμήμα
        // Θυμηθείτε: περνάμε Ονοματεπώνυμο, Έτος, Κωδικό Τμήματος, Αύξοντα Αριθμό
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Maria Papadopoulou", "Nikos Evagelou", "Thodoros Andreadis Sigelakis", "Pagona Oustabasidou", "Ifaistinas Papapolihroniadis","Pinelopi Delta", "Konstantinos Kavafis"));
        ArrayList<Student> students = new ArrayList<>();

        Student st = null;
        for (int i = 0; i < 29; i++) {
            int randomNameIndex = (int) (Math.random() * names.size());
            int randomYear = ThreadLocalRandom.current().nextInt(2000, 2026);
            int randomDepartmentIndex = (int) (Math.random() * names.size());
            int result = ThreadLocalRandom.current().nextBoolean() ? 9856 : 1617;
         st =new Student(names.get(randomNameIndex), randomYear,200,i);
        }


        // Προσθέστε τους φοιτητές στα αντίστοιχα Τμήματα
        // π.χ. d1.addStudent(...)

        if ( st.getDepartmentCode()== d1.getCode()){
            d1.addStudent(st);
        }else {
            d2.addStudent(st);
        }

        // === Δημιουργία Σχολής και προσθήκη Τμημάτων ===
        //  Η πρώτη σχολή δημιουργείται με 1 τμήμα, τα υπόλοιπα προστίθενται με addDepartment()
        School informaticsSchool = new School("Informatics School",d1);

        // === Δημιουργία δεύτερης Σχολής με 1 τμήμα χωρίς φοιτητές ===
        Department d3 = new Department("Management",1347);
        School economicsSchool = new School("Economics School",d3);

        // === Προσθήκη Σχολών στο Παράρτημα ===
        // Χρησιμοποιήστε pamakCyprus.addSchool(...) για κάθε σχολή
            pamakCyprus.addSchool(economicsSchool);
            pamakCyprus.addSchool(informaticsSchool);
        // === Εκτύπωση συνολικών στοιχείων ===
        System.out.println("\n--- ΠΑΜΑΚ Κύπρου ---");
        pamakCyprus.printDetails();

        //  Εκτυπώστε ξεχωριστά τα στοιχεία κάθε σχολής
        for (School s : pamakCyprus.getSchools()) {
            System.out.println("Ta stoiheia ton sholon einai: ");
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
