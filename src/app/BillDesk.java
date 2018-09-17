 package app;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Iterator;


import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BillDesk extends JFrame implements ActionListener{
	
	JButton b1;
	JavaPdfHelloWorld jpd;
	@SuppressWarnings("deprecation")
	BillDesk() throws FileNotFoundException, IOException
	{
		
		
	 
		JComboBox d1=new JComboBox();
		JTextField jt=new JTextField(10);
		JComboBox d2=new JComboBox();
		JLabel j1=new JLabel("ENTER AMOUNT");
		b1=new JButton("Submit");
		add(d1);
		add(d2);
		add(j1);
		add(jt);
		add(b1);
		b1.addActionListener(this);
		 
		setSize(500,500); 
		  setLayout(new FlowLayout());
		 
		
		XSSFWorkbook  workbook=new XSSFWorkbook(new FileInputStream("d:\\Book1.xlsx"));
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator=sheet.iterator();
		while(rowIterator.hasNext())
		{
			Row row=rowIterator.next();
			Iterator<Cell>cellIterator=row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell=cellIterator.next();
				d1.addItem(cell);
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_NUMERIC:System.out.print(cell.getNumericCellValue()+"\t\t");break;
				case Cell.CELL_TYPE_STRING:System.out.print(cell.getStringCellValue()+"\t\t");break;
				case Cell.CELL_TYPE_BOOLEAN:System.out.print(cell.getBooleanCellValue()+"\t\t");break;
				}
				
			}
			System.out.println("");
		}
XSSFSheet sheet2=workbook.getSheetAt(1);
		
		Iterator<Row> rowIterator1=sheet2.iterator();
		while(rowIterator1.hasNext())
		{
			Row row=rowIterator1.next();
			Iterator<Cell>cellIterator1=row.cellIterator();
			while(cellIterator1.hasNext())
			{
				Cell cell=cellIterator1.next();
				d2.addItem(cell);
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_NUMERIC:System.out.print(cell.getNumericCellValue()+"\t\t");break;
				case Cell.CELL_TYPE_STRING:System.out.print(cell.getStringCellValue()+"\t\t");break;
				case Cell.CELL_TYPE_BOOLEAN:System.out.print(cell.getBooleanCellValue()+"\t\t");break;
				}
				
			}
			System.out.println("");
		}
		
		
		
		
		Object c1=d1.getSelectedItem();
		System.out.println(c1);
		//d1.setVisible(true);
		//d2.setVisible(true);
		//setSize(500,500); 
		//setLayout(new FlowLayout());
		d1.setPreferredSize(new Dimension(200,50));
		d2.setPreferredSize(new Dimension(200,50));
		
		
		

		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			
		}
		
	}

		
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		BillDesk bd=new BillDesk();
		bd.setVisible(true);
		bd.setLocation(400,100);
		//bd.setVisible(true);
		//bd.setLocation(400,100);
			}



	
	

}

	
