class Student{
    //Implement your code here
    private final int STIPEND=100;
    private int studentId;
    private int aggregateMarks;
    
    public double calculateTotalStipend(){
        int bonus = 0;
        if(aggregateMarks>=85 && aggregateMarks<90){
            bonus=10;
        }else if(aggregateMarks>=90 && aggregateMarks<95){
            bonus = 15;
        }else if(aggregateMarks>=95 && aggregateMarks<=100){
            bonus = 20;
        }
        
        return STIPEND+bonus;
    }
    
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public int getAggregateMarks(){
        return aggregateMarks;
    }
    public void setAggregateMarks(int aggregateMarks){
        this.aggregateMarks =  aggregateMarks;
    }
    
    public int getSTIPEND(){
        return STIPEND;
    }
}
