package controller;
import java.util.regex.Pattern;
/**
 * controlla l'indirizzo e-mail
 */
public class EmailControl {
    public static boolean validEmail(String mail){
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern p=Pattern.compile(emailPattern);
        return p.matcher(mail).matches();
    }
}
