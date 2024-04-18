package com.thymeleafpdf.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class CreatePdfFileService {

    public void createPdf(){
        String filePdfPath = "/sample.pdf";
        try{
            PdfWriter writer = new PdfWriter(filePdfPath);
            PdfDocument pdfDco = new PdfDocument(writer);
            Document doc = new Document(pdfDco);
            doc.close();
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
