package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.entity.Affiliation;
import com.example.restfultutorialmysql.service.AffiliationServiceImpl;
import com.example.restfultutorialmysql.util.ExcelGeneratorUtility;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller_Affiliation {
    @Autowired
    AffiliationServiceImpl AffiliationService;
    @CrossOrigin(origins = "*")
    @GetMapping("/Affiliation")    
    public ResponseEntity<List<Affiliation>> getData(){
        return new ResponseEntity<List<Affiliation>>(AffiliationService.getAllData(), HttpStatus.OK);
    }
    @GetMapping("/excel")
    public void AffiliationDetailsReport(HttpServletResponse response) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String fileType = "attachment; filename=Affiliation_details_" + dateFormat.format(new Date()) + ".xls";
        response.setHeader("Content-Disposition", fileType);
        response.setContentType(MediaType.APPLICATION_OCTET_STREAM.getType());
        ExcelGeneratorUtility.AffiliationDetailReport(response, AffiliationService.getAllData());
    }
}
