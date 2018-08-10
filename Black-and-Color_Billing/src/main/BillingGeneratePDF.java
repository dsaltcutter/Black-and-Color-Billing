package main;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import java.io.FileOutputStream;

public class BillingGeneratePDF {

	public BillingGeneratePDF(String szamlanev) {
		
		Document szamla = new Document();
		szamla.setPageSize(PageSize.A4);
		
		try {
			PdfWriter.getInstance(szamla, new FileOutputStream("szamlak/" + szamlanev + ".pdf"));
			
			szamla.open();
			
			Paragraph head = new Paragraph("S Z � M L A",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD));
			head.setAlignment(Paragraph.ALIGN_CENTER);
			szamla.add(head);
			
			szamla.add(new Paragraph(" "));
			szamla.add(new Paragraph("BLACK & COLOR",FontFactory.getFont(FontFactory.HELVETICA_BOLD,24,Font.BOLD)));
			szamla.add(new Paragraph("Black & Color �zemeltet�si Kft."));
			szamla.add(new Paragraph("1126 Budapest, Kiss J�nos alt�bornagy utca 30/b. 7. em."));
			szamla.add(new Paragraph("Ad�sz�m: 24872177-2-43"));
			szamla.add(new Paragraph(" "));
			szamla.add(new Paragraph("Sz�mla",FontFactory.getFont(FontFactory.HELVETICA,20,Font.ITALIC)));
			szamla.add(new Paragraph("Budapest",FontFactory.getFont(FontFactory.HELVETICA,20,Font.BOLD,BaseColor.GRAY)));
			szamla.add(new Paragraph(" "));
			szamla.add(new Paragraph(" "));
			
			PdfPTable table = new PdfPTable(5);
			table.addCell(new Paragraph("Nyomtat�",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD)));
			table.addCell(new Paragraph("Sz�n",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD)));
			table.addCell(new Paragraph("Mennyis�g",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD)));
			table.addCell(new Paragraph("Egys�g�r",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD)));
			table.addCell(new Paragraph("�sszeg",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD)));
			
			table.addCell("Samsung123");
			table.addCell("Fekete");
			table.addCell("280");
			table.addCell("2 Ft");
			table.addCell("560 Ft");
			
			table.addCell("Samsung123");
			table.addCell("Sz�nes");
			table.addCell("150");
			table.addCell("10 Ft");
			table.addCell("1500 Ft");
			
			szamla.add(table);
			
			szamla.add(new Paragraph(" "));
			Paragraph sum = new Paragraph("V�g�sszeg:  2060 Ft",FontFactory.getFont(FontFactory.HELVETICA,14,Font.BOLD));
			sum.setAlignment(Paragraph.ALIGN_RIGHT);
			szamla.add(sum);
			szamla.add(new Paragraph(" "));
			szamla.add(new Paragraph("            ____________________                       ____________________"));
			szamla.add(new Paragraph("                      �rt�kes�t�                                            vev�"));
			
			szamla.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
