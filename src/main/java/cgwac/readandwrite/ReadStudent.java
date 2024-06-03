package cgwac.readandwrite;

import cgwac.encapsulation.Student;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadStudent {

    private static final String FILE_PATH = "C:/JavaProjects/NetbeansProjects/student_data.xlsx";

    public static Student retrieveStudentData(String username) {
        Student student = null;
        try (FileInputStream file = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(file)) {
            
            // Iterate through all sheets in the workbook
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                Sheet sheet = workbook.getSheetAt(i);

                // Check if the sheet name matches the provided email
                if (sheet.getSheetName().equalsIgnoreCase(username)) {
                    // Assuming the student data is in the first row of the matching sheet
                    Row row = sheet.getRow(1);
                    if (row != null) {
                        String studentID = row.getCell(0).getStringCellValue();
                        String firstName = row.getCell(1).getStringCellValue();
                        String lastName = row.getCell(2).getStringCellValue();
                        String birthdate = row.getCell(3).getStringCellValue();
                        String age = row.getCell(4).getStringCellValue();
                        String sex = row.getCell(5).getStringCellValue();
                        String studentNumber = row.getCell(6).getStringCellValue();
                        String yearLevel = row.getCell(7).getStringCellValue();
                        String college = row.getCell(8).getStringCellValue();
                        String major = row.getCell(9).getStringCellValue();
                        String organization = row.getCell(10).getStringCellValue();
                        String sports = row.getCell(11).getStringCellValue();
                        student = new Student(firstName, lastName, birthdate, age, sex, studentNumber, yearLevel, college, organization, major, sports, studentID);
                        return student;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }
}
