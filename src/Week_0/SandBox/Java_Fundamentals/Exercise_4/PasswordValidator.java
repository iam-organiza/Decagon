package Week_0.SandBox.Java_Fundamentals.Exercise_4;

import java.util.Scanner;

/**
 * Validate the complexity of a proposed password by assuring it meets these rules:
 *
 * At least 8 characters long
 * Contains an uppercase letter
 * contain a special character
 * not contain the username
 * not the same as the old password
 */

public class PasswordValidator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String errorMsg = "";

        System.out.println("Username: ");
        String username = scanner.next();

        System.out.println("Old password: ");
        String oldPassword = scanner.next();

        System.out.println("New Password: ");
        String password = "";
        while (!valid) {
            if (!password.isEmpty()) {
                System.out.println("Enter new password");
            }

            password = scanner.next();
            int stringLen = password.length();

            if (stringLen >= 8) {
                valid = true;
                errorMsg = "";

                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        valid = true;
                        errorMsg = "";
                        String[] specialChars = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "<", ">", "?", "/", ".", ",", ";", "'", "\"", "[", "]", "{", "}", "|", "\\"};
                        for (String specialChar : specialChars) {
                            if (password.contains(specialChar)) {
                                valid = true;
                                errorMsg = "";
                                if (!password.contains(oldPassword)) {
                                    valid = true;
                                    errorMsg = "";
                                    if (!password.contains(username)) {
                                        valid = true;
                                        errorMsg = "";
                                        break;
                                    } else {
                                        valid = false;
                                        errorMsg = "Password contains username";
                                    }
                                    break;
                                } else {
                                    valid = false;
                                    errorMsg = "Password contains old password";
                                }
                                break;
                            } else {
                                valid = false;
                                errorMsg = "Password must contain a special character.";
                            }
                        }
                        break;
                    } else {
                        valid = false;
                        errorMsg = "Password has no uppercase letter(s)!";
                    }
                }
            } else {
                valid = false;
                errorMsg = "Password is too short!";
            }

            if (errorMsg.isEmpty())
                System.out.print(errorMsg);
            else
                System.out.println(errorMsg);
        }
        scanner.close();
        System.out.println("Password has been accepted");
    }
}
