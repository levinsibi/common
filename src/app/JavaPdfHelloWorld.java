package app;



import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.hssf.util.HSSFColor.RED;
import org.apache.poi.ss.usermodel.Font;
 
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

 
public class JavaPdfHelloWorld
{
	public void create(String str) throws FileNotFoundException, DocumentException
	
	{
		Document doc=new Document();
		PdfWriter writer=PdfWriter.getInstance(doc, new FileOutputStream(str));
		doc.open();
		doc.add(new Paragraph("haiiiiiiiiiii"));
		doc.close();
		writer.close();
		
	}
   public static void main(String[] args) throws MalformedURLException, IOException, DocumentException
   {
      Document document = new Document();
      String strr="D:\\genetic.pdf";
      FileOutputStream fos=new FileOutputStream(strr);
      new JavaPdfHelloWorld().create(strr);
     
      try
      {
    	  //instance method is used to tracing the instance in your application. Which instance is running of the class.
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\HelloWorld.pdf"));
         document.setPageSize(PageSize.A4);
         document.setMargins(36, 72, 108, 180);
         document.setMarginMirroring(true);
         
         
         document.open();
         
         Image img=Image.getInstance("D:\\ibs.png");
         img.setAlignment(Element.TITLE);
         document.add(img);
         document.add(new Paragraph("\n\n\n\n\n"));
         Paragraph para=new Paragraph("\t\t\t A Hello World PDF document.\n");
         para.setAlignment(Element.ALIGN_CENTER);
         
         
         document.add(para);
         
         document.addTitle("LEVIS CREATIONS");
         
         //chapter will add new chapter/pages for a pdf document
         Chapter chapter1=new Chapter("New Life", 1);
         Chapter chapter2=new Chapter("Hectic",2);
         
         document.add(chapter1);
         
         String s="People are very Strange to understand";
         
         Paragraph p1=new Paragraph(s);
         document.add(p1);
         
         
         document.add(chapter2);
         
         
         document.close();
         writer.close();
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}