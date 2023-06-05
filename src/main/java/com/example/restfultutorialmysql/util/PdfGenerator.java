package com.example.restfultutorialmysql.util;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class PdfGenerator {
    public ByteArrayOutputStream getPDF(String Date,String Time) {
        // Creamos la instancia de memoria en la que se escribirá el archivo temporalmente
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            Document document = new Document(PageSize.A4);
            Calendar calendario = new GregorianCalendar();
            String mes = "Febrero";
            Font fuenteTitulo = new Font();
            fuenteTitulo.setSize(6);
            Font negrita = new Font();
            negrita.setStyle(Font.NORMAL);
            
            Chunk titulo = new Chunk("TRANSACCIONES DE P2P");
            titulo.setUnderline(2f, -2f);
            titulo.setFont(fuenteTitulo);
            
            //Chunk titulo = new Chunk("TRANSACCIONES DE P2P");
            //titulo.setUnderline(2f, -2f);            

            Chunk fecha = new Chunk("" + calendario.get(Calendar.DATE) + " de " + mes + " de " + calendario.get(Calendar.YEAR));                        
            
            
            PdfPTable tabla = new PdfPTable(1);

            PdfPCell celda0 = new PdfPCell(new Phrase("REPORTE ESTADISTICO P2P DEL "+ calendario.get(Calendar.DATE) + " de " + mes + " de " + calendario.get(Calendar.YEAR)+""));
            PdfPCell celda1 = new PdfPCell(new Phrase("TRANSACCIONES DE P2P DESDE LAS 00:00:00 HASTA LAS 08:54:01"));
            
            tabla.addCell(celda0);
            tabla.addCell(celda1);
            // Asignamos la variable ByteArrayOutputStream bos donde se escribirá el documento
            PdfWriter.getInstance(document, bos);
            document.open();
            document.add(tabla);
            document.close();
            // Retornamos la variable al finalizar
            return bos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
