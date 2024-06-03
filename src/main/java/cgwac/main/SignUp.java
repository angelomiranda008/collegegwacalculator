package cgwac.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SignUp extends Register {

    private static final String path = "C:\\JavaProjects\\NetbeansProjects\\student_data.xlsx";

    public SignUp(String username, String password, String confirmPass) {
        super(username, password, confirmPass);
    }

    boolean EightValuesOrAbove() {
        return getPassword().length() >= 8;
    }

    boolean HasLetter() {
        for (int i = 0; i < getPassword().length(); i++) {
            char ch = getPassword().charAt(i);
            if (Character.isLetter(ch)) {
                return true;
            }
        }
        return false;
    }

    boolean HasNumber() {
        for (int i = 0; i < getPassword().length(); i++) {
            char ch = getPassword().charAt(i);
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    boolean HasUnicode() {
        for (int i = 0; i < getPassword().length(); i++) {
            char ch = getPassword().charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    boolean checkUsername() {
        if (getUsername().endsWith("@student.tsu.edu.ph")) {
            return true;
        } else {
            getMessageToEnableRegister().add("Email should be a TSU Email Account");
            return false;
        }
    }

    boolean checkPassword() {
        if (EightValuesOrAbove() && HasLetter() && HasNumber() && HasUnicode()) {
            return true;
        } else {
            if (!EightValuesOrAbove()) {
                getMessageToEnableRegister().add("Password must be 8 value length");
            }
            if (!HasLetter()) {
                getMessageToEnableRegister().add("Include a letter value");
            }
            if (!HasNumber()) {
                getMessageToEnableRegister().add("Include a number value");
            }
            if (!HasUnicode()) {
                getMessageToEnableRegister().add("Include a symbol value");
            }
            if (getPassword().isBlank()) {
                getMessageToEnableRegister().add("Need to fill password");
            }
            return false;
        }
    }

    boolean confirmPassword() {
        return getPassword().equals(getConfirmPass());
    }

    String checkRegistration() throws IOException {
        if (getUsername().isBlank() || getPassword().isBlank() || getConfirmPass().isBlank()) {
            return "Fill each field";
        } else {
            if (!confirmPassword()) {
                return "Password should match";
            } else {
                if (usernameExistsInExcel(getUsername())) {
                    return "Email already registered, Proceed to Login";
                } else {
                    if (checkPassword()) {
                        return "Registration Successful";
                    } else {
                        return "*" + getMessageToEnableRegister().toString();
                    }
                }
            }
        }
    }

    boolean usernameExistsInExcel(String username) throws IOException {
        try (FileInputStream file = new FileInputStream(path);
             Workbook workbook = new XSSFWorkbook(file)) {

            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                Sheet sheet = workbook.getSheetAt(i);
                if (sheet.getSheetName().equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

    void storeCredentials() throws IOException {
        try (FileInputStream file = new FileInputStream(path);
             Workbook workbook = new XSSFWorkbook(file)) {

            String username = getUsername();

            // Check if the username already exists in the workbook
            if (usernameExistsInExcel(username)) {
                // Username already registered, display an error message
                JOptionPane.showMessageDialog(null, "Username already registered. Please use a different username.");
                return;
            }

            Sheet sheet = workbook.createSheet(username);
            Row row = sheet.createRow(0);

            Cell usernameCell = row.createCell(0);
            usernameCell.setCellValue(username);

            Cell passwordCell = row.createCell(1);
            passwordCell.setCellValue(getPassword());

            try (FileOutputStream outFile = new FileOutputStream(path)) {
                workbook.write(outFile);
            }
        }
    }
}

