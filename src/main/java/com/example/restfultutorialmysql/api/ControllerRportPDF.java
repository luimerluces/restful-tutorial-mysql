package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.FormatReportdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.service.ReportPdfServicesImplc;
import com.example.restfultutorialmysql.util.PdfGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class ControllerRportPDF {    
    @Autowired
    ReportPdfServicesImplc reportPdfServices;    
    @CrossOrigin(origins = "*")   
    @GetMapping("/download/{dates}/{TipoProducto}")
    public void getdownloadClientsP2P(@PathVariable("dates") String Dates,@PathVariable("TipoProducto") String TipoProducto ,HttpServletResponse response) throws IOException {                                
        List<RpClientsdto> listRpClients=null;
        List<FormatReportdto> listReportAprobadaTotal=null;
        List<FormatReportdto> listReportRechazadaTotal=null;
        String TituloProducto="";
        /////////////////////////////////////////////////////////Cliente P2P-P2C///////////////////////////////////////////////////////////////////////////////////
        if (TipoProducto.equals("560001")) {             
             TituloProducto="P2P";
             listRpClients = reportPdfServices.getAllAccumulatedClientsPDF_P2P(Dates);
             listReportAprobadaTotal=reportPdfServices.getAllAprobadaTotalP2P(Dates);
             listReportRechazadaTotal=reportPdfServices.getAllRechazadaTotalP2P(Dates);;
        } else {
             TituloProducto="P2C";
             //listRpClients = reportPdfServices.getAllAccumulatedClientsPDF_P2C(Dates);
             //listReportAprobadaTotal=reportPdfServices.getAllAprobadaTotalP2C(Dates);;
             ///listReportRechazadaTotal=null;
        }
        PdfGenerator generator = new PdfGenerator();
        byte[] pdfReport = generator.getPDF(Dates,
                TituloProducto,
                listRpClients,
                listReportAprobadaTotal,
                listReportRechazadaTotal
        ).toByteArray();
        String mimeType =  "application/pdf";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", "reporte.pdf"));
        response.setContentLength(pdfReport.length);
        ByteArrayInputStream inStream = new ByteArrayInputStream( pdfReport);
        FileCopyUtils.copy(inStream, response.getOutputStream());
        }   
    }