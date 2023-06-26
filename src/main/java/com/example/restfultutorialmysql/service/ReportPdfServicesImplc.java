package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.FormatReportdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.repository.ReportPdfRepository;
import com.example.restfultutorialmysql.service.ReportPdfServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReportPdfServicesImplc implements ReportPdfServices{    
    @Autowired
    ReportPdfRepository reportPdfRepository;    
    /////////////////////////////////////P2P////////////////////////////////////////
    @Override
    public List<RpClientsdto> getAllAccumulatedClientsPDF_P2P(String Date) {
        return reportPdfRepository.getAllAccumulatedClientsPDF_P2P(Date);
    }    
    
    @Override
    public List<FormatReportdto> getAllAprobadaTotalP2P(String Date) {
        return reportPdfRepository.getAllAprobadaTotalP2P(Date);
    }    
    
    @Override
    public List<FormatReportdto> getAllRechazadaTotalP2P(String Date) {
        return reportPdfRepository.getAllRechazadaTotalP2P(Date);
    }
    
}
