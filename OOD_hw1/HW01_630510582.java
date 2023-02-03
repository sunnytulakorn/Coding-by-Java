import java.util.ArrayList;
import java.util.Arrays;
/**
 * HW01_630510582
 */
public class HW01_630510582 {

    public static void main(String[] args) {
        System.out.println("Test case: 1");
        Course c1 = new ScaleCourse("CS103", 4, new ArrayList<Double>(Arrays.asList(94.0,82.0,70.0,56.0,0.0)));
        Course c2 = new SatisfactoryCourse("CS170", 3, 60);
        Course c3 = new ScaleCourse("CS103", 4, new ArrayList<Double>(Arrays.asList(90.0,80.0,70.0,60.0,0.0)));
        Course c4 = new ScaleCourse("CS103", 4, new ArrayList<Double>(Arrays.asList(92.5,82.5,70.0,60.0,0.0)));
        Course c5 = new SatisfactoryCourse("CS250", 2, 70.0);
        Student vinai = new Student("Vinai Lapan", "Computer Science");
        vinai.addCourse(c1, 94.0);
        vinai.addCourse(c2, 59.0);
        vinai.addCourse(c3, 90.5);
        vinai.addCourse(c4, 92.0);
        vinai.addCourse(c5, 70.0);
        vinai.printTranscript();
        System.out.println();
        System.out.println("Test case: 2");
        Course c6 = new ScaleCourse("CTAN 101", 2, new ArrayList<Double>(Arrays.asList(95.0,84.0,72.0,51.0,0.0)));
        Course c7 = new ScaleCourse("CTAN 301", 3, new ArrayList<Double>(Arrays.asList(84.0,70.0,50.0,40.0,0.0)));
        Course c8 = new ScaleCourse("CTAN 220", 4, new ArrayList<Double>(Arrays.asList(90.0,80.0,70.0,60.0,0.0)));
        Course c9 = new SatisfactoryCourse("CMPP 541", 4, 65.0);
        Student pakin = new Student("Pakin Wong", "Cinematic Arts");
        pakin.addCourse(c6, 97.5);
        pakin.addCourse(c7, 49.9);
        pakin.addCourse(c8, 59.0);
        pakin.addCourse(c9, 60.0);
        pakin.printTranscript();
    }
}