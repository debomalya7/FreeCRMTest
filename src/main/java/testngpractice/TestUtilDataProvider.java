package testngpractice;

import java.util.ArrayList;


public class TestUtilDataProvider {
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("E:\\Projects\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\New Microsoft Excel Worksheet.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int rownum=2; rownum<=reader.getRowCount("Sheet1");rownum++) {
			
			String firstname = reader.getCellData("Sheet1", "firstname", rownum);
			String lastname = reader.getCellData("Sheet1", "lastname", rownum);
			String Email = reader.getCellData("Sheet1", "Email", rownum);
			String password = reader.getCellData("Sheet1", "password", rownum);
			
			Object ob[] = {firstname,lastname,Email,password};
			myData.add(ob);			
		}
		return myData;
	}

}
