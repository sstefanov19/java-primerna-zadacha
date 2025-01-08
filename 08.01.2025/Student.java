import java.util.ArrayList;
import java.util.List;

public class Student  extends User{




    private List<Grade> grades;



    public Student(String facultyNumber , String EGN) {
        super(facultyNumber , EGN);
        grades = new ArrayList<>(); }



public List<Grade> getGrades() {return grades;}

    @Override
    public UserType getUserType() {return UserType.STUDENT;}
}
