package com.thymeleafpdf.controller;

import com.thymeleafpdf.service.CreatePdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetPdfController {
    @Autowired
    private CreatePdfFileService createPdfFileService;

    @GetMapping("pdf-file")
    public String getPdf(){
        return "getPdfFile";
    }

    @GetMapping("/create-pdf")
    public String pdfFile(){
        createPdfFileService.createPdf();
        return "redirect:pdf-file";
    }
}
