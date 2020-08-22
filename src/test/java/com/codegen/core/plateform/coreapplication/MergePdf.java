package com.codegen.core.plateform.coreapplication;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.PdfMerger;

public class MergePdf {

	public static final String SRC_PDF1 = "E:\\Development\\coreapplication\\src\\main\\resources\\GAS_1.pdf";
	public static final String SRC_PDF2 = "E:\\Development\\coreapplication\\src\\main\\resources\\GAS_2.pdf";
	public static final String MERGED_PDF = "E:\\Development\\coreapplication\\src\\main\\resources\\Merge_Pdf.pdf";

	public static void main(String[] args) throws IOException {
		PdfDocument pdfDoc = new PdfDocument(new PdfWriter(MERGED_PDF));
		PdfMerger merger = new PdfMerger(pdfDoc);
		PdfDocument PDF1 = new PdfDocument(new PdfReader(SRC_PDF1));
		PdfDocument PDF2 = new PdfDocument(new PdfReader(SRC_PDF2));
		merger.merge(PDF1, 1, PDF1.getNumberOfPages());
		merger.merge(PDF2, 1, PDF2.getNumberOfPages());

		PDF1.close();
		PDF2.close();
		pdfDoc.close();
	}
}
