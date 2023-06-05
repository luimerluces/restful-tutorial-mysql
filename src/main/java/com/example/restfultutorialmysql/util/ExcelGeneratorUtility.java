package com.example.restfultutorialmysql.util;
import com.example.restfultutorialmysql.entity.Affiliation;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
public class ExcelGeneratorUtility {
    public static void AffiliationDetailReport(HttpServletResponse response, List<Affiliation> affiliations) {
        try(Workbook workbook = new XSSFWorkbook()){
            Sheet sheet = workbook.createSheet("Affiliation");
            CellStyle cellStyle = workbook.createCellStyle();
            //set border to table
            cellStyle.setBorderTop(BorderStyle.MEDIUM);
            cellStyle.setBorderRight(BorderStyle.MEDIUM);
            cellStyle.setBorderBottom(BorderStyle.MEDIUM);
            cellStyle.setBorderLeft(BorderStyle.MEDIUM);
            cellStyle.setAlignment(HorizontalAlignment.LEFT);


            // Header
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("PRODUCT_CODE");
            cell.setCellStyle(cellStyle);


            Cell cell1 = row.createCell(1);
            cell1.setCellValue("TELEPHONE");
            cell1.setCellStyle(cellStyle);


            Cell cell2 = row.createCell(2);
            cell2.setCellValue("TYPE_CUSTOMER");
            cell2.setCellStyle(cellStyle);
            
            Cell cell3 = row.createCell(3);
            cell3.setCellValue("CUSTOMER");
            cell3.setCellStyle(cellStyle);
            
            Cell cell4 = row.createCell(4);
            cell4.setCellValue("INSTRUMENT");
            cell4.setCellStyle(cellStyle);
            
            Cell cell5 = row.createCell(5);
            cell5.setCellValue("INSTRUMENT");
            cell5.setCellStyle(cellStyle);
                        
            Cell cell6 = row.createCell(6);
            cell6.setCellValue("AMOUNT_LIMIT_DAILY");
            cell6.setCellStyle(cellStyle);
            
            Cell cell7 = row.createCell(7);
            cell7.setCellValue("AMOUNT_MAX_TRANS_SMS");
            cell7.setCellStyle(cellStyle);
            
            Cell cell8 = row.createCell(8);
            cell8.setCellValue("AMOUNT_MIN_TRANS_SMS");
            cell8.setCellStyle(cellStyle);
            
            Cell cell9 = row.createCell(9);
            cell9.setCellValue("COUNT_TRANS");
            cell9.setCellStyle(cellStyle);            
            
            Cell cell10 = row.createCell(10);
            cell10.setCellValue("COUNT_AMOUNT");
            cell10.setCellStyle(cellStyle);
            
            Cell cell11 = row.createCell(11);
            cell11.setCellValue("STATUS");
            cell11.setCellStyle(cellStyle);
            
            Cell cell12 = row.createCell(12);
            cell12.setCellValue("CREATED_AT");
            cell12.setCellStyle(cellStyle);
            
            Cell cell13 = row.createCell(13);
            cell13.setCellValue("UPDATED_AT");
            cell13.setCellStyle(cellStyle);
            
            //Set data
            int rowNum = 1;
            for (Affiliation af : affiliations) {
                Row empDataRow = sheet.createRow(rowNum++);
                Cell Product_codeCell = empDataRow.createCell(0);
                Product_codeCell.setCellStyle(cellStyle);
                Product_codeCell.setCellValue(af.getProduct_code());

                Cell TelephoneCell = empDataRow.createCell(1);
                TelephoneCell.setCellStyle(cellStyle);
                TelephoneCell.setCellValue(af.getTelephone());

                Cell Type_customerCell = empDataRow.createCell(2);
                Type_customerCell.setCellStyle(cellStyle);
                Type_customerCell.setCellValue(af.getType_customer());
                
                Cell CustomerCell = empDataRow.createCell(3);
                CustomerCell.setCellStyle(cellStyle);
                CustomerCell.setCellValue(af.getCustomer());
                
                Cell InstrumentCell = empDataRow.createCell(4);
                InstrumentCell.setCellStyle(cellStyle);
                InstrumentCell.setCellValue(af.getInstrument());
                
                Cell Trans_limit_dailyCell = empDataRow.createCell(5);
                Trans_limit_dailyCell.setCellStyle(cellStyle);
                Trans_limit_dailyCell.setCellValue(af.getTrans_limit_daily());
                
                Cell Amount_limit_dailyCell = empDataRow.createCell(6);
                Amount_limit_dailyCell.setCellStyle(cellStyle);
                Amount_limit_dailyCell.setCellValue(af.getAmount_limit_daily());
                
                Cell Amount_max_trans_smsCell = empDataRow.createCell(7);
                Amount_max_trans_smsCell.setCellStyle(cellStyle);
                Amount_max_trans_smsCell.setCellValue(af.getAmount_max_trans_sms());
                
                Cell Amount_min_trans_smsCell = empDataRow.createCell(8);
                Amount_min_trans_smsCell.setCellStyle(cellStyle);
                Amount_min_trans_smsCell.setCellValue(af.getAmount_min_trans_sms());                
                
                Cell Count_TransCell = empDataRow.createCell(9);
                Count_TransCell.setCellStyle(cellStyle);
                Count_TransCell.setCellValue(af.getCount_Trans());
                
                Cell Count_AmountCell = empDataRow.createCell(10);
                Count_AmountCell.setCellStyle(cellStyle);
                Count_AmountCell.setCellValue(af.getCount_Amount());
                
                Cell StatusCell = empDataRow.createCell(11);
                StatusCell.setCellStyle(cellStyle);
                StatusCell.setCellValue(af.getStatus());
                
                Cell Created_atCell = empDataRow.createCell(12);
                Created_atCell.setCellStyle(cellStyle);
                Created_atCell.setCellValue(af.getCreated_at());
                
                
                Cell Updated_atCell = empDataRow.createCell(13);
                Updated_atCell.setCellStyle(cellStyle);
                Updated_atCell.setCellValue(af.getUpdated_at());
                
            }

            //write output to response
            workbook.write(response.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
