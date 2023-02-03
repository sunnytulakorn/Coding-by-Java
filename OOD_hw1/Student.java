import java.util.ArrayList;
class Student {
    private String name;
    private String major;
    private ArrayList<Course> Courses = new ArrayList<Course>(); 
    private ArrayList<Double> RawGrade = new ArrayList<Double>();

    public Student(String name, String major){
        this.name = name;
        this.major = major;

    }
    public void addCourse(Course Courses, Double RawGrade){
        this.Courses.add(Courses);
        this.RawGrade.add(RawGrade);
    }
    public void printTranscript(){
        int TotalC = 0;
        double OverallGPA = 0;
        double division = 0;
        System.out.println("Name: "+name);
        System.out.println("Major: "+major);
        System.out.println("Courses Taken:");
        System.out.printf("-------------------------------------------------------------------%n");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-11s |%n", "Course", "type", "Credit", "RawGrade", "LetterGrade");
        System.out.printf("-------------------------------------------------------------------%n");
        for (int i = 0; i < Courses.size(); i++) { 
            System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-11s |%n", this.Courses.get(i).getName(), this.Courses.get(i).getType(), this.Courses.get(i).getCredit(), this.RawGrade.get(i), this.Courses.get(i).getFinalLetterGrade(RawGrade.get(i)));
            System.out.printf("-------------------------------------------------------------------%n");
            if(Courses.get(i).getType() == "Scale"){
                OverallGPA += Courses.get(i).getCredit()*calGPA(Courses.get(i).getFinalLetterGrade(RawGrade.get(i)));
                division += Courses.get(i).getCredit();
            }		
        }
        for(int i = 0; i < Courses.size(); i++){
            if(Courses.get(i).getFinalLetterGrade(RawGrade.get(i)) == "U"){
                continue;
            } else {
                TotalC += Courses.get(i).getCredit();
            }
        }
        System.out.printf("Total Credit: %d%n", TotalC);
        System.out.printf("Overall GPA: %.2f%n", OverallGPA/division);

    }
    private double calGPA(String gpa){
        if(gpa == "A"){
            return 4;
        }
        else if(gpa == "B"){
            return 3;
        }
        else if(gpa == "C"){
            return 2;
        }
        else if(gpa == "D"){
            return 1;
        }
        else {
            return 0;
        }
    }
}
