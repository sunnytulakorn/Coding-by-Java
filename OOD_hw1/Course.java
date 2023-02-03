/**
 * Course
 */
abstract class Course {
    private String name;
    private int credit;
    
    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }
    
    public String getName() {
        return name;
    }
     public int getCredit(){
        return credit;
     }
    
    public abstract String getFinalLetterGrade(double grade);
    public abstract String getType();
    
}