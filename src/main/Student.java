public class Student{

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id,String name,int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 100000;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }
    public void paysFees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

}