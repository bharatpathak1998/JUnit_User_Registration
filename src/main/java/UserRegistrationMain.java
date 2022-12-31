import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface DataValidate {
    void Validator();
}

public class UserRegistrationMain {

    public static void main(String[] args) {
        // Lambda Expression ->
        DataValidate firstName = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z][a-z]{2,}$";

            System.out.println("Enter your First name : ");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);

            if (matcher.matches()) {
                System.out.println("Given First Name Is Valid.");
            } else {
                System.out.println("Given First Name Is InValid!");
            }
        };
        firstName.Validator();

        DataValidate lastName = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z][a-z]{2,}$";

            System.out.println("Enter your last name : ");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);

            if (matcher.matches()) {
                System.out.println("Given Last Name Is Valid.");
            } else {
                System.out.println("Given Last Name Is InValid!");
            }
        };
        lastName.Validator();

        DataValidate eMail = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[a-zA-Z0-9]+[.+-]?[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+[.]?[a-zA-Z]+$";

            System.out.println("Enter Your Email Id : ");
            String email = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println("Given Email Id Is Valid.");
            } else {
                System.out.println("Given Email Id Is InValid!");
            }
        };
        eMail.Validator();

        DataValidate Mobile = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[0-9]{0,2} [0-9]{10}$";

            System.out.println("Enter Your Mobile Number : ");
            String mobile = sc.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobile);

            if (matcher.matches()) {
                System.out.println("Given Mobile Number Is Valid.");
            } else {
                System.out.println("Given Mobile Number Is InValid!");
            }
        };
        Mobile.Validator();

        DataValidate Password = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^(?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";

            System.out.println("Enter your Password : ");
            String password = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println("Given Password Is Valid.");
            } else {
                System.out.println("Given Password Is InValid!");
            }
        };
        Password.Validator();
    }
}