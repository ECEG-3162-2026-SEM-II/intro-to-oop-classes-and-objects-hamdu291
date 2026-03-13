public class Student {

    private String name;
    private int studentId;

    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }
    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setStudentId(int studentId){
       this.studentId = studentId;
    }
    public int getStudentId(){
        return studentId;
    }
}
