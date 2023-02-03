class SatisfactoryCourse extends Course {
    private double threshold;
    public SatisfactoryCourse(String name, int credit, double threshold) {
        super(name, credit);
        this.threshold = threshold;
    }

    @Override
    public String getFinalLetterGrade(double grade) {
        if(grade >= threshold){
            return "S";
        }
        else{
            return "U";
        }
    }

    @Override
    public String getType() {
        return "S/U";
    }
    
    
}
