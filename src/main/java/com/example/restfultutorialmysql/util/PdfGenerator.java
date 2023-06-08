package com.example.restfultutorialmysql.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PdfGenerator {

    public ByteArrayOutputStream getPDF(String Date, String Time) {
        // Creamos la instancia de memoria en la que se escribirá el archivo temporalmente
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            Document document = new Document(PageSize.A4);
            Paragraph titulo = new Paragraph("REPORTE ESTADISTICOS P2P DEL 2023-05-02 \n\n",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.BLACK)
            );
            titulo.setAlignment(Element.ALIGN_CENTER);
            PdfPTable tabla = new PdfPTable(1);
            tabla.getDefaultCell().setBorder(Rectangle.NO_BORDER);
            tabla.addCell("Reporte Estadisticas de P2P del 2023-05-02");
            PdfWriter.getInstance(document, bos);
            document.open();
            document.add(titulo);            
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

            Font headFont = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            Font headFontCliente = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.WHITE);
            Font headFontClienteDetalles = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            
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
            
            
            datatable.addCell(header);
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
            
            
            PdfPTable table2 = new PdfPTable(1);            
            table2.addCell(headerTranPorCanal);            
            
            document.add(datatable);
            document.add(table);
            document.add(new Paragraph(" "));            
            document.add(table2);            
            document.add(tableTransPorCanales);            
            
            document.close();
            return bos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
