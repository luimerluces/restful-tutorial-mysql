package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.FormatReportdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import java.util.List;
public interface ReportPdfServices {
    ///////////////////////////P2P///////////////////////////////////////////////
    List<RpClientsdto> getAllAccumulatedClientsPDF_P2P(String Date);           
    List<FormatReportdto> getAllAprobadaTotalP2P(String Date);                   
    List<FormatReportdto> getAllRechazadaTotalP2P(String Date);               
}
