import javax.security.auth.login.CredentialException;
import java.util.regex.Pattern;

public class UserFactory {


    private final static Pattern facultyNumberPattern  = Pattern.compile("\\d{9}");
    private final static Pattern EGNPattern = Pattern.compile("\\d{10}");
    private final static Pattern emailPattern = Pattern.compile("[a-z]+@tu-sofia.bg");


    public static User createUser(String userName , String password , UserType usertype) throws CredentialException {
        switch (usertype) {
            case ADMIN : {
                return new Admin(userName , password);
            }
            case STUDENT: {
                if(!facultyNumberPattern.matcher(userName).matches())
                    throw new CredentialException("Error: Invalid faculty number format.");
                if(!EGNPattern.matcher(password).matches())
                    throw new CredentialException("Error: Invalid EGN format.");
                return new Student(userName , password);
            }
            case TEACHER: {
                if(!emailPattern.matcher(userName).matches())
                    throw new CredentialException("Error: Invalid email format.");

                if(password.length() < 5)
                    throw new CredentialException("Error: Password must be at least 5 characters");
                return new Teacher(userName , password);
            }
            default:
                return null;
        }
    }
}
