import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.pdf.PdfWriter;

public class BillingGeneratePDF {

	public BillingGeneratePDF() {
		
		Document szamla = new Document();
		try {
			PdfWriter.getInstance(szamla, new FileOutputStream("szamlak/szamla.pdf"));
			
			szamla.open();
			Paragraph p1 = new Paragraph();
			p1.add("Itt jelenik meg a számla...");
			szamla.add(p1);
			szamla.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
