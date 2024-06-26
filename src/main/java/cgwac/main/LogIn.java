package cgwac.main;

import cgwac.panels.ProfilePanel;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LogIn extends Register {
    private static final String FILE_PATH = "C:\\Programs\\JavaProjects\\NetbeansProjects\\student_data.xlsx";
    final int columnPassword = 1;
    final int columnUsername = 0; 

    public LogIn(String username, String password, String confirmPass) {
        super(username, password, confirmPass);
    }

   public String checkCredentials() throws IOException {
        boolean found = false;

        try (FileInputStream file = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(file)) {

            String username = getUsername();

            // Iterate through all sheet names
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                if (workbook.getSheetName(i).equalsIgnoreCase(username)) {
                    found = true;
                    ProfilePanel profile = new ProfilePanel(username);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e; // Re-throw the exception to inform the caller
        }

        return found ? "Successful." : "Unsuccessful.";
    }
}
