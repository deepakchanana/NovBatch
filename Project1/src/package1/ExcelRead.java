package package1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelRead 
{
	public void writeData() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../Project1/logindata2.xls");
		WritableWorkbook w=Workbook.createWorkbook(f);
		WritableSheet ws=w.createSheet("DC",0);
		for(int i=0;i<3;i=i+1)  // loop for rows
		{
			for(int j=0;j<3;j=j+1)
			{
				Label L=new Label(j, i,"Deepak");
				ws.addCell(L);
			}
		}
		w.write();
		w.close();
		
	}
  public void ReadData() throws BiffException, IOException
  {
	  File f=new File("../Project1/logindata.xls");
		 Workbook wk=Workbook.getWorkbook(f);
		 Sheet ws=wk.getSheet(0);
		 int r=ws.getRows();
		 int c=ws.getColumns();
		 for(int i=0;i<r;i=i+1)  // this is loop for rows
		 {
			 for(int j=0;j<c;j=j+1)  // loop for columns
			 {
				Cell c1=ws.getCell(j, i);
				System.out.println(c1.getContents());
			 }
		 }
	 
  }
  public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
	ExcelRead e=new ExcelRead();
	e.ReadData();
	e.writeData();
}
	
}
