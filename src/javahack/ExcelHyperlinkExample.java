package javahack;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelHyperlinkExample {

    public static void main(String[] args) {
        // 1. Create a new workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Hyperlink Sheet");

        // 2. Create a row and cell
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Click me!");

        // 3. Use CreationHelper to create the hyperlink
        CreationHelper createHelper = workbook.getCreationHelper();
        Hyperlink hyperlink = createHelper.createHyperlink(HyperlinkType.URL);
        hyperlink.setAddress("https://www.google.com");

        // 4. Assign the hyperlink to the cell
        cell.setHyperlink(hyperlink);

        // Apply a blue color style to the hyperlink cell to make it more recognizable as a link
        CellStyle hlinkStyle = workbook.createCellStyle();
        Font hlinkFont = workbook.createFont();
        hlinkFont.setUnderline(Font.U_SINGLE);
        hlinkFont.setColor(IndexedColors.BLUE.getIndex());
        hlinkStyle.setFont(hlinkFont);
        cell.setCellStyle(hlinkStyle);

        // 5. Write the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("hyperlink_example.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

