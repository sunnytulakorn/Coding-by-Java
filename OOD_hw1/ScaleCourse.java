import java.util.ArrayList;
class ScaleCourse extends Course {
    private ArrayList<Double> scales = new ArrayList<Double>(); 
    public ScaleCourse(String name, int credit, ArrayList<Double> scales) {
        super(name, credit);
        this.scales = scales;
    }

    @Override
    public String getFinalLetterGrade(double grade) {
        if(grade >= scales.get(0)){
            return "A";
        }
        else if(grade >= scales.get(1)){
            return "B";
        }
        else if(grade >= scales.get(2)){
            return "C";
        }
        else if(grade >= scales.get(3)){
            return "D";
        }
        else{
            return "F";
        }
    }

    @Override
    public String getType() {
        return "Scale";
    }
    
    
}
