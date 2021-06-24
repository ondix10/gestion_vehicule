package src;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class lectureFichier {

    private Sheet sheet;
    private Workbook workbook;



    public lectureFichier() throws IOException {
        FileInputStream inp = new FileInputStream(new File("C:/Users/Rémy Lionel Ondiyo/Documents/JeuDeDonneesDevoir.xlsx"));

        // Get the workbook instance for XLS file
        this.workbook = WorkbookFactory.create(inp);
        // Get first sheet from the workbook
        this.sheet = workbook.getSheetAt(0);
        // Get iterator to all the rows in current sheet
        Row rowIterator = (Row) sheet.rowIterator();

    }



    public void afficherLesCarateristiquesTrajet(){


        for (Row row:
                this.sheet) {

            for (Cell cell:
                 row) {
                CellType cellType = cell.getCellType();
                switch (cellType) {
                    case _NONE:
                        System.out.print("");
                        System.out.print("\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        System.out.print("\t");
                        break;
                    case BLANK:
                        System.out.print("");
                        System.out.print("\t");
                        break;
                    case FORMULA:
// Formula
                        System.out.print(cell.getCellFormula());
                        System.out.print("\t");
                        FormulaEvaluator evaluator = this.workbook.getCreationHelper().createFormulaEvaluator();
// Print out value evaluated by formula
                        System.out.print(evaluator.evaluate(cell).getNumberValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        System.out.print("\t");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        System.out.print("\t");
                        break;
                    case ERROR:
                        System.out.print("!");
                        System.out.print("\t");
                        break;
                }




            }

            System.out.println("");

        }


    }
}
