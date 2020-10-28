package com.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class ComparePdfFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./pdfFiles/sadia_062120.pdf");		
		PDDocument document = PDDocument.load(file);		
		PDFTextStripper pdf = new PDFTextStripper();
		String text = pdf.getText(document);
	//	System.out.println(text);
		File file2 = new File("./pdfFiles/sadia_062120.pdf");
		PDDocument document2 = PDDocument.load(file2);
		PDFTextStripper pdf2 = new PDFTextStripper();
		String text2 = pdf.getText(document);
		if (text.equalsIgnoreCase(text2)) {
			System.out.println("Both files are Same");
		} else {
			System.out.println("Both files are different");
		}
	}

}
