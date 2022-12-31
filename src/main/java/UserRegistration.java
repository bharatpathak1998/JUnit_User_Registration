import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+[.]?[a-zA-Z]+$";
    public static final String MOBILE_PATTERN = "^[0-9]{0,2} [0-9]{10}$";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";

    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {
        return patternChecker(lastName, NAME_PATTERN);
    }

    public boolean validateEmailId(String emailId) throws UserRegistrationException {
        return patternChecker(emailId, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        return patternChecker(mobileNumber, MOBILE_PATTERN);

    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        return patternChecker(password, PASSWORD_PATTERN);
    }

    private boolean patternChecker(String input, String fieldPattern) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,
                        "Please Give Valid Entry");
            return result;
        } catch (NullPointerException exception) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,
                    "Entry Should Be Not null ");
        }
    }

    public void firstNameValidate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String name = sc.next();

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            System.out.println("Given First Name Is Valid.");
        } else {
            System.out.println("Given First Name Is InValid!");
        }
    }

    public void lastNameValidate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your last name");
        String name = sc.next();

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            System.out.println("Given Last Name Is Valid.");
        } else {
            System.out.println("Given Last Name Is InValid!");
        }
    }

    public void emailValidate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Email Id");
        String email = sc.next();

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Given Email Id Is Valid.");
        } else {
            System.out.println("Given Email Id Is InValid!");
        }
    }

    public void mobileValidate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Mobile Number");
        String mobile = sc.nextLine();

        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        Matcher matcher = pattern.matcher(mobile);

        if (matcher.matches()) {
            System.out.println("Given Mobile Number Is Valid.");
        } else {
            System.out.println("Given Mobile Number Is InValid!");
        }
    }

    public void passwordValidate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Password");
        String password = sc.next();

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Given Password Is Valid.");
        } else {
            System.out.println("Given Password Is InValid!");
        }
    }
}