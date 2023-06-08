package com.example.restfultutorialmysql.util;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
public class PdfGenerator {
    public ByteArrayOutputStream getPDF(String Date, String Time) {
        // Creamos la instancia de memoria en la que se escribirá el archivo temporalmente
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            Document document = new Document(PageSize.A4);
            Paragraph titulo = new Paragraph("REPORTE ESTADISTICOS P2P DEL 2023-05-02 \n\n",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            titulo.setAlignment(Element.ALIGN_CENTER);            
            Paragraph tituloHeader = new Paragraph("REPORTE ESTADISTICOS P2P DESDE LAS 00:00:00 HASTA 08:00:00 \n\n",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            tituloHeader.setAlignment(Element.ALIGN_CENTER);
            
            Paragraph tituloHeaderCanal05 = new Paragraph("CANAL 05",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            tituloHeaderCanal05.setAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph tituloHeaderCanal14 = new Paragraph("CANAL 14",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            tituloHeaderCanal14.setAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph tituloHeaderCanal54 = new Paragraph("CANAL 54",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            tituloHeaderCanal54.setAlignment(Element.ALIGN_CENTER);
            
            Paragraph tituloLinea = new Paragraph("______________________________________________________________________________________________",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            tituloLinea.setAlignment(Element.ALIGN_CENTER);
            
            
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
            PdfPCell headerClientes = new PdfPCell();
            PdfPCell headerCliAFi = new PdfPCell();
            PdfPCell headerCliDes = new PdfPCell();
            PdfPCell headerCliTot = new PdfPCell();
            PdfPCell headerTranPorCanal = new PdfPCell();            
            PdfPCell headerTCApro = new PdfPCell();
            PdfPCell headerTCRE = new PdfPCell();                        
            PdfPCell headerTC = new PdfPCell();                        
            
            PdfPCell headerTCAproInternas = new PdfPCell();
            PdfPCell headerTCREInternas = new PdfPCell();                        
            PdfPCell headerTCInternas = new PdfPCell();                        
            
            PdfPCell headerC05 = new PdfPCell();                        
            PdfPCell headerC05Internas = new PdfPCell(); 
            PdfPCell headerC05InteBancarias = new PdfPCell(); 
            
            PdfPCell headerC14SMS = new PdfPCell(); 
            PdfPCell headerC14SMSAprobadas = new PdfPCell();
            PdfPCell headerC14SMSRechazadas = new PdfPCell();                        
            PdfPCell headerC14SMSTotal = new PdfPCell();  
            
            PdfPCell headerC14SMSInternas = new PdfPCell(); 
            PdfPCell headerC14SMSInternasAprobadas = new PdfPCell();
            PdfPCell headerC14SMSInternasRechazadas = new PdfPCell();                        
            PdfPCell headerC14SMSInternasTotal = new PdfPCell(); 
            
            PdfPCell headerC14SMSInterBancarias = new PdfPCell(); 
            PdfPCell headerC14SMSInterBancariasAprobadas = new PdfPCell();
            PdfPCell headerC14SMSInterBancariasRechazadas = new PdfPCell();                        
            PdfPCell headerC14SMSInterBancariasTotal = new PdfPCell(); 
            
            PdfPCell headerC54BDVDigital = new PdfPCell();   
            PdfPCell headerC54BDVDigitalAprobadas = new PdfPCell();
            PdfPCell headerC54BDVDigitalRechazadas = new PdfPCell();                        
            PdfPCell headerC54BDVDigitalTotal = new PdfPCell();  
            
            PdfPCell headerC54BDVDigitalInternas = new PdfPCell(); 
            PdfPCell headerC54BDVDigitalInternasAprobadas = new PdfPCell();
            PdfPCell headerC54BDVDigitalInternasRechazadas = new PdfPCell();                        
            PdfPCell headerC54BDVDigitalInternasTotal = new PdfPCell();  
            
            PdfPCell headerC54BDVDigitalInterBancarias = new PdfPCell(); 
            PdfPCell headerC54BDVDigitalInterBancariasAprobadas = new PdfPCell();
            PdfPCell headerC54BDVDigitalInterBancariasRechazadas = new PdfPCell();                        
            PdfPCell headerC54BDVDigitalInterBancariasTotal = new PdfPCell();  
            
            
            PdfPCell headertableC05InternasDetalleAprobadas = new PdfPCell();                        
            PdfPCell headertableC05InternasDetalleReprobadas = new PdfPCell();                        
            PdfPCell headertableC05InternasDetalleTotal = new PdfPCell();                        

            Font headFont = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            Font headFontCliente = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.WHITE);
            Font headFontClienteDetalles = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            Font headC05 = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.WHITE);
            Font headC14 = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.WHITE);
            Font headC54 = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.WHITE);
            
            header.setBackgroundColor(BaseColor.WHITE);
            header.setHorizontalAlignment(Element.ALIGN_CENTER);
            header.setPhrase(new Phrase("TRANSACCIONES DE P2P DESDE LAS 00:00:00 HASTA LAS 08:54:01", headFont));
            header.setPadding(2);
            header.setBorderWidth(0);
            header.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerClientes.setBackgroundColor(BaseColor.GRAY);
            headerClientes.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerClientes.setPhrase(new Phrase("TOTAL DE CLIENTES P2P", headFontCliente));
            headerClientes.setPadding(2);
            headerClientes.setBorderWidth(1);
            headerClientes.setHorizontalAlignment(Element.ALIGN_CENTER);            
            
            headerTranPorCanal.setBackgroundColor(BaseColor.GRAY);
            headerTranPorCanal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTranPorCanal.setPhrase(new Phrase("TOTAL GENERAL TRANSACCIONES POR CANALES:", headFontCliente));
            headerTranPorCanal.setPadding(2);
            headerTranPorCanal.setBorderWidth(1);
            headerTranPorCanal.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerCliAFi.setBackgroundColor(new BaseColor(215,219,221));
            headerCliAFi.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCliAFi.setPhrase(new Phrase("AFILIADOS:", headFontClienteDetalles));
            headerCliAFi.setPadding(2);
            headerCliAFi.setBorderWidth(1);
            headerCliAFi.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerCliDes.setBackgroundColor(new BaseColor(215,219,221));
            headerCliDes.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCliDes.setPhrase(new Phrase("DESAFILIADOS:", headFontClienteDetalles));
            headerCliDes.setPadding(2);
            headerCliDes.setBorderWidth(1);
            headerCliDes.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerCliTot.setBackgroundColor(new BaseColor(215,219,221));
            headerCliTot.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCliTot.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerCliTot.setPadding(2);
            headerCliTot.setBorderWidth(1);
            headerCliTot.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerTCApro.setBackgroundColor(new BaseColor(215,219,221));
            headerTCApro.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTCApro.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerTCApro.setPadding(2);
            headerTCApro.setBorderWidth(1);
            headerTCApro.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerTCRE.setBackgroundColor(new BaseColor(215,219,221));
            headerTCRE.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTCRE.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerTCRE.setPadding(2);
            headerTCRE.setBorderWidth(1);
            headerTCRE.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerTC.setBackgroundColor(new BaseColor(215,219,221));
            headerTC.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTC.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerTC.setPadding(2);
            headerTC.setBorderWidth(1);
            headerTC.setHorizontalAlignment(Element.ALIGN_CENTER);
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            headerTCAproInternas.setBackgroundColor(new BaseColor(215,219,221));
            headerTCAproInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTCAproInternas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerTCAproInternas.setPadding(2);
            headerTCAproInternas.setBorderWidth(1);
            headerTCAproInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerTCREInternas.setBackgroundColor(new BaseColor(215,219,221));
            headerTCREInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTCREInternas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerTCREInternas.setPadding(2);
            headerTCREInternas.setBorderWidth(1);
            headerTCREInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerTCInternas.setBackgroundColor(new BaseColor(215,219,221));
            headerTCInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerTCInternas.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerTCInternas.setPadding(2);
            headerTCInternas.setBorderWidth(1);
            headerTCInternas.setHorizontalAlignment(Element.ALIGN_CENTER);            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            
            headerC14SMSAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerC14SMSAprobadas.setPadding(2);
            headerC14SMSAprobadas.setBorderWidth(1);
            headerC14SMSAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSRechazadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSRechazadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerC14SMSRechazadas.setPadding(2);
            headerC14SMSRechazadas.setBorderWidth(1);
            headerC14SMSRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSTotal.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerC14SMSTotal.setPadding(2);
            headerC14SMSTotal.setBorderWidth(1);
            headerC14SMSTotal.setHorizontalAlignment(Element.ALIGN_CENTER);            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            headerC14SMSInternasAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSInternasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInternasAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerC14SMSInternasAprobadas.setPadding(2);
            headerC14SMSInternasAprobadas.setBorderWidth(1);
            headerC14SMSInternasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSInternasRechazadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSInternasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInternasRechazadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerC14SMSInternasRechazadas.setPadding(2);
            headerC14SMSInternasRechazadas.setBorderWidth(1);
            headerC14SMSInternasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSInternasTotal.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSInternasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInternasTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerC14SMSInternasTotal.setPadding(2);
            headerC14SMSInternasTotal.setBorderWidth(1);
            headerC14SMSInternasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            headerC14SMSInterBancariasAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSInterBancariasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInterBancariasAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerC14SMSInterBancariasAprobadas.setPadding(2);
            headerC14SMSInterBancariasAprobadas.setBorderWidth(1);
            headerC14SMSInterBancariasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSInterBancariasRechazadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSInterBancariasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInterBancariasRechazadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerC14SMSInterBancariasRechazadas.setPadding(2);
            headerC14SMSInterBancariasRechazadas.setBorderWidth(1);
            headerC14SMSInterBancariasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSInterBancariasTotal.setBackgroundColor(new BaseColor(215,219,221));
            headerC14SMSInterBancariasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInterBancariasTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerC14SMSInterBancariasTotal.setPadding(2);
            headerC14SMSInterBancariasTotal.setBorderWidth(1);
            headerC14SMSInterBancariasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            headerC54BDVDigitalAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerC54BDVDigitalAprobadas.setPadding(2);
            headerC54BDVDigitalAprobadas.setBorderWidth(1);
            headerC54BDVDigitalAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalRechazadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalRechazadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerC54BDVDigitalRechazadas.setPadding(2);
            headerC54BDVDigitalRechazadas.setBorderWidth(1);
            headerC54BDVDigitalRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalTotal.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerC54BDVDigitalTotal.setPadding(2);
            headerC54BDVDigitalTotal.setBorderWidth(1);
            headerC54BDVDigitalTotal.setHorizontalAlignment(Element.ALIGN_CENTER);            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            headerC54BDVDigitalInternasAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalInternasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInternasAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerC54BDVDigitalInternasAprobadas.setPadding(2);
            headerC54BDVDigitalInternasAprobadas.setBorderWidth(1);
            headerC54BDVDigitalInternasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalInternasRechazadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalInternasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInternasRechazadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerC54BDVDigitalInternasRechazadas.setPadding(2);
            headerC54BDVDigitalInternasRechazadas.setBorderWidth(1);
            headerC54BDVDigitalInternasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalInternasTotal.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalInternasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInternasTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerC54BDVDigitalInternasTotal.setPadding(2);
            headerC54BDVDigitalInternasTotal.setBorderWidth(1);
            headerC54BDVDigitalInternasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            headerC54BDVDigitalInterBancariasAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalInterBancariasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInterBancariasAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headerC54BDVDigitalInterBancariasAprobadas.setPadding(2);
            headerC54BDVDigitalInterBancariasAprobadas.setBorderWidth(1);
            headerC54BDVDigitalInterBancariasAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalInterBancariasRechazadas.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalInterBancariasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInterBancariasRechazadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headerC54BDVDigitalInterBancariasRechazadas.setPadding(2);
            headerC54BDVDigitalInterBancariasRechazadas.setBorderWidth(1);
            headerC54BDVDigitalInterBancariasRechazadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalInterBancariasTotal.setBackgroundColor(new BaseColor(215,219,221));
            headerC54BDVDigitalInterBancariasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInterBancariasTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headerC54BDVDigitalInterBancariasTotal.setPadding(2);
            headerC54BDVDigitalInterBancariasTotal.setBorderWidth(1);
            headerC54BDVDigitalInterBancariasTotal.setHorizontalAlignment(Element.ALIGN_CENTER);            
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            headertableC05InternasDetalleAprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headertableC05InternasDetalleAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headertableC05InternasDetalleAprobadas.setPhrase(new Phrase("APROBADAS:", headFontClienteDetalles));
            headertableC05InternasDetalleAprobadas.setPadding(2);
            headertableC05InternasDetalleAprobadas.setBorderWidth(1);
            headertableC05InternasDetalleAprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headertableC05InternasDetalleReprobadas.setBackgroundColor(new BaseColor(215,219,221));
            headertableC05InternasDetalleReprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headertableC05InternasDetalleReprobadas.setPhrase(new Phrase("RECHAZADAS:", headFontClienteDetalles));
            headertableC05InternasDetalleReprobadas.setPadding(2);
            headertableC05InternasDetalleReprobadas.setBorderWidth(1);
            headertableC05InternasDetalleReprobadas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headertableC05InternasDetalleTotal.setBackgroundColor(new BaseColor(215,219,221));
            headertableC05InternasDetalleTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            headertableC05InternasDetalleTotal.setPhrase(new Phrase("TOTAL:", headFontClienteDetalles));
            headertableC05InternasDetalleTotal.setPadding(2);
            headertableC05InternasDetalleTotal.setBorderWidth(1);
            headertableC05InternasDetalleTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            headerC05.setBackgroundColor(BaseColor.GRAY);
            headerC05.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC05.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 05 BDVenLinea:", headC05));
            headerC05.setPadding(2);
            headerC05.setBorderWidth(1);
            headerC05.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            headerC05Internas.setBackgroundColor(BaseColor.GRAY);
            headerC05Internas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC05Internas.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 05 BDVenLinea INTERNAS:", headC05));
            headerC05Internas.setPadding(2);
            headerC05Internas.setBorderWidth(1);
            headerC05Internas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC05InteBancarias.setBackgroundColor(BaseColor.GRAY);
            headerC05InteBancarias.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC05InteBancarias.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 05 BDVenLinea INTERBANCARIAS:", headC05));
            headerC05InteBancarias.setPadding(2);
            headerC05InteBancarias.setBorderWidth(1);
            headerC05InteBancarias.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            headerC14SMS.setBackgroundColor(BaseColor.GRAY);
            headerC14SMS.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMS.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 14 SMS:", headC14));
            headerC14SMS.setPadding(2);
            headerC14SMS.setBorderWidth(1);
            headerC14SMS.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSInternas.setBackgroundColor(BaseColor.GRAY);
            headerC14SMSInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInternas.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 14 SMS INTERNAS:", headC14));
            headerC14SMSInternas.setPadding(2);
            headerC14SMSInternas.setBorderWidth(1);
            headerC14SMSInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC14SMSInterBancarias.setBackgroundColor(BaseColor.GRAY);
            headerC14SMSInterBancarias.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC14SMSInterBancarias.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 14 SMS INTERBANCARIAS:", headC14));
            headerC14SMSInterBancarias.setPadding(2);
            headerC14SMSInterBancarias.setBorderWidth(1);
            headerC14SMSInterBancarias.setHorizontalAlignment(Element.ALIGN_CENTER);            
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            headerC54BDVDigital.setBackgroundColor(BaseColor.GRAY);
            headerC54BDVDigital.setBackgroundColor(BaseColor.GRAY);
            headerC54BDVDigital.setHorizontalAlignment(Element.ALIGN_CENTER);            
            headerC54BDVDigital.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 54 BDVDigital:", headC54));
            headerC54BDVDigital.setPadding(2);
            headerC54BDVDigital.setBorderWidth(1);
            headerC54BDVDigital.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            headerC54BDVDigitalInternas.setBackgroundColor(BaseColor.GRAY);
            headerC54BDVDigitalInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInternas.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 54 BDVDigital INTERNAS:", headC54));
            headerC54BDVDigitalInternas.setPadding(2);
            headerC54BDVDigitalInternas.setBorderWidth(1);
            headerC54BDVDigitalInternas.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            headerC54BDVDigitalInterBancarias.setBackgroundColor(BaseColor.GRAY);
            headerC54BDVDigitalInterBancarias.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerC54BDVDigitalInterBancarias.setPhrase(new Phrase("RESUMEN TRANSACCIONES CANAL 54 BDVDigital INTERBANCARIAS:", headC54));
            headerC54BDVDigitalInterBancarias.setPadding(2);
            headerC54BDVDigitalInterBancarias.setBorderWidth(1);
            headerC54BDVDigitalInterBancarias.setHorizontalAlignment(Element.ALIGN_CENTER);                         
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                    datatable.addCell(header);
            datatable.setHeaderRows(1); // this is the end of the table header
            datatable.getDefaultCell().setBorderWidth(1);            
                                   
            datatable.addCell(headerClientes);
            datatable.setHeaderRows(1); // this is the end of the table header
            datatable.getDefaultCell().setBorderWidth(1);
            

            PdfPTable table = new PdfPTable(3);            
            table.addCell(headerCliAFi);            
            table.addCell(headerCliDes);            
            table.addCell(headerCliTot);            
            
            PdfPTable tableTransPorCanales = new PdfPTable(3);            
            tableTransPorCanales.addCell(headerTCApro);            
            tableTransPorCanales.addCell(headerTCRE);            
            tableTransPorCanales.addCell(headerTC);                        
            
            
            PdfPTable tableTransPorCanalesInternas = new PdfPTable(3);            
            tableTransPorCanalesInternas.addCell(headerTCAproInternas);            
            tableTransPorCanalesInternas.addCell(headerTCREInternas);            
            tableTransPorCanalesInternas.addCell(headerTCInternas);                        
            
            PdfPTable table2Cliente = new PdfPTable(1);            
            table2Cliente.addCell(headerClientes);            
            
            
            PdfPTable table2 = new PdfPTable(1);            
            table2.addCell(headerTranPorCanal);            
            
            PdfPTable tableC05 = new PdfPTable(1);            
            tableC05.addCell(headerC05);                        
            
            PdfPTable tableC05Internas = new PdfPTable(1);            
            tableC05Internas.addCell(headerC05Internas);
            
            PdfPTable tableC05InteBancarias = new PdfPTable(1);            
            tableC05InteBancarias.addCell(headerC05InteBancarias);
            
            PdfPTable tableC05InternasDetalle = new PdfPTable(3);            
            tableC05InternasDetalle.addCell(headertableC05InternasDetalleAprobadas);            
            tableC05InternasDetalle.addCell(headertableC05InternasDetalleReprobadas);            
            tableC05InternasDetalle.addCell(headertableC05InternasDetalleTotal); 
            
            PdfPTable tableC14 = new PdfPTable(1);            
            tableC14.addCell(headerC14SMS);                        
            
            PdfPTable tableC14Internas = new PdfPTable(1);            
            tableC14Internas.addCell(headerC14SMSInternas);
            
            PdfPTable tableC14InteBancarias = new PdfPTable(1);            
            tableC14InteBancarias.addCell(headerC14SMSInterBancarias);
            
            PdfPTable tableC14Detalle = new PdfPTable(3);            
            tableC14Detalle.addCell(headerC14SMSAprobadas);              
            tableC14Detalle.addCell(headerC14SMSRechazadas);     
            tableC14Detalle.addCell(headerC14SMSTotal);
            
            PdfPTable tableC14InternasDetalle = new PdfPTable(3);            
            tableC14InternasDetalle.addCell(headerC14SMSInternasAprobadas); 
            tableC14InternasDetalle.addCell(headerC14SMSInternasRechazadas);
            tableC14InternasDetalle.addCell(headerC14SMSInternasTotal);
            
            PdfPTable tableC14InterBancariasDetalle = new PdfPTable(3);            
            tableC14InterBancariasDetalle.addCell(headerC14SMSInterBancariasAprobadas); 
            tableC14InterBancariasDetalle.addCell(headerC14SMSInterBancariasRechazadas);
            tableC14InterBancariasDetalle.addCell(headerC14SMSInterBancariasTotal);
            
            PdfPTable tableC54 = new PdfPTable(1);            
            tableC54.addCell(headerC54BDVDigital);                        
            
            PdfPTable tableC54Internas = new PdfPTable(1);            
            tableC54Internas.addCell(headerC54BDVDigitalInternas);
            
            PdfPTable tableC54InteBancarias = new PdfPTable(1);            
            tableC54InteBancarias.addCell(headerC54BDVDigitalInterBancarias);
            
            PdfPTable tableC54Detalle = new PdfPTable(3);            
            tableC54Detalle.addCell(headerC54BDVDigitalAprobadas); 
            tableC54Detalle.addCell(headerC54BDVDigitalRechazadas);
            tableC54Detalle.addCell(headerC54BDVDigitalTotal);
            
            PdfPTable tableC54InternasDetalle = new PdfPTable(3);            
            tableC54InternasDetalle.addCell(headerC54BDVDigitalInternasAprobadas); 
            tableC54InternasDetalle.addCell(headerC54BDVDigitalInternasRechazadas);
            tableC54InternasDetalle.addCell(headerC54BDVDigitalInternasTotal);
            
            PdfPTable tableC54InterBancariasDetalle = new PdfPTable(3);            
            tableC54InterBancariasDetalle.addCell(headerC54BDVDigitalInterBancariasAprobadas); 
            tableC54InterBancariasDetalle.addCell(headerC54BDVDigitalInterBancariasRechazadas);
            tableC54InterBancariasDetalle.addCell(headerC54BDVDigitalInterBancariasTotal);
            
            
            //document.add(datatable);
            document.add(header);
            document.add(table2Cliente);            
            document.add(table);                                    
            document.add(new Paragraph(" "));            
            document.add(table2);            
            document.add(tableTransPorCanales);                        
            document.add(tituloLinea);                
            document.add(tituloHeaderCanal05);                
            document.add(new Paragraph(" "));
            document.add(tableC05);            
            document.add(tableTransPorCanales);                        
            document.add(new Paragraph(" "));            
            document.add(tableC05Internas); 
            document.add(tableTransPorCanalesInternas); 
            document.add(new Paragraph(" "));
            document.add(tableC05InteBancarias); 
            document.add(tableTransPorCanalesInternas); 
            document.add(tituloLinea);                
            document.add(tituloHeaderCanal14);                            
            document.add(new Paragraph(" "));
            document.add(tableC14); 
            document.add(tableC14Detalle); 
            document.add(new Paragraph(" "));
            document.add(tableC14Internas); 
            document.add(tableC14InternasDetalle); 
            document.add(new Paragraph(" "));
            document.add(tableC14InteBancarias); 
            document.add(tableC14InterBancariasDetalle);             
            document.add(tituloLinea);                
            document.add(tituloHeaderCanal54);  
            document.add(new Paragraph(" "));
            document.add(tableC54); 
            document.add(tableC54Detalle); 
            document.add(new Paragraph(" "));
            document.add(tableC54Internas); 
            document.add(tableC54InternasDetalle); 
            document.add(new Paragraph(" "));
            document.add(tableC54InteBancarias); 
            document.add(tableC54InterBancariasDetalle);
            document.close();
            return bos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
