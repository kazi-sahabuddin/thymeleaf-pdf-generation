package com.thymeleafpdf.controller;

import org.springframework.stereotype.Controller;

@Controller
public class GetPdfController {
    public String getPdf(){
        return "getPdfFile";
    }
}
