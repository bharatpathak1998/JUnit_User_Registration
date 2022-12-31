import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    public static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}$";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";

    public boolean validateFirstName(String firstName) {
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) {
        return patternChecker(lastName, NAME_PATTERN);
    }

    public boolean validateEmailId(String emailId) {
        return patternChecker(emailId, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return patternChecker(mobileNumber, MOBILE_PATTERN);
    }

    public boolean validatePassword(String password) {
        return patternChecker(password, PASSWORD_PATTERN);
    }

    public boolean patternChecker(String input, String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}