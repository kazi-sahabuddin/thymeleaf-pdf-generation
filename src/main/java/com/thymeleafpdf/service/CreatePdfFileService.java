package com.thymeleafpdf.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class CreatePdfFileService {

    public void createPdf(){
        String filePdfPath = "/home/sahabuddin/IdeaProjects/sample.pdf";
        try{
            PdfWriter writer = new PdfWriter(filePdfPath);
            PdfDocument pdfDco = new PdfDocument(writer);
            Document doc = new Document(pdfDco);
            Paragraph p1 = new Paragraph("Hello, welcome to goja munna");
            doc.add(p1);
            doc.close();
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
