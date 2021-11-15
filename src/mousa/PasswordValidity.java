package mousa;

public class PasswordValidity {

    public static void main(String[] args) {


        System.out.println(isPasswordValid("Password@"));


    }

    //Checks if password is valid due to the conditions below:
    //the password must have length of 6 or more (done)
    //the password should not contain space (done)
    //the password should contain at least one special character (done)
    //the password should contain at least one digit
    //the password should contain at least one uppercase letter
    //the password should contain at least one lowercase letter

    public static boolean isPasswordValid(String password) {
        boolean hasCorrectLength = password.length() >= 6;
        boolean hasNoSpace = !password.contains(" ");
        if (hasCorrectLength && hasNoSpace) {
            boolean digitFound = false;
            boolean upperCaseFound = false;
            boolean lowerCaseFound = false;
            boolean specialCharacter = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    digitFound = true;
                }
                if (Character.isUpperCase(c)) {
                    upperCaseFound = true;
                }
                if (Character.isLowerCase(c)) {
                    lowerCaseFound = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    specialCharacter = true;
                }
            }
            return digitFound && upperCaseFound && lowerCaseFound && specialCharacter;
        }
        return false;
    }
}

