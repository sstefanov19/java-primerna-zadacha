public class Grade {

    private String subject;
    private int semester;
    private int grade;


    public Grade(String subject , int semester , int grade) {
        this.subject = subject;
        this.semester = semester;
        this.grade = grade;
    }


    public String getSubject() {return subject;}

public void setSubject(String subject) {this.subject = subject;}

public int getSemester() {return semester;}

public void setSemester(int semester) {this.semester = semester;}

public int getGrade() {return grade;}
public void setGrade(int grade) {this.grade = grade;}


}
