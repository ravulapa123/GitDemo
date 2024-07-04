package Seleniumdemo.SeleniumFrameworkDesign.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
	@Test(dataProvider="getData")
	public void Userid(String username,String password)
	{
		System.out.println("This block executes before each Test");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//i stands for number of times testcase should run
		//j stands for no of parametrs it should send for one go
		Object[][] data=new Object[3][2];
		data[0][0]="1abcd";
		data[0][1]="1xyz";
		
		data[1][0]="2abcd";
		data[1][1]="2xyz";
		
		data[2][0]="3abcd";
		data[2][1]="3xyz";
		return data;
	}

}
