package com.example.restfultutorialmysql.util;

import com.example.restfultutorialmysql.dto.FormatReportdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.service.ReportPdfServicesImplc;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
public class PdfGenerator {
    public double TotalAfiliados=0;
    public double TotalDesafialiados=0;    
    public double TotalClientes=0;    
    public double AprobadaTotalBs=0;    
    public int TotalRegistroAprobadas=0;    
    String patron = "#,###.##";
    public ByteArrayOutputStream getPDF(String Date, String TituloProducto,
            List<RpClientsdto> listRpClients,
            List<FormatReportdto>listReportAprobadaTotal,
            List<FormatReportdto>listReportRechazadaTotal
    ) {        
        DecimalFormat formato = new DecimalFormat(patron);                  
        
        for (RpClientsdto clients : listRpClients) {            
            if (clients.getDescription().equals("DESAFILIADOS")){
                TotalDesafialiados=Double.valueOf(clients.getNumRegister());
            }else{
                TotalAfiliados=Double.valueOf(clients.getNumRegister());    
            }                        
        }
        TotalClientes=TotalAfiliados+TotalDesafialiados;
        
        for (FormatReportdto AprobadaTotal : listReportAprobadaTotal) {            
            AprobadaTotalBs=Double.valueOf(AprobadaTotal.getAmountBs());
            TotalRegistroAprobadas=Integer.valueOf(AprobadaTotal.getNumRegister());
        }
        
        // Creamos la instancia de memoria en la que se escribirá el archivo temporalmente                
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {                        
            Document document = new Document(PageSize.A4);
            Paragraph titulo = new Paragraph("REPORTE ESTADISTICOS "+TituloProducto+" DEL "+Date+"",FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK));
            titulo.setAlignment(Element.ALIGN_CENTER);
            Paragraph tituloHeader = new Paragraph("REPORTE ESTADISTICOS "+ TituloProducto +" DESDE LAS 00:00:00 HASTA 16:00:00",FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK));
            tituloHeader.setAlignment(Element.ALIGN_CENTER);
            
            
            PdfWriter.getInstance(document, bos);
            document.open();
            document.add(titulo);
            document.add(tituloHeader);
            int NumColumns = 1;
            PdfPTable datatable = new PdfPTable(NumColumns);
            datatable.getDefaultCell().setPadding(1);
            datatable.getDefaultCell().setBorderWidth(1);
            datatable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

            PdfPCell header = new PdfPCell();            
            PdfPCell headerCliAFi = new PdfPCell();
            PdfPCell headerCliDes = new PdfPCell();
            PdfPCell headerCliTot = new PdfPCell();
            
            Font headFont = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            Font headFontCliente = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.WHITE);
            Font headFontClienteDetalles = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            
            header.setBackgroundColor(BaseColor.WHITE);
            header.setHorizontalAlignment(Element.ALIGN_CENTER);
            header.setPhrase(new Phrase("TRANSACCIONES DE P2P DESDE LAS 00:00:00 HASTA LAS 16:00:00", headFont));
            header.setPadding(2);
            header.setBorderWidth(0);
            header.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell headerClientes = new PdfPCell();
            headerClientes.setBackgroundColor(BaseColor.GRAY);
            headerClientes.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerClientes.setPhrase(new Phrase("TOTAL DE CLIENTES P2P", headFontCliente));
            headerClientes.setPadding(2);
            headerClientes.setBorderWidth(1);
            headerClientes.setHorizontalAlignment(Element.ALIGN_CENTER);            
            
            PdfPCell headerTranPorCanal = new PdfPCell();
            headerTranPorCanal.setBackgroundColor(BaseColor.GRAY);
            headerTranPorCanal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTranPorCanal.setPhrase(new Phrase("TOTAL TRANSACCIONES POR CANALES", headFontCliente));
            headerTranPorCanal.setPadding(2);
            headerTranPorCanal.setBorderWidth(1);
            headerTranPorCanal.setHorizontalAlignment(Element.ALIGN_CENTER);                     
            
            
            
            
            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            datatable.setHeaderRows(1); // this is the end of the table header
            datatable.getDefaultCell().setBorderWidth(1);

            datatable.addCell(headerClientes);
            datatable.setHeaderRows(1); // this is the end of the table header
            datatable.getDefaultCell().setBorderWidth(1);

            SCPdfPTable table = new PdfPTable(3);
            headerCliAFi.setBackgroundColor(new BaseColor(215, 219, 221));
            headerCliAFi.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCliAFi.setPhrase(new Phrase("Afiliados: "+formato.format(TotalAfiliados)+"", headFontClienteDetalles));
            headerCliAFi.setPadding(2);
            headerCliAFi.setBorderWidth(1);
            headerCliAFi.setHorizontalAlignment(Element.ALIGN_CENTER);

            headerCliDes.setBackgroundColor(new BaseColor(215, 219, 221));
            headerCliDes.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCliDes.setPhrase(new Phrase("Desafiliados: "+formato.format(TotalDesafialiados)+"", headFontClienteDetalles));
            headerCliDes.setPadding(2);
            headerCliDes.setBorderWidth(1);
            headerCliDes.setHorizontalAlignment(Element.ALIGN_CENTER);

            headerCliTot.setBackgroundColor(new BaseColor(215, 219, 221));
            headerCliTot.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCliTot.setPhrase(new Phrase("Total: "+formato.format(TotalClientes)+"", headFontClienteDetalles));
            headerCliTot.setPadding(2);
            headerCliTot.setBorderWidth(1);
            headerCliTot.setHorizontalAlignment(Element.ALIGN_CENTER);

            table.addCell(headerCliAFi);
            table.addCell(headerCliDes);
            table.addCell(headerCliTot);
            
            PdfPTable table2Cliente = new PdfPTable(1);
            table2Cliente.addCell(headerClientes);
            
            
            PdfPTable table3 = new PdfPTable(1);
            PdfPCell header3 = new PdfPCell();
            PdfPCell header4 = new PdfPCell();
            PdfPCell header5 = new PdfPCell();            
            
            headerClientes.setBackgroundColor(BaseColor.GRAY);
            headerClientes.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerClientes.setPhrase(new Phrase("TOTAL TRANSACCIONES POR CANALES:", headFontCliente));
            headerClientes.setPadding(2);
            headerClientes.setBorderWidth(1);
            headerClientes.setHorizontalAlignment(Element.ALIGN_CENTER);            
            
            header4.setBackgroundColor(BaseColor.GRAY);
            header4.setHorizontalAlignment(Element.ALIGN_CENTER);
            header4.setPhrase(new Phrase("TOTAL TRANSACCIONES POR CANALES:", headFontCliente));
            header4.setPadding(2);
            header4.setBorderWidth(1);
            header4.setHorizontalAlignment(Element.ALIGN_CENTER);            
            
            header5.setBackgroundColor(BaseColor.GRAY);
            header5.setHorizontalAlignment(Element.ALIGN_CENTER);
            header5.setPhrase(new Phrase("APROBADAS:", headFontCliente));
            header5.setPadding(2);
            header5.setBorderWidth(1);
            header5.setHorizontalAlignment(Element.ALIGN_CENTER);            
            
            table3.addCell(header4);
            table3.addCell(header5);



            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //document.add(datatable);
            document.add(header);
            document.add(new Paragraph(" "));
            document.add(table2Cliente);
            document.add(table);
            document.add(new Paragraph(" "));
            document.add(table3);
            document.add(table);            
            document.add(table3);
            document.add(table);
            document.close();
            return bos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
