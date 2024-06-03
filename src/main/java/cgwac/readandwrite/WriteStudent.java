package cgwac.readandwrite;

import cgwac.encapsulation.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteStudent {

    private static final String FILE_PATH = "C:\\JavaProjects\\NetbeansProjects\\student_data.xlsx";

    public static void writeStudentToExcel(Student student, String username) {
    XSSFWorkbook workbook = null;
    try {
        // Create Workbook if not exist
        if (!new File(FILE_PATH).exists()) {
            workbook = new XSSFWorkbook();
        } else {
            workbook = new XSSFWorkbook(new FileInputStream(FILE_PATH));
        }

        boolean sheetExists = false;
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            if (workbook.getSheetName(i).equals(username)) {
                sheetExists = true;
                break;
            }
        }

        // If the sheet doesn't exist, alert the user and return
        if (!sheetExists) {
            JOptionPane.showMessageDialog(null, "Username does not match any existing sheets.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get or create the sheet corresponding to the username
        XSSFSheet sheet = workbook.getSheet(username);

        // Get the last row number
        int rowNum = sheet.getLastRowNum() + 1;

        // Create a new row
        Row row = sheet.createRow(rowNum);

        // Write student data to the row
        writeCell(row, 0, student.getStudentID());
        writeCell(row, 1, student.getStudentFirstName());
        writeCell(row, 2, student.getStudentLastName());
        writeCell(row, 3, student.getBirthDate());
        writeCell(row, 4, student.getAge());
        writeCell(row, 5, student.getSex());
        writeCell(row, 6, student.getStudentNumber());
        writeCell(row, 7, student.getYearLevel());
        writeCell(row, 8, student.getCollege());
        writeCell(row, 9, student.getMajor());
        writeCell(row, 10, student.getOrganization());
        writeCell(row, 11, student.getSports());

        // Save the workbook to a file
        try (FileOutputStream outputStream = new FileOutputStream(FILE_PATH)) {
            workbook.write(outputStream);
        }

        System.out.println("Student data written successfully to Excel file.");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (workbook != null) {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


    private static void writeCell(Row row, int column, String value) {
        Cell cell = row.createCell(column);
        cell.setCellValue(value);
    }
}