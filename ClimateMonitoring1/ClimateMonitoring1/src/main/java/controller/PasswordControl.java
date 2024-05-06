package controller;

public class PasswordControl {
    /**
     * controlla se la password è lunga almeno 8 caratteri e contiene lettere maiuscole, minuscole,cifre e caratteri speciali
     */

    public static boolean isStrongPassword(String password) {

        if (password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean specialCharacters = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase && specialCharacters;
    }
}

