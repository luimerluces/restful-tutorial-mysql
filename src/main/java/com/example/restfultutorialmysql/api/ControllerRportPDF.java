package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.util.PdfGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class ControllerRportPDF {    
    @CrossOrigin(origins = "*")   
    @GetMapping("/download/{dates}/{time}")
    public void getdownloadClientsP2P(@PathVariable("dates") String Dates,@PathVariable("time") String Time,HttpServletResponse response) throws IOException {
        PdfGenerator generator = new PdfGenerator();
        byte[] pdfReport = generator.getPDF(Dates,Time).toByteArray();
        String mimeType =  "application/pdf";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", "reporte.pdf"));
        response.setContentLength(pdfReport.length);
        ByteArrayInputStream inStream = new ByteArrayInputStream( pdfReport);
        FileCopyUtils.copy(inStream, response.getOutputStream());
        }   
    }

