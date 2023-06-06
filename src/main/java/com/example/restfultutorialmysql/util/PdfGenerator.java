package com.example.restfultutorialmysql.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PdfGenerator {

    public ByteArrayOutputStream getPDF(String Date, String Time) {
        // Creamos la instancia de memoria en la que se escribirá el archivo temporalmente
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            Document document = new Document(PageSize.A4);
            Calendar calendario = new GregorianCalendar();
            Paragraph p = new Paragraph();
            p.add("This is my paragraph 1");
            p.setAlignment(Element.ALIGN_CENTER);

            Paragraph p2 = new Paragraph();
            p2.add("This is my paragraph 2"); //no align

            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            PdfPTable tabla = new PdfPTable(4);
            tabla.getDefaultCell().setBorder(Rectangle.NO_BORDER);
            for (int i = 0; i < 15; i++) {
                tabla.addCell("celda " + i);
            }
// Asignamos la variable ByteArrayOutputStream bos donde se escribirá el documento
            PdfPTable tabla1 = new PdfPTable(4);
            tabla1.getDefaultCell().setBorder(Rectangle.NO_BORDER);

            for (int i = 0; i < 15; i++) {
                tabla1.addCell("celda " + i);
            }
            PdfWriter.getInstance(document, bos);
            document.open();
            document.add(tabla);
            document.add(tabla1);
            document.add(p);
            document.add(new Paragraph("This is my paragraph 3", f));
            document.add(new Paragraph("Esto es el primer párrafo, normalito"));
            document.add(new Paragraph("Este es el segundo y tiene una fuente rara",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.ITALIC, // estilo
                            BaseColor.CYAN)));             // color

            document.close();
            // Retornamos la variable al finalizar
            return bos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}