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
import java.util.Vector;


import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LCAG extends JFrame implements ActionListener{
	
	JButton b1,b2;
	JavaPdfHelloWorld jpd;
	static JScrollPane scroll; 
	static int tableWidth = 0; 
	// set the tableWidth 
	static int tableHeight = 0; 
	// set the tableHeight 
	 JTable table; 
	DefaultTableModel model = null; 
	 static Vector data = new Vector();
	 static Vector headers = new Vector();
	 JPanel buttonPanel = new JPanel(); 
	 XSSFWorkbook  workbook;
	 XSSFSheet sheet;
	 static Vector d;
	 JComboBox d1=new JComboBox();
		//JTextField jt=new JTextField(10);
		JComboBox d2=new JComboBox();
	LCAG() throws FileNotFoundException, IOException
	{
		
		
	 
		
		//JLabel j1=new JLabel("ENTER AMOUNT");
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		add(d1);
		add(d2);
		//add(j1);
		//add(jt);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		 
		setSize(500,500); 
		  setLayout(new FlowLayout());
		 
		
		  workbook=new XSSFWorkbook(new FileInputStream("d:\\Book1.xlsx"));
		
		 sheet=workbook.getSheetAt(0);
		
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
		
		
		
		
		
		table = new JTable();
		table.setEnabled(false);
		table.setVisible(false);
		//d1.setVisible(true);
		//d2.setVisible(true);
		//setSize(500,500); 
		//setLayout(new FlowLayout());
		/*d1.setPreferredSize(new Dimension(200,50));
		d2.setPreferredSize(new Dimension(200,50));
		System.out.println("skvbsfgsfg");
		table = new JTable(); 
		table.setAutoCreateRowSorter(true); 
		model = new DefaultTableModel(data, headers);
		table.setModel(model); 
		table.setBackground(Color.pink);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); */
		/*table.setEnabled(false);
		table.setVisible(false);
		table.setRowHeight(25); 
		table.setRowMargin(4); 
		tableWidth = model.getColumnCount() * 150; 
		tableHeight = model.getRowCount() * 25;
		table.setPreferredSize(new Dimension( tableWidth, tableHeight)); 
		scroll = new JScrollPane(table); scroll.setBackground(Color.pink);
		scroll.setPreferredSize(new Dimension(300, 300)); 
		scroll.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		getContentPane().add(buttonPanel, BorderLayout.NORTH); 
		getContentPane().add(scroll, BorderLayout.CENTER);
		scroll.setVisible(false);
		//setSize(600, 600); 
		//setResizable(true); 
		setVisible(true); */
		
		

		
		
		

	}


	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			Object c1=d2.getSelectedItem();
			System.out.println(c1);
			/*scroll.setVisible(true);
			setVisible(true); 
			table.setEnabled(true);
			table.setVisible(true);*/
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			 //sheet = workbook.getSheetAt(1);
			sheet=workbook.getSheet(c1.toString());
	    	 XSSFRow row=sheet.getRow(0);
	    	 headers.clear();
	    	 
	    	 for (int i = 0; i <row.getLastCellNum(); i++) 
	    	 	{ 
	    		 	XSSFCell cell1 = row.getCell(i); 
	    		 	headers.add(cell1.toString());
	    	 	} 
	    	 
	    	 data.clear();
	    	
	    	 for (int j = 1; j < sheet.getLastRowNum() + 1; j++) 
	    	 {  Vector d = new Vector(); 

	    		 row=sheet.getRow(j);
	    		 int noofcols=row.getLastCellNum();
	    		 for (int i = 0; i <noofcols; i++) 
	    		 {		    			 
		    		 //To handle empty excel cells
	    			 XSSFCell cell=row.getCell(i, org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK );		    			 
	    			 System.out.println (cell.getCellType());		    			 
	    			 d.add(cell);
	    			 System.out.println(cell.toString());
	    		 		    		 
	    		 } 
	    		 d.add("\n"); 
	    		 data.add(d); 
	    	 } 
	    	   
	 		table.setAutoCreateRowSorter(true); 
	 		model = new DefaultTableModel(data, headers);
	 		table.setModel(model); 
	 		table.setBackground(Color.pink);
	 		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
	 		table.setEnabled(true);
	 		table.setVisible(true);
	 		table.setRowHeight(25); 
	 		table.setRowMargin(4); 
	 		tableWidth = model.getColumnCount() * 300; 
	 		tableHeight = model.getRowCount() * 25;
	 		table.setPreferredSize(new Dimension( tableWidth, tableHeight)); 
	 		scroll = new JScrollPane(table); scroll.setBackground(Color.pink);
	 		scroll.setPreferredSize(new Dimension(500, 500)); 
	 		scroll.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	 		scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
	 		getContentPane().add(buttonPanel, BorderLayout.NORTH); 
	 		getContentPane().add(scroll, BorderLayout.CENTER);
	 		scroll.setVisible(true);
	 		setSize(600, 600); 
	 		setResizable(true); setVisible(true); 
	 		b1.setEnabled(false);
			
		}
	 if(ae.getSource()==b2)
		{
			b1.setEnabled(true);
		 scroll.setVisible(false);
		 scroll.removeAll();
		 table.setEnabled(false);
	 		table.setVisible(false);
	 		table.removeAll();
	 		model.setRowCount(0);
	 		model.setColumnCount(0);
	 		model.removeTableModelListener(table);
	 		//d.clear();
	 	
		
		}
		
	}

		
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		LCAG bd=new LCAG();
		bd.setVisible(true);
		bd.setLocation(400,100);
		//bd.setVisible(true);
		//bd.setLocation(400,100);
			}



	
	

}

	
